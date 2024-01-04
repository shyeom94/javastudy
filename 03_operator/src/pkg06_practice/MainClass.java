package pkg06_practice;

public class MainClass {

  public static void method1() {
    // 산술 연산 문제 
    
    int second = 90;
    
    int m = second / 60; //  1 분
    int s = second % 60; // 30 초
    
    System.out.println(m);
    System.out.println(s);
    
  }
  
  public static void method2() {
    
    // x와 y의 값을 교환하기 
    int x = 10;
    int y = 20;
    int temp;  
    
    temp = x; // x    의 값을 temp 에 백업
    x = y;    // y    의 값을 x    에 백업
    y = temp; // temp 의 값을 y    에 백업
    
    // 스왑 
    
    System.out.println(x);  //  20
    System.out.println(y);  //  10
    
  }
  
  public static void method3() {
    
    // 점수가 90점대면 true, 아니면 false 
    int score = 90;
    
    System.out.println(score >= 90 && score < 100); // true or false

    // 10으로 나눈 몫이 9인 수 
    boolean result2 = (score / 10) == 9;
    
  }
  
  public static void method4() {
    
  // 짝수 홀수 판단 
  // 짝수 :  2로 나눠봤을 때, 나머지 값이 0인 수,     
  // 홀수 :  2로 나눠봤을 때, 나머지 값이 1인 수,     
    
    int n = 1254258;
    String judge = n % 2 == 1 ? "홀수" : "짝수";
    System.out.println(judge);
    
  }
  
  
  
  public static void main(String[] args) {

    // method1();
    // method2();
    method3();
    method4();
    
  }
}
