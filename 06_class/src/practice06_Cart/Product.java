package practice06_Cart;

public class Product {
  
  // field 
  private String name;    // 상품 이름 
  private int price;      // 상품 가격 
  
  // constructor
  public Product() {
    // 기본 생성자
  }

  public Product(String name, int price) {
    super();
    this.name = name;
    this.price = price;
  }

  // method
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getPrice() {
    return price;
  }

  public void setPrice(int price) {
    this.price = price;
  }
  
  
  
}
