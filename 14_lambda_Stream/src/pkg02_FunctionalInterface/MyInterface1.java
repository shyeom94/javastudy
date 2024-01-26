package pkg02_FunctionalInterface;
// 1. 파라미터 X, 반환 X 

@FunctionalInterface
public interface MyInterface1 {
  void method();
  // void method2(); -> 메소드가 2개 있으면 오류 발생
}

/*
 * @FunctionalInterface
 * 1. 함수형 인터페이스에 추가하는 Annotation 이다.
 * 2. 오직 한개의 추상 메소드를 추가할 수 있다.
 * 3. 람다 표현식으로 객체를 생성할 수 잇는 인터페이스이다.
 */
