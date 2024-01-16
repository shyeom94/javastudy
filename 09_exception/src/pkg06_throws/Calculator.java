package pkg06_throws;

public class Calculator {

  public void addition(int a, int b) {
    System.out.println(a + " + " + b + " = " + (a + b));
  }

  public void subtraction(int a, int b) {
    System.out.println(a + " - " + b + " = " + (a - b));
  }

  public void multiplication(int a, int b) {
    System.out.println(a + " * " + b + " = " + (a * b));
  }

  /*
   * throws
   * 1. method 에서 발생한 예외를 method 를 호출한 곳으로 던질 때 사용한다. 
   * 2. 2개 이상의 예외를 던질 수 있다. 
   * 3. method 를 호출한 곳에서는 예외 처리 코드가 추가되어야 한다. 
   */
  public void division(int a, int b) throws ArithmeticException { // => int b 가 0이 되지 않도록 예외 처리 필요, 
    System.out.println(a + " / " + b + " = " + (a / b));
  } // => try - catch 필요한 메소드 

}


