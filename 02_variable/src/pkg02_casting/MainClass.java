package pkg02_casting;

public class MainClass {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    
    /*
     * 기본 자료형 변환
     * 1. 자동 변환 (묵시적 형 변환)
     *    1) promotion
     *    2) 값의 도메인(domain : 값의 범위)이 작은 타입을 큰 타입으로 바꿀 때 동작한다. 
     *    3) byte -> short -> int -> long -> float -> double 표현할 수 있는 값의 범위 정수 -> 실수 
     * 2. 강제 변환 
     *    1) 캐스팅 casting - 시키면 한다. 
     *    2) 값의 도메인이 큰 타입을 작은 타입으로 바꿀 때 사용하면 좋다.
     *    3) 기타 필요에 의해서 강제 변환을 시킬 수 있다.  
     */
    
    // 자동 변환 -> 값 원본의 훼손이 없다. 
    int a = 100;
    long b = a;           // 자동 변환이 이뤄지는 곳
    double c = b + 1.5;   // 자동 변환이 이뤄지는 곳 (b 를 double 타입으로 자동 변환하고 더하기를 한다.)
    System.out.println(c); 
    
    // 강제 변환 
    long x = 256L;
    int y = (int)x;    // 변수 x를 강제로 int  타입으로 잠시 변환 
    byte z= (byte)y;   // 변수 y를 강제로 byte 타입으로 잠시 변환
    System.out.println(z);
    
    // 문자열의 변환 
    
    /*
     * 문자열을 Number 타입으로 변환하기 
     * 1. int 로 변환하기
     *    Integer.parseInt("1")     -> int type 1 반환 
     *    
     * 2. long 으로 변환하기 
     *    Long.parseLong("1")       -> long type 1 반환
     * 
     * 3. double 로 변환하기 
     *    Double.parseDouble("1.1") -> double type 1 반환
     * 
     * 잘못된 값을 전달하면 NumberFormatException 예외를 반환한다. 
     *    Integer.parseInt("백만원")
     * 
     */
    
    String s1 = "1";
    int n1 = Integer.parseInt(s1);
    
    long n2 = Long.parseLong(s1);
    
    System.out.println(n1);  // ctrl + alt 아래 방향키 : 복사
    System.out.println(n2); 
    
    String s2 = "1.1";
    double n3 = Double.parseDouble(s2);
    System.out.println(n3);

    String s3 = "십";
    int n4 = Integer.parseInt(s3); // 중요 !!!        
    System.out.println(n4);
 
  }
}
