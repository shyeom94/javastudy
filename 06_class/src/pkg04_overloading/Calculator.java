package pkg04_overloading;

public class Calculator {
  
  /*
   * 메소드 오버로딩
   * 1. 동일한 클래스에 같은 이름의 메소드가 2개 이상 존재하는 것을 의미한다.
   * 2. 메소드 오버로딩 규칙 * * * 중요 
   *    1) 같은 이름의 메소드 
   *    2) 다른 parameter (개수 또는 타입) -> 리턴값 아님!!!
   */
  
  void add(Adder adder, int...params) {
    System.out.println(adder.add(params));
  }
 
  // 소수점 계산, 하나 더 
  void add(Adder adder, double...params) {
    System.out.println(adder.add(params));
  }
  
  //int add() { return 1; } 
  //double add() { return 1.5; } 
  
}


