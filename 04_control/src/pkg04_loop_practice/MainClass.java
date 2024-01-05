package pkg04_loop_practice;

public class MainClass {

  public static void method1() {
    // 100 ~ 1 출력하기

    int a = 100;

    while (a >= 1) {
      System.out.println(a);
      --a;
    }

  }

  public static void method2() {
    // 5 ~ 20 사이 모든 정수의 평균 = (합계 / 개수)

    float b = 5; // 초기값
    float c = 0; // 정수 갯수 증가
    float total = 0; // 합 저장

    while (b <= 20) {
      total += b;
      b++;
      c++;
    }

    float avg = total / c;

    System.out.println(avg);

    // ===================================================================================

    // 유지보수에 용이한 코드 스타일

  }

  public static void method3() {

    // 3단 출력하기
    int dan = 3;

    for (int i = 1; i < 10; i++) {
      System.out.println(dan + " X " + i + " = " + dan * i);
    }
  }

  public static void method4() {

    // 70원씩 모금하기
    // 목표는 100000원 이상

    // 1회 모금액 70원
    // 2회 모금액 140원
    // 3회 모금액 210원
    // ...
    // n회 모금액 100000원 이상

    int money = 70;
    int total = 0; // 모금액
    final int GOAL = 100_000; // 목표 금액
    int nth = 0; // 모금 회차

    while (total < GOAL) {
      total += money;
      nth++;
      System.out.println(nth + "번째 모금액 " + total + "원");
    }

    for (int n = 1;; n++) {
      total = n * money;
      if (total > GOAL) {
        System.out.println(n + "번째 모금액");
        break;
      }
    }

  }

  public static void method5() {

    // 구구단
    outer: // 라벨 프로그래밍
    for (int i = 2; i < 10; i++) {
      for (int j = 1; j < 10; j++) {
        System.out.println(i + " X " + j + " = " + i * j);
        if (i == 5 && j == 5) { // 5 X 5 에서 끝내기
          break outer; // 안쪽 loop 에서 끝나지 않고 바깥쪽 loop 에서 끝내기
        }
      }
    }
  }

  public static void method6() {

    // 줄마다 구구단
    for (int i = 1; i < 10; i++) {
      for (int j = 2; j < 10; j++) {
        System.out.print(j + " X " + i + " = " + i * j + "\t");
      }
      System.out.println();
    }
  }

  public static void method7() {

    /*
     * 삼각별 출력하기-1 
     * 
     * star=12345 
     * 
     * row=1 * 
     * row=2 ** 
     * row=3 *** 
     * row=4 **** 
     * row=5 *****
     * 
     * row=1, star=1~1 
     * row=2, star=1~2 
     * row=3, star=1~3 
     * row=4, star=1~4 
     * row=5, star=1~5
     */

    for (int row = 1; row < 6; row++) {
      for (int star = 0; star < row; star++) {
        System.out.print("*");
      }
      System.out.println("");
    }
  }

  public static void method8() {

    /*
     * 삼각별 출력하기-2 
     * 
     * star=12345 
     * 
     * row=1 ***** 
     * row=2 **** 
     * row=3 *** 
     * row=4 ** 
     * row=5 *
     * 
     * row=1, star=1~5 
     * row=2, star=1~4 
     * row=3, star=1~3 
     * row=4, star=1~2 
     * row=5, star=1~1
     */

    // row=1~5, star=1~6 - row

    for (int row = 1; row <= 5; row++) {
      for (int star = 1; star <= 6 - row; star++) {
        System.out.print("*");
      }
      System.out.println("");
    }

  }

  public static void method9() {

    /*
     * 삼각별 출력하기-3 
     * 
     * space/star=123456789 
     * 
     * row=1     * 
     * row=2    *** 
     * row=3   ***** 
     * row=4  *******
     * row=5 *********
     * 
     * row=1, space=1~4, star=5~5 
     * row=2, space=1~3, star=4~6 
     * row=3, space=1~2, star=3~7 
     * row=4, space=1~1, star=2~8 
     * row=5, space=1~0, star=1~9
     * 
     * row=1~5, / space=1~5-row / star=6-row~row+4
     * 
     */

    for (int row = 1; row <= 5; row++) {
      for (int space = 1; space <= 5 - row; space++) {
        System.out.print(" ");
      }
      for (int star = 6 - row; star <= row + 4; star++) {
        System.out.print("*");
      }
      System.out.println("");
    }
  }

  public static void method10() {

    /*
     * 삼각별 출력하기-4 
     * 
     * space/star=123456789 
     * 
     * row=1 ********* 
     * row=2  ******* 
     * row=3   *****
     * row=4    *** 
     * row=5     *
     * 
     * row=1, space=1~0, star=1~9 
     * row=2, space=1~1, star=2~8 
     * row=3, space=1~2, star=3~7 
     * row=4, space=1~3, star=4~6 
     * row=5, space=1~4, star=5~5
     * 
     * row=1~5 space=1~row-1 star=row~10-row
     */
    
    for(int row=1; row <= 5; row++) {
      for(int space=1; space <= row-1; space++) {
        System.out.print(" ");
      } for (int star = row; star <= 10 - row ; star++ ) {
        System.out.print("*");
      }
      System.out.println(" ");
    }
  }

  public static void main(String[] args) {
    // method1();
    // method2();
    // method3();
    // method4();
    // method5();
    // method6();
    // method7();
    // method8();
    // method9();
    // method10();
  }
}
