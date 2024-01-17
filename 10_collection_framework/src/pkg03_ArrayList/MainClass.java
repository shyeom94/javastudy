package pkg03_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainClass {

  /*
   * ArrayList 클래스
   * 1. 배열 리스트를 구현한 클래스이다.
   * 2. 실무에서는 배열 대신 사용한다.
   * 3. 배열의 특징을 그대로 가지고 있다.
   *    1) 순서대로 데이터가 저장된다.
   *    2) 인덱스(index) 가 있다.
   */
  
  /*
   * ArrayList 
   * 크기 제한이 없다. 
   */

  public static void method1() {
    
    // ArrayList 선언 (사용 가능 타입 : Collection<E>, List<E>, ArrayList<E>)
    List<Integer> numbers; // int[] numbers;
    
    // ArrayList 생성
    numbers = new ArrayList<Integer>(); // number = new int[10];
    
    // 요소 추가하기 
    numbers.add(5);
    numbers.add(4);
    numbers.add(3);
    numbers.add(2);
    numbers.add(1);
    
    // 요소 가져오기
    System.out.println(numbers.get(0));
    System.out.println(numbers.get(1));
    System.out.println(numbers.get(2));
    System.out.println(numbers.get(3));
    System.out.println(numbers.get(4));
    
  }

  public static void method2() {
  
    // ArrayList 선언 및 생성 
    List<String> hobbies = new ArrayList<String>();
    
    // 요소 추가하기
    hobbies.add("독서");
    hobbies.add("명상");
    hobbies.add("게임");
    hobbies.add("수영");
    hobbies.add("레고");
  
    // 저장된 요소의 개수
    System.out.println(hobbies.size());
    
    // * * * * * * * * * * * * * * * * * * * * * * * * *
    
    // for 문
    // for(int i=0; i<hobbies.size(); i++) { // hobbies.size() 는 동일한 값. 동일한 값을 계속 호출할 필요는 없다. => 이러면 안된다,,,!!
    for(int i=0, size = hobbies.size(); i<size; i++) { // 개선된 for 문
      // method 를 호출하는 것은 비용이 든다. 
      System.out.println(hobbies.get(i));
    } //

    // * * * * * * * * * * * * * * * * * * * * * * * * *

  }

  public static void method3() {

    // 배열을 ArrayList로 바꾸기
    // int[] => 안된다. 
    Integer[] arr = new Integer[] {10, 20, 30}; // 참조 타입 선언 
    
    // 배열을 ArrayList로 바꿔서 반환하는 Arrays 클래스의 asList 메소드 
    List<Integer> numbers = Arrays.asList(arr);
    
    // 주의사항
    // numbers 는 길이를 변경할 수 없다. (List 이기 때문에) 추가, 삭제 불가  
    System.out.println(numbers); // toString 메소드 생략되어있음. => 값만 확인하고 싶다면, for문 확인 안해도 된다. 
    // System.out.println(numbers.toString()); 

  }
  
  public static void method4() {
    
    List<String> seasons = new ArrayList<String>();
    
    seasons.add("봄");
    seasons.add("여름");
    seasons.add("물통"); // 삭제 필요 "물통" -> null
    seasons.add("피자"); // 수정 필요 "피자" -> "가을"
    seasons.add("겨울");
    
    // 요소 수정하기
    seasons.set(3, "가을");
    
    // 요소 삭제하기
    // 방법 2개 
    String removeItem = seasons.remove(2);
    System.out.println(removeItem);
    
    // 결과 확인 
    System.out.println(seasons);
   
  }
  
  public static void main(String[] args) {

    // method1();
    // method2();
    // method3();
    method4();

  }

}
