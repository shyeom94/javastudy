package pkg05_throw;

public class MainClass {
  public static void main(String[] args) {

    /*
     * throw 
     * 1. 직접 예외 객체를 만들어서 던질 때 사용한다. 
     * 2. 자바가 자동으로 던지지 않는 예외들은 throw 문으로 직접 던져야 한다.
     */

    // 점수에 따른 학점을 출력하는 코드
    try {

      int score = 70; // 값 범위 0 ~ 100 // => 자바는 예외를 던지지 못한다. -30 받아도 int 범위 내에 있으므로 정상으로 인식한다. 
      // => 직접 예외 객체 (new) 를 만들어서 예외처리를 한다. 
      char grade;
      
      if(score < 0 || score > 100) {
        throw new RuntimeException(); // catch 로 전달된다. 
                  // 인자 값
      }

      if (score >= 90)
        grade = 'A';
      else if (score >= 80)
        grade = 'B';
      else if (score >= 70)
        grade = 'C';
      else if (score >= 60)
        grade = 'D';
      else
        grade = 'F';

      System.out.println("점수 : " + score + "점, 학점 : " + grade + "학점");

    } catch (Exception e) { // 매개변수 Exception e 파라미터

      System.out.println("잘못된 점수입니다.");

    }

  }
}
