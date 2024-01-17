package practice03_Club;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class MainClass {
  
  public static void method1() {
  
    Club club = new Club();
    
    Person p1 = new Person("1");
    Person p2 = new Person("2");
    Person p3 = new Person("3");
    Person p4 = new Person("4");
    Person p5 = new Person("5");
    
    System.out.println(System.identityHashCode(p5)); // 참조값 (메모리 주소)
    
    club.enterClub(p1); 
    club.enterClub(p2); 
    club.enterClub(p3); 
    club.enterClub(p4); 
    club.enterClub(p1); 
    club.enterClub(p3); 
    club.enterClub(p3); 
    club.enterClub(p4); 
    club.enterClub(p5); 
    club.enterClub(new Person("6")); 
    club.enterClub(new Person("6")); 
    
    club.leaveClub(p1);
    
    club.poolList();
  
  }
  
  //교집합
  public static void method2() {

    // 교집합
    Set<Integer> set1 = new HashSet<Integer>(Arrays.asList(1, 2, 3, 4, 5));
    Set<Integer> set2 = new HashSet<Integer>(Arrays.asList(4, 5, 6, 7, 8));

    // set1 이 교집합 결과로 "변환"된다.
    set1.retainAll(set2); // -> set1 = {4,5}

    System.out.println(set1);
  } 
  
  // 합집합
  public static void method3() {

    // 합집합
    Set<Integer> set1 = new HashSet<Integer>(Arrays.asList(1, 2, 3, 4, 5));
    Set<Integer> set2 = new HashSet<Integer>(Arrays.asList(4, 5, 6, 7, 8));

    // set1 이 교집합 결과로 "변환"된다.
    set1.addAll(set2); // -> set1 = {4,5}

    System.out.println(set1);
  } 
  
  // 차집합
  public static void method4() {

    // 차집합
    Set<Integer> set1 = new HashSet<Integer>(Arrays.asList(1, 2, 3, 4, 5));
    Set<Integer> set2 = new HashSet<Integer>(Arrays.asList(4, 5, 6, 7, 8));

    // set1 이 교집합 결과로 "변환"된다.
    set1.removeAll(set2); // -> set1 = {4,5}

    System.out.println(set1);
  } 

  public static void main(String[] args) {

    // method1(); // Club()
    method2(); // 교집합 
    method3(); // 합집합 
    method4(); // 차집합 

  }

}


