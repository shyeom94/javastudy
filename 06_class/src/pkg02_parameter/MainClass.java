package pkg02_parameter;

public class MainClass {
  
  /*
   * 함수   : 독립적인 기능을 수행하는 프로그램의 단위 
   * 메소드 : 클래스 내부에 작성한 함수. (기능)
   */
  
  public static void main(String[] args) {
    
    // 객체 선언 및 생성 
    pkg02_parameter.Calculator calculator = new Calculator(); 
    // 패키지 이름까지 호출하는 것이 원래, 하지만 생략할 수 있는 경우 - 같은 패키지에 있다면 생략 가능, 그리고 java.lang. 패키지 안에 저장된 클래스 
    
    // 메소드 호출
    calculator.method1(); // 주는 곳. 인수, 인자
    
    int a = 10;
    calculator.method2(a); //
    
    String str = "hello world";
    calculator.method3(str); //
    
    calculator.method4(1.5, 1.2);
    
    calculator.method5(a);
    
    // 가변 인자는 가변 매개변수로 처리
    calculator.method6(1);
    calculator.method6(1, 2);
    calculator.method6(1, 2, 3); 
    
    // 배열 인자
    int[] arr = {10, 20, 30}; 
    // 배열 중괄호 초기화는 선언부에서 가능
    calculator.method7(arr);
    //or
    calculator.method7(new int[] {10, 20, 30});
    
    // 객체 인자 
    // 객체를 만드려면 클래스 필요.
    
    // 1. Adder 타입의 adder 객체를 전달
    // Adder adder = new Adder(); -> 주는쪽과 받는쪽 
    // calculator.method8(adder);
    // 2. Adder 타입의 객체를 전달
    calculator.method8(new Adder()); // 객체를 만들어서 method8로 전달 
    
    
    
  }
}


