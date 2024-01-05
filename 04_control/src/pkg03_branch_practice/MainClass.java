package pkg03_branch_practice;

public class MainClass {

  public static void method1() {
    
    // 월에 따른 계절 출력하기
    int month = 12;
    String season;
    
    if(month > 2 && month < 6) {             // 3 4 5
      season = "봄";
    } else if(month > 5 && month < 9) {      // 6 7 8
      season = "여름";
    } else if(month > 8 && month < 12){      // 9 10 11    
      season = "가을";
    } else {                                 // 12 1 2 
      season = "겨울";
    } 
    
    System.out.println(season);
    
    int mod = month % 12; 
    // 나머지 
    // 0  1  2  겨울
    // 3  4  5  봄
    // 6  7  8  여름
    // 9  10 11 가을
    
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
    
    // ===================================================
    
    // 합격 점수 
    int pass = 0;
    if(grade >= 1 && grade <=3) {
      pass = 60;
    } else if(grade >= 4 && grade <= 6) {
      pass = 70;
    }
    
    // 합격 / 불합격 
    String result = null;
    if (score >= pass) {
      result = "합격";
    } else {
      result = "불합격";
    }
    
  }
  
  public static void method3() {
    
    // 4일은 목요일, n 일 후는 무슨 요일?
    
    int day = 4;      // 4일은 목요일
    int nDay = 0;    // nDay일 후
    String weekName;  // 요일 (월~일)
    
    // day 의 nDay 일 후
    day += nDay;
    
    // day 를 7로 나눈 나머지
    int mod = day % 7;
    
    if ((day + nDay) % 7 == 1) {
      weekName = "월";
    } else if ((day + nDay) % 7 == 2) {
      weekName = "화";
    } else if ((day + nDay) % 7 == 3) {
      weekName = "수";
    } else if ((day + nDay) % 7 == 4) {
      weekName = "목";
    } else if ((day + nDay) % 7 == 5) {
      weekName = "금";
    } else if ((day + nDay) % 7 == 6) {
      weekName = "토";
    } else {
      weekName = "일";
    }
    
    System.out.println(weekName);
    
  }
  
  public static void method4() {
    
    // 문자열 비교 
    
    // 메뉴에 따른 가격 저장하기 
    
    // 아메리카노 : 1000원
    // 카페라떼   : 2000원
    // 밀크티     : 3000원
    // 기타       : 5000원
    
    String order = "카페라떼";
    int price = 0;
    
    switch (order) { 
    case "아메리카노" : 
      price = 1000;
      break;
    case "카페라떼" : 
      price = 2000;
      break;
    case "밀크티" : 
      price = 3000;
      break;
    default: 
      price = 5000;
      break;
    }
    
    System.out.println(order + " 주문받았습니다. 가격은 " + price + "원 입니다.");
    
  }
  
  public static void main(String[] args) {
    //method1();
    //method2();
    //method3();
    method4();
  }
}

