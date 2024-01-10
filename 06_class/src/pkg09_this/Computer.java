package pkg09_this;

public class Computer {
  
  String model = "Gram"; // 초기화 
  int price;
  
  // this 의 활용
  // this() : 생성자를 호출하는 것 * * * 
  // this.멤버 : 멤버(필드, 메소드)를 호출하는 것.
  Computer() {
    this(null, 0);
  }
  
  Computer(String model) {
    this(model, 0);
  }
  
  // 어떤 객체를 생성하더라도, 모든 객체 생성을 담당한다. 
  Computer(String model, int price) {
    this.model = model;
    this.price = price;
  }
  
  
  public void showThis() {
    System.out.println(this); // 현재 객체(showThis() 메소드드를 호출한 객체)
  }
  
  public void showModel() {
    System.out.println(this.model); // 멤버(필드, 메소드)를 호출하는 것.
  }
  
  
  
}


