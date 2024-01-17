package pkg04_HashSet;
import java.util.Arrays;
// Set 집합 
import java.util.HashSet;
import java.util.Set;

public class MainClass {
  
  public static void method1() {
  
    // HashSet 타입 선언
    Set<String> hobbies;
    
    // HashSet 객체 생성
    hobbies = new HashSet<String>();
    
    // Set<String> hobbies = new HashSet<String>();
    
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
    // => advanced for 문 : 알아서 하나씩 빼주는 for 문
    for(String hobby : hobbies) {
      System.out.println(hobby);
    }

  }

  //교집합 retainAll
  public static void method2() {

    // 교집합
    Set<Integer> set1 = new HashSet<Integer>(Arrays.asList(1, 2, 3, 4, 5));
    Set<Integer> set2 = new HashSet<Integer>(Arrays.asList(4, 5, 6, 7, 8));

    // set1 이 교집합 결과로 "변환"된다.
    set1.retainAll(set2); // -> set1 = {4,5}

    System.out.println(set1);
  } 
  
  // 합집합 addAll
  public static void method3() {

    // 합집합
    Set<Integer> set1 = new HashSet<Integer>(Arrays.asList(1, 2, 3, 4, 5));
    Set<Integer> set2 = new HashSet<Integer>(Arrays.asList(4, 5, 6, 7, 8));

    // set1 이 교집합 결과로 "변환"된다.
    set1.addAll(set2); // -> set1 = {4,5}

    System.out.println(set1);
  } 
  
  // 차집합 removeAll()
  public static void method4() {

    // 차집합
    Set<Integer> set1 = new HashSet<Integer>(Arrays.asList(1, 2, 3, 4, 5));
    Set<Integer> set2 = new HashSet<Integer>(Arrays.asList(4, 5, 6, 7, 8));

    // set1 이 교집합 결과로 "변환"된다.
    set1.removeAll(set2); // -> set1 = {4,5}

    System.out.println(set1);
  } 

  public static void main(String[] args) {
    
    // method1();
    // method2(); // 교집합 
    // method3(); // 합집합 
    method4(); // 차집합     
  }

}
