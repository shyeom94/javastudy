package pkg02_loop;

public class Class02_for {

  public static void main(String[] args) {

    /*
     * for 1. 조건식을 만족하면 반복해서 실행한다. 2. 형식 for(초기 상태 ; 반복 조건 ; 상태 변화) { 실행문 }
     * 
     * 3. 실행 순서 초기상태(처음 한번만) -> 반복조건 -> (만족하면) 실행문 -> 상태변화 ... [ 반복 ]
     * 
     */

    // 1, 2, 3, 4, 5 출력하기
    for (int i = 1; i <= 5; i++) {
      System.out.println(i);
    }

    // n 번 반복하기
    int n = 5;
    for (int j = 0; j < n; j++) {
      System.out.println("반복");
    }

    // 중첩 for 문
    for (int day = 1; day <= 5; day++) {
      System.out.println(day + "일차 = ");
      for (int hour = 1; hour <= 8; hour++) {
        System.out.println(day + "교시");
      }
    }

  }

}
