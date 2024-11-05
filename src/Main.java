import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Main class that demonstrates filtering, grouping, statistical analysis,
 * and price analysis of a list of clothes.
 */
public class Main {

  /**
   * Main entry point of the program.
   */
  public static void main(String[] args) {
    int N = 10;
    String cityToSkip = "Kyiv";

    // Generate and filter clothes
    List<ClothingItem> clothingItems = ClothingGenerator.generateClothingItems()
        .gather(new ClothingGatherer(N, cityToSkip))
        .limit(500)
        .toList();
    for (ClothingItem clothingItem : clothingItems) {
      System.out.println(clothingItem);
    }

    // Group clothes by their class
    Map<String, List<ClothingItem>> groupedClothingItems = clothingItems.stream()
        .filter(item -> item.getManufacturingDate().isAfter(LocalDate.now().minusMonths(60)))
        .collect(Collectors.groupingBy(ClothingItem::getFabricType));
    for (Map.Entry<String, List<ClothingItem>> entry : groupedClothingItems.entrySet()) {
      System.out.println(entry.getKey() + ": " + entry.getValue().size());
    }

    // Collect clothes statistics
    ClothingStatistics statistics = clothingItems.stream()
        .collect(new ClothingStatisticsCollector());
    System.out.println(statistics);

    // Analyze price distribution and identify outliers
    Map<String, Long> priceAnalysis = PriceAnalysis.analyzePrices(clothingItems);
    System.out.println(priceAnalysis);
  }
}
