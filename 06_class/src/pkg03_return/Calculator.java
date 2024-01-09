package pkg03_return;

public class Calculator {
  
  // 반환값 : 메소드 실행 결과값 
  // void   : 반환값이 없음 
  
  // int 반환 메소드
  int method1() { // 메소드가 준다. 
    return 10;
  }
  
  // int[] 배열을 반환하는 메소드
  int[] method2() {
    // int[] arr = {10, 20};
    // return arr;
    return new int[] {10, 20};
  }
  
  // Adder type 객체 반환 메소드
  Adder method3() {
    // Adder adder = new Adder(); 
    // return Adder;
    return new Adder();
  }
  
}


