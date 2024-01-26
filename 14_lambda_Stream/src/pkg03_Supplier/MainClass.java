package pkg03_Supplier;

import java.util.function.Supplier; // Supplier 는 값을 반환하는 Lambda 를 전달하자. get 메서드 사용 

public class MainClass {
  /*
   * java.util.function.Supplier
   * 
   * 1. 형식 
   *    public interface Supplier<T> {
   *      T get();
   *    }
   * 2. 파라미터 X, 반환 O 형식의 get() 메소드를 지원하는 함수형 인터페이스이다.
   */
  public static void method1() {

    Supplier<String> supplier = () -> "Hello Lambda";
    System.out.println(supplier.get());

  }
  
  public static void method2(Supplier<String> supplier) {
    
    System.out.println(supplier.get());
    
  }
  
  // 예제) 호출할때마다 1 ~ 10 사이 난수를 출력하는 method3
  public static void method3(Supplier<Integer> supplier) { // int 사용할 수 없다. -> Intger 사용 

    System.out.println(supplier.get());

  }

  public static void main(String[] args) {
    
    // method1();
    
//    Supplier<String> supplier = () -> "Hello Lambda";
//    method2(supplier);
    
    //method2(() -> "Hello Lambda"); // 코드 생략한 것을 알아볼 수 있도록 하자.

    method3(() -> (int) (Math.random() * 10 + 1));

  }
}
