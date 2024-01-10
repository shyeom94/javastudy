package pkg08_access_modifier;

/*
 * Getter 
 * 1. 클래스의 필드값을 외부로 반환하는 메소드이다.
 * 2. get + 필드명으로 메소드이름을 결정해야 한다. (boolean 타입은 is + 필드명)
 */

/*
 * Setter
 * 1. 외부로부터 전달된 값을 필드에 저장하는 메소드이다. 
 * 2. set + 필드명으로 메소드이름을 결정해야 한다. 
 */

public class Computer {
  
  // field
  private String model;           // 초기값 : null 
  private int price;              // 초기값 : 0 
  private Calculator calculator; 
  
  // construct 
  public Computer(String model, int price, Calculator calculator) {
    this.model = model; // 필드와 매개변수 구분
    this.price = price;
    this.calculator = calculator;
  }

  // method
  public void setModel(String model) {
    this.model = model;
  }
  
  public void setPrice(int price) {
    this.price = price;
  }
  
  public void setCalculator(Calculator calculator) {
    this.calculator = calculator;
  }
  
  public String getModel() {
    return model; // this 굳이 안써도 된다. 
  }
  
  public int getPrice() {
    return price;
  }
  
  public Calculator getCalculator() {
    return calculator;
  }
  
}


