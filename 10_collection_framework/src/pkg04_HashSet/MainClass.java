package pkg04_HashSet;

import java.util.HashSet;
import java.util.Set;

public class MainClass {
  
  public static void method1() {
  
    // HashSet 타입 선언
    Set<String> hobbies;
    
    // HashSet 객체 생성
    hobbies = new HashSet<String>();
    
    // 요소 추가하기 (순서 없이 저장되고, * * * 중복 저장이 불가능하다. * * *)
    hobbies.add("테니스");
    hobbies.add("테니스");
    hobbies.add("테니스");
    hobbies.add("탁구");
    hobbies.add("당구");
    hobbies.add("당구");
    hobbies.add("축구");
    hobbies.add("테니스");
    hobbies.add("당구");
    hobbies.add("명상");
    hobbies.add("풋살");
    hobbies.add("축구");
    
    // 요소 하나씩 꺼내기 위한 for 문 -> index 가 없다
    // advanced for 문 -> 알아서 하나씩 빼주는 for 문
    for(String hobby : hobbies) {
      System.out.println(hobby);
    }

  }

  public static void method2() {
    
    
    
  }
  
  public static void main(String[] args) {
    
    // method1();
    method2();
    
  }

}
