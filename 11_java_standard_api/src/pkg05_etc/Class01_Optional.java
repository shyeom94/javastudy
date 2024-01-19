package pkg05_etc;

import java.util.Optional;

public class Class01_Optional {

  public static void main(String[] args) {

    // Optional<T> : T 타입의 데이터를 감싸는 클래스

    // 1. null 값이 없는 데이터
    String str1 = "사과";
    Optional<String> opt1 = Optional.of(str1); // Optional 로 감싼다.
    System.out.println(opt1.get());            // Optional 을 깐다.

    // 2. null 값이 있는 데이터 (배우는 목적)
    String str2 = null;
    Optional<String> opt2 = Optional.ofNullable(str2); // 2023년 공기 팔아요. 
    System.out.println(opt2.orElse("바나나")); // 바나나 출력 -> 깔 때 null 이면 "바나나" 출력 
    // => 목록 보기 할 때 사용한다. 페이징 처리 
    
  }

}
  