package pkg05_HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MainClass {
  
  // Mutable 객체 (값이 변할 수 있는 객체)
  
  public static void method1() {
  
    /*
     * HashMap
     * 1. 객체(인스턴스)를 대신할 수 있는 자료구조이다.
     * 2. 구성
     *    1) Key   : 데이터 식별자, HashSet 으로 구성되어 있다. (순서 없고, 중복 없다.)
     *    2) Value : 데이터 자체 
     *    3) Entry : Key 와 Value 를 합쳐서 부르는 말이다.
     */
    
    // HashMap 선언        => 대부분 이렇게 사용한다. 
    Map<String, Object> book;
    
    // HashMap 생성
    book = new HashMap<String, Object>();
    
    // Key, Value 추가 (Entry 추가)
    book.put("title", "어린왕자");
    book.put("author", "생텍쥐베리");
    book.put("isBestSeller", true);
    book.put("price", 10000);
    
    // Key 를 이용해서 Value 확인하기 
    System.out.println("제목 : " + (book.get("title")));
    System.out.println("저자 : " + (book.get("author")));
    // System.out.println("베스트셀러 : " + (book.get("isBestSeller"))); 
    System.out.println("베스트셀러 : " + ((boolean) book.get("isBestSeller") ? "베스트셀러" : "일반서적") ); // - value 가 Object => Casting 하자  
    System.out.println("가격 : " + (book.get("price")) + "원");
    
  }
  
  public static void method2() {
     
    // Immutable 객체 (값을 바꿀 수 없는 객체) - 값의 변조를 막기 위해서. 전달할 때. 안전하게 전달

    // 인자값과 파라미터 사이 
    
    Map<String, Object> map = Map.of("name", "김철수");
    
    // 값을 바꾸려는 시도
    // map.put("age", 10);
    
    System.out.println(map.get("name"));
    
  }

  public static void method3() {
  
  // Key 는 Set 으로 구성되어 있다.
  
    Map<String, Object> map = Map.of("name", "김철수"
                                    , "age", 10
                                    , "isMarried", false);
    
    Set<String> keys = map.keySet();
    
    for(String key : keys) {
      System.out.println(key + ": " + map.get(key)); // 코드 보고 해석할 줄 알자. key 와 그에 맞는 value 불러오기 
    }
    
  }
  
  public static void method4() {
    
    // Entry 전체를 Set 로 만들 수 있다.
    
    Map<String, Object> map = Map.of("name", "김철수"
                                    , "age", 10
                                    , "isMarried", false);
    
    Set<java.util.Map.Entry<String, Object>> entrySet = map.entrySet();
    for(Entry<String, Object> entry : entrySet) {
      
      System.out.println(entry.getKey() + ": " + entry.getValue());    
    }
    
  }
  
  public static void method5() {
    
    Map<String, Object> map = new HashMap<String, Object>();
    
    // 처음 입력되는 Key 는 추가된다.
    map.put("name", "홍길동");
    map.put("age", 10);
    map.put("isMArried", false);
    
    // 다시 입력되는 Key 는 수정을 의미한다.
    map.put("age", 20);
    
    // 삭제
    map.remove("isMarried");
    
    // 확인
    System.out.println(map);
  }
  
  
  
  public static void main(String[] args) {
    
    //method1();
    //method2();
    //method3();
    //method4();
    method5();
    
  }

}
