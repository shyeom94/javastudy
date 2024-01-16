package pkg01_try_catch;
// 예외(Exception) vs 오류(Error)

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

  public static void method3() {

    String[] userInputs = { "10", "23435", "34.43", "23.564", "324413", "77244" }; // int number 안에 들어갈 수 없는 34.43 

    for (int i = 0; i < userInputs.length; i++) {

      try {

        int number = Integer.parseInt(userInputs[i]);

        System.out.println(number);

      } catch (NumberFormatException e) { // 예외처리했기 때문에 반복문이 배열의 끝까지 돌았다.

        System.out.println(userInputs[i] + "는 정수가 아닙니다.");

      }

    }

  }

  public static void method4() {
    // 다중 catch 블록
    // String[] userInputs = { "10", "23435", "34.43", "23.564", "324413", "77244" }; // NumberFormatException 예외를 불러오기 위한 배열 
    String[] userInputs = { "10", "23435", "23564", "324413", "77244" };

    try {
      
      //for (int i = 0; i < userInputs.length; i++) { // for 문이 try-catch 문 안에 있다 -> method3 과 순서가 다름 -> 예외 발생 시, 멈춘다.
         for (int i = 0; i < 6; i++) { // => index 6까지 반복문이 진행하는 ArrayIndexOutOfBoundsException 예외 발생 
        int number = Integer.parseInt(userInputs[i]);
        System.out.println(number);

      }

    } catch (NumberFormatException e) {
    //} catch (RuntimeException e) { // -> Throwable 상속 관계를 이해하고 catch 처리를 할 것 
      
      System.out.println("정수만 처리할 수 있습니다. ");

    } catch (ArrayIndexOutOfBoundsException e) {
      
      System.out.println("사용할 수 없는 index 가 사용되었습니다. ");
      
    } 
    
    // 주의점 -> Throwable 상속 관계를 이해하고 catch 처리를 할 것 

    // 다중 캐치 블록은 상속 관계에 따라서 순서가 달라질 수 있다. 
    
  }

  public static void main(String[] args) {

    // method1(); // 예외처리 하지 않음
    // method2(); // 예외처리 함
    // method3(); // 반복문 배열 안에서 예외처리
    method4(); // 다중 catch 블록

  }
}
