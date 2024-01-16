package pkg01_try_catch;
// 예외(Exception)

// 오류(Error)

// 예외처리(Exception Handling) : 프로그램이 비정상적으로 종료되는 것을 막기 위해
public class MainClass {

  public static void method1() {

    String userInput = "12.3"; // 예외가 발생하는 상황 : int -> long

    int number = Integer.parseInt(userInput);
    System.out.println(number);

  }

  public static void method2() {

    // 예외 처리 - try - catch

    try {

      String userInput = "12.3";

      int number = Integer.parseInt(userInput);
      System.out.println(number);

    } catch (NumberFormatException e) { // 파라미터 존재하는 catch 블록 : try 블록에서 발생할 예외 작성

      // 절 대 하지 말것 => "예외처리 catch 블록 비워두는 것" 
      System.out.println("정수만 입력하세요.");

    }

  }

  public static void main(String[] args) {

    // method1(); // 예외처리 하지 않음
    method2(); // 예외처리 함

  }
}
