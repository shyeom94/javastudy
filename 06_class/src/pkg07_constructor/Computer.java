package pkg07_constructor;

public class Computer {
  
  // field
  String model; // 초기값 : null
  int price;    // 초기값 : 0
  Calculator calculator; 
  
  // construct 
  Computer() {
    System.out.println("Computer()");
  }
  
  // 생성자를 추가한다 : 객체 생성 방법을 추가한다.
  Computer(String _model, int _price) { // 받는 곳
    model = _model;
    price = _price;
  }
  
  Computer(String _model, int _price, Calculator _calculator) {
    model = _model;
    price = _price;
    calculator = _calculator;
  }
  
  // method
  void develop() {
    System.out.println(model + " 이용해서 개발중");
  }
  
  void danggun() {
    System.out.println(price / 100 * 60 + "원에 쿨거래" );
  }
  
  
  
}


