package pkg04_Consumer;

import java.util.function.Consumer;

public class MainClass {
  /*
   * java.util.function.Consumer
   * 
   * 1. 형식
   *    public interface Consumer<T> {
   *      void accept(T t);
   *    }
   * 2. 파라미터 O, 반환 X 형식의 accept() 메소드를 지원하는 함수형 인터페이스이다.
   */
  public static void method1() {
                          // 변수 이름 적기
    Consumer<String> consumer = (name) -> System.out.println(name + "님");
    consumer.accept("박상훈");
  }

  public static void method2(Consumer<String> consumer) { // 이 방식으로 하자. 
    consumer.accept("최상훈");
  }

  public static void main(String[] args) {
    
    method1();
    method2((name) -> System.out.println(name + "님")); // 전달할 값 : 람다 식 (Consumer 에 맞는)
    
  }
}
