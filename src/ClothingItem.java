import java.time.LocalDate;

public class ClothingItem {

  private String name;
  private String fabricType;
  private String manufacturingCity;
  private LocalDate manufacturingDate;
  private int price;

  public ClothingItem(String name, String fabricType, String manufacturingCity,
      LocalDate manufacturingDate, int price) {
    this.name = name;
    this.fabricType = fabricType;
    this.manufacturingCity = manufacturingCity;
    this.manufacturingDate = manufacturingDate;
    this.price = price;
  }

  public String getName() {
    return name;
  }

  public String getFabricType() {
    return fabricType;
  }

  public String getManufacturingCity() {
    return manufacturingCity;
  }

  public LocalDate getManufacturingDate() {
    return manufacturingDate;
  }

  public int getPrice() {
    return price;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setFabricType(String fabricType) {
    this.fabricType = fabricType;
  }

  public void setManufacturingCity(String manufacturingCity) {
    this.manufacturingCity = manufacturingCity;
  }

  public void setManufacturingDate(LocalDate manufacturingDate) {
    this.manufacturingDate = manufacturingDate;
  }

  public void setPrice(int price) {
    this.price = price;
  }

  @Override
  public String toString() {
    return "ClothingItem{" +
        "name='" + name + '\'' +
        ", fabricType='" + fabricType + '\'' +
        ", manufacturingCity='" + manufacturingCity + '\'' +
        ", manufacturingDate=" + manufacturingDate +
        ", price=" + price +
        '}';
  }
}
