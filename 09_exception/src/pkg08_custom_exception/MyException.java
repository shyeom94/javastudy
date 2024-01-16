package pkg08_custom_exception;

/*
 * 사용자 예외 클래스
 * 1. java.lang.Exception 클래스를 상속한다.
 * 2. 클래스명은 Exception 으로 끝나는 것이 좋다.
 */

public class MyException extends Exception { // 예외 클래스 상속
// 만든 이유 : 예외 타입을 만듦.
  
  // field 
  private int errorCore;
  
  // constructor
  public MyException(String message, int errorCode) { // 에러 메시지, 에러 코드
    // 부모의 생성자를 불러서 메시지 전달하기
    super(message);  // public Exception(String message) {  } 생성자 호출
    this.errorCore = errorCode;
  }

  // method
  public int getErrorCore() {
    return errorCore;
  }

  public void setErrorCore(int errorCore) {
    this.errorCore = errorCore;
  }
  
  
  
}




