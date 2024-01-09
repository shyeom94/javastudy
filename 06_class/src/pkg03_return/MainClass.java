package pkg03_return;

public class MainClass {

  public static void main(String[] args) {
    
    // Calculator 타입의 calculator 객체 선언 및 생성
    Calculator calculator = new Calculator();
    
    calculator.method1(); // 잘못된 호출이라고 볼 수 있음
    //반환값이 있을때는 메소드의 호출만 있으면 안된다!
    
    // 반환값을 사용할 수 있는 추가 코드가 필요하다.
    System.out.println(calculator.method1());
    System.out.println(calculator.method1() == 10 ? "10이 맞습니다." : "10이 아닙니다.");
    int a = calculator.method1();
    System.out.println(a);
    
    // int[] 반환 받기
    int[] arr = calculator.method2();
    
    for(int n : arr) {
      System.out.println(n);
    }
    
    for(int n : calculator.method2()) {
      System.out.println(n);
    }
    
    // Adder 객체 반환 받기 
    System.out.println(calculator.method3().add(1, 2, 3));
  }
}


