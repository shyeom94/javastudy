package pkg07_Throwable_method;

public class MainClass {

  public static void method1() {

    // 예외 메시지 확인하기 (기본 예외 메시지)

    try {

      // int a = 5 / 0;
      Integer.parseInt("12.5");

    } catch (ArithmeticException e) {

      System.out.println(e.getMessage());

    }

  }

  public static void method2() {

    // 예외 메시지 확인하기 (사용자 예외 메시지)

    try {

      int a = 5;
      int b = 0;

      if (b == 0) {
        throw new RuntimeException("0으로 나눌 수 없습니다"); // 출력될 예외 상황 발생 시 메시지
      }

      System.out.println(a / b);

    } catch (RuntimeException e) {
      System.out.println(e.getMessage());

    }

  }

  public static void method3() {

    // 예외 추적하기 : 개발할 때 사용 

    try {

      int[] numbers = new int[] { 1, 2, 3, 4, 5 };
      int total = 0;

      for (int i = 1; i <= 5; i++) {
        total += numbers[i];
      }

      System.out.println(total);

    } catch (Exception e) {

      System.out.println(e);

      e.printStackTrace(); // => 주로 사용하기 : 예외 추적 

    }

  }

  public static void main(String[] args) {

    // method1();
    // method2(); // 사용자 예외
    method3(); // 예외 추적하기

  }

}
