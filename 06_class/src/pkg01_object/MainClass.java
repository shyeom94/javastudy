package pkg01_object;

public class MainClass {
  
  /*
   * 객체
   * 
   * 8가지 기본 타입 외에는 모두 객체 
   * 
   */
  
  /*
   * 클래스의 존재 목적
   * 
   * 1) 데이터 저장용 클래스 
   * 2) 기능 저장용 클래스 - 기능 : 메소드 method
   * 
   */
  
  public static void main(String[] args) {
    
    // 객체 선언 
    Calculator calculator;
    
    // 객체 생성 
    calculator = new Calculator();
    // - 클래스 멤버를 사용하기 위해서는 객체가 필요하다.
    
    // 객체를 이용해서 
    // 클래스의 멤버(필드, 메소드)를 사용할 수 있다.
    
    // 호출방법 : 객체.멤버
    calculator.number = 100;
    System.out.println(calculator.number);
    
    calculator.method();
    
  }
}


