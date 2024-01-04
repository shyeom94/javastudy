package pkg03_branch_practice;

public class MainClass {

  public static void method1() {
    
    // 월에 따른 계절 출력하기
    int month = 12;
    
    if(month > 2 && month < 6) {             // 3 4 5
      System.out.println("봄");
    } else if(month > 5 && month < 9) {      // 6 7 8
      System.out.println("여름");
    } else if(month > 8 && month < 12){      // 9 10 11    
      System.out.println("가을");
    } else {                                 // 12 1 2 
      System.out.println("겨울");
    } 
        
  }
  
  public static void method2() {
    
    // 점수와 학년에 따른 합격 여부
    // 1~3학년 : 60점 이상이면 합격, 아니면 불합격
    // 4~6학년 : 70점 이상이면 합격, 아니면 불합격
    
    int score = 60;  // 점수
    int grade = 1;   // 학년
    
    if (grade <= 3 && score >= 60) {
      System.out.println("합격");
    } else if (grade <= 6 && score >= 70) {
      System.out.println("합격");
    } else {
      System.out.println("불합격");
    }
  }
  
  public static void method3() {
    
    // 4일은 목요일, n 일 후는 무슨 요일?
    
    int day = 4;      // 4일은 목요일
    int nDay = 10;    // nDay일 후
    String weekName;  // 요일 (월~일)
    
    if ((day + nDay) % 7 == 1) {
      System.out.println("금");
    } else if ((day + nDay) % 7 == 2) {
      System.out.println("토");
    } else if ((day + nDay) % 7 == 3) {
      System.out.println("일");
    } else if ((day + nDay) % 7 == 4) {
      System.out.println("월");
    } else if ((day + nDay) % 7 == 5) {
      System.out.println("화");
    } else if ((day + nDay) % 7 == 6) {
      System.out.println("수");
    } else {
      System.out.println("목");
    }
    
  }
  
  public static void main(String[] args) {
    method1();
    method2();
    method3();
  }
}

