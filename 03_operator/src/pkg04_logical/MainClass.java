package pkg04_logical;

public class MainClass {

  public static void main(String[] args) {
    
    /*
     *  논리 연산
     *  1. boolean 타입의 값을 이용한 연산이다. 
     *  2. 종류 
     *    1) && : 논리 AND, 두 항이 모두 true 이면 true, 나머지는 false 반환
     *    2) || : 논리  OR, 두 항 중 하나라도 true 이면 true 나머지 경우는 false 반환 
     *    3) !  : 논리 NOT, 전달된 항이 true 이면 false 반환 (반대 값을 반환) 
     *    4)  
     */
    
    /*
     * 숏 서킷 Short circuit
     * 1. 연산 결과의 빠른 처리를 위한 동작이다. 동작 원리 
     * 2. 종류
     *    1) && : false 가 반환되면 최종 결과도 false 이므로 더 이상 동작하지 않는다.
     *    2) || : true  가 반환되면 최종 결과도 true  이므로 더 이상 동작하지 않는다.
     */ 
    
    boolean a = true  && true;  // true 
    boolean b = true  && false; // false 
    boolean c = false && true;  // false -> 어차피 false 인데? 
    boolean d = false && false; // false -> 어차피 false 인데? 
    System.out.println(a);
    System.out.println(b);
    System.out.println(c);
    System.out.println(d);
    
    int n1 = 10;
    int n2 = 20;
    
    boolean a1 = n1 == 10 && n2 == 20;
    boolean b1 = n1 == 10 && n2 == 10; // false 
    
    boolean c1 = n1 == 20 && ++n2 == 20;  // false
    System.out.println(n2); // -> 20  *** 더 이상 동작하지 않는다. *** 

    boolean d1 = n1 == 20 && n2++ == 20; // false
    System.out.println(n2); // -> 20  *** 더 이상 동작하지 않는다. *** 

    // 숏 서킷에 의해 코드가 실행되지 않는다. 
    
    System.out.println(a1);
    System.out.println(b1);
    System.out.println(c1);
    System.out.println(d1);
    
    //================================================================================
    
    boolean f = n1 == 10 || n2 == 20;
    boolean g = n1 == 10 || n2 == 10;
    
    boolean f1 = n1 == 10 || n2++ == 20; // n1 == 10 이 true 이므로 n2++ == 20은 실행되지 않는다. 
    boolean g1 = n1 == 10 || ++n2 == 10; // n1 == 10 이 true 이므로 ++n2 == 20은 실행되지 않는다. 
    
    System.out.println(f);
    System.out.println(g);
    
    System.out.println(n2);
    System.out.println(f1);

    System.out.println(n2);
    System.out.println(g1);
    
    //================================================================================
    
    boolean h = !(n1 == 10);
    System.out.println(h);
    
  }
}



