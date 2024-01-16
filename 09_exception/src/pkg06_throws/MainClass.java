package pkg06_throws;

public class MainClass {

  public static void main(String[] args) {

    int a = 5;
    int b = 0;

    try {
      Calculator calculator = new Calculator();

      calculator.addition(a, b);
      calculator.subtraction(a, b);
      calculator.multiplication(a, b);
      calculator.division(a, b); // 예외 발생, 호출한 곳에서 예외처리 코드가 필요하다.
      // 예외 처리를 호출한 곳에서 하라.

    } catch (ArithmeticException e) {

      System.out.println("산술 연산 예외가 발생했습니다.");

    }

  }

}
