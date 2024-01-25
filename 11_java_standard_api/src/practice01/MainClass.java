package practice01;

import java.security.SecureRandom;
import java.time.LocalDate;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.UUID;

public class MainClass {

  public static void method1() { // 파일명 만들기 

    // 형식 : 하이픈이 제거된 UUID + 밑줄 + 타임스탬프. 확장자

    String fileName = "apple.jpg";

    // 확장자 떼기
    // lastindexOf // 확장자를 뗄 때는 마지막 마침표의 위치
    String extName = fileName.substring(fileName.lastIndexOf(".")); // 마지막 마침표의 index 
    // 문자열 자르기 시작할 인덱스의 위치 -> "." 의 인덱스 위치부터 문자열을 자른다. 
    // String extName = ".jpg";

    StringBuilder builder = new StringBuilder();  // 문자열 + => StringBuilder append() 사용

    // 파일 이름 바꾸고 합치기 
    builder.append(UUID.randomUUID().toString().replace("-", "")); // UUID 의 "-" 문자열을 ""() 없애기 
    builder.append("_"); // 다음 문자열 "_"
    builder.append(System.currentTimeMillis()); // 타임스탬프 붙이기 
    builder.append(extName); // 뗀 확장자 ".jpg" 문자열 붙이기 

    // 최종 결과물 출력 
    System.out.println(builder.toString());

  }

  public static Map<String, Object> method2(String id) {
    
    // 나이 구하기 + 성별 구하기 
    // 나이 : 현재년도 - 태어난년도
    // 성별 : 하이픈 뒤의 숫자가 1 or 3 이면 남자, 2 or 4 이면 여자 // => 홀수 or 짝수 
    
    // 현재 년도 -> 2024 출력 
    int nowYear = LocalDate.now().getYear();
        
    // 태어난 년도 
    int birthYear = 0;
    
    // 하이픈 뒤의 숫자 - 남 여 구분 
    int afterHyphen = Integer.parseInt(id.substring(7,8));
    
    // - 뒤의 숫자가 1, 2 일 경우 1900년대 생,
    //               3, 4 일 경우 2000년대 생,    
    switch(afterHyphen) {
    case 1 : 
    case 2 : 
      // 앞의 두자리 숫자로 년도 구분
      birthYear = 1900 + Integer.parseInt(id.substring(0, 2)); 
      break;
    
    case 3 : 
    case 4 : 
      // 앞의 두자리 숫자로 년도 구분
      birthYear = 2000 + Integer.parseInt(id.substring(0, 2)); 
      break;
    }
    
    String[] genders = {"여자", "남자"}; // 홀수 -> 남자, 짝수 -> 여자  
    
    
    return Map.of("age"   , nowYear - birthYear
                , "gender", genders[afterHyphen % 2]);
    
  }
  
  public static void method3() { // 각 나라별 수도 퀴즈 

   Map<String, String> map = Map.of("프랑스"  , "파리"
                                  , "독일"    , "베를린"
                                  , "이탈리아", "로마"
                                  , "스위스"  , "베른"
                                  , "영국"    , "런던");

    Scanner sc = new Scanner(System.in);
    
    String question = " 수도는? >>> ";
    
    // 정답 갯수 
    int correct = 0;
    
    for(Entry<String, String> entry : map.entrySet()) { // 향상 for 문 
      System.out.println(entry.getKey() + question);
      String answer = sc.next();
      if (answer.trim().equals(entry.getValue())) {    // trim() -> 문자열 앞뒤 공백제거
        correct++;
      }
    }
      
    System.out.println(correct + "개 정답 성공");
    sc.close();
    
    // 프랑스 수도는? >>> 
    // 파리
    // 스위스 수도는? >>> 
    // 베른
    // 영국 수도는? >>> 
    // 런던
    // 독일 수도는? >>> 
    // 베를린
    // 이탈리아 수도는? >>> 
    // 로마
    // 5개 정답 성공
    
  }

  public static void method4() { // 통장에서 출금하기 
    
    // 랜덤 금액을 balance 에서 차감, 차감 후에 출금 횟수 증가 
    // 5000원이 있는 통장(balance)에서 랜덤하게 출금하기
    
    int balance = 5000; // 잔고 금액

    int count = 0; // 출금 횟수

    while (balance > 0) {
      // 발생시킬 난수 : 1 <= 난수 < balance
      int money = (int) (Math.random() * balance + 1); // 1부터 balance 만큼
      count++;
      System.out.println("출금 전 " + balance + "원, " + count + "회 출금액 " + money + "원, 출금 후 " + (balance -= money) + "원");
    }
    
    // 실행예시)
    // 출금 전 5000원,  1회 출금액 2917원, 출금 후 2083원
    // 출금 전 2083원,  2회 출금액 1961원, 출금 후 122원
    // 출금 전 122원,   3회 출금액 102원,  출금 후 20원
    // 출금 전 20원,    4회 출금액 2원,    출금 후 18원
    // 출금 전 18원,    5회 출금액 17원,   출금 후 1원
    // 출금 전 1원,     6회 출금액 1원,    출금 후 0원
    
  }
  
  public static void method5() { // 윷놀이 

    // 0번째 index 공백인 이유 -> 인덱스를 전진하는 값으로 사용 가능
    String[] yuts = { "", "도", "개", "걸", "윷", "모" };
   
    StringBuilder builder = new StringBuilder();    
    int move = 0; // 첫 시도는 0회 째
    
    int totalMove = 0; // 총 이동 횟수
    
    do {
      move = (int)(Math.random() * 5 + 1); // 일단 처음 한번 무조건 던져보고,
      totalMove += move;
      
      builder.append(yuts[move]);
      builder.append(", ");
      
    } while(move >= 4); // , 윷이나 모가 나왔을 경우, 반복문 한번 더 하기 
    
    builder.append(totalMove).append("칸 이동한다.");
    
    System.out.println(builder); // 출력까지 
   
    // 실행예시1) "도", 1칸 이동한다.
    // 실행예시2) "개", 2칸 이동한다.
    // 실행예시3) "걸", 3칸 이동한다.
    // 실행예시4) "윷", "도", 5칸 이동한다.
    // 실행예시5) "모", "윷", "도", 10칸 이동한다.

  }
  
  public static void method6() { // 임의의 인증번호 만들기 
    
    // SecureRandom을 이용해 "대문자+소문자+숫자"로 구성된 임의의 인증번호 만들기
    // 실행예시1)
    //   몇 자리의 인증번호를 생성할까요? >>> 4
    //   생성된 4자리 인증번호는 7W5e입니다.
    // 실행예시2)
    //   몇 자리의 인증번호를 생성할까요? >>> 6
    //   생성된 6자리 인증번호는 Fa013b입니다.
    
    Scanner sc = new Scanner(System.in);
    System.out.println("몇자리의 인증번호를 생성할까요? >>> ");
    int count = sc.nextInt(); // 입력받은 자리 수 
    SecureRandom secureRandom = new SecureRandom();
    StringBuilder sb = new StringBuilder();
    for(int n = 0; n < count; n++) {
      double randomNumber = secureRandom.nextDouble(); // 0.0 <= randomNumber < 1.0
      // 정수 대문자 소문자 발생 확률 : 33% 33% 34%
      if(randomNumber < 0.33) {
        sb.append(secureRandom.nextInt(10));
      } else if(randomNumber < 0.66) {
        sb.append((char)secureRandom.nextInt(26) + 'A');
      } else {
        sb.append((char)secureRandom.nextInt(26)+ 'a');
      }
    }
    String code = sb.toString();
    System.out.println("생성된 " + count + "자리 인증번호는 " + code + "입니다.");
    sc.close();
  }
  
  public static void method7() { // UpDown 게임 
    // 컴퓨터가 1 ~ 10000 사이의 난수를 발생시킨다.
    // 사용자는 해당 난수를 맞힌다.
    // 실행예시)
    // 입력 >>> 5000
    // Down!
    // 입력 >>> 2500
    // Up!
    // ...
    // 입력 >>> 4500
    // 정답입니다. 총 5번만에 성공했습니다.
    
    Scanner sc = new Scanner(System.in);
    int goal = (int) (Math.random() * 10000) + 1; // 발생된 난수. 랜덤한 값
    int input = 0; // 사용자가 입력한 값
    int nth = 0; // 사용자가 입력한 횟수
    do {
      System.out.println("입력 >>> ");
      input = sc.nextInt();
      nth++;
      if (goal == input) {
        System.out.println("정답은 " + goal + "이었습니다. " + nth + "번만에 성공했습니다.");
      } else if (goal > input) {
        System.out.println("Up!");
      } else {
        System.out.println("Down");
      }
    } while (goal != input);
    sc.close();
  }
  
  public static void method8() { // 빈도수 그래프 
    
    // 0~9 사이 난수를 100개 발생시키고 발생한 난수들이 생성된 횟수(빈도수)를 그래프화 하여 출력하시오.
    
    // 주사위 던지기
    // 실행예시)
    // 0 : #### 4
    // 1 : ############ 12
    // 2 : ############ 12
    // 3 : ##### 5
    // 4 : ######## 8
    // 5 : ########### 11
    // 6 : ############ 12
    // 7 : ################## 18
    // 8 : ####### 7
    // 9 : ########### 11
    
    int[] numbers = new int[100]; // 100개 난수
    int[] frequency = new int[10]; // 0~9까지 생성된 정수 빈도의 그래프 문자열을 배열로 저장 

    // 100개의 0~9까지 랜덤한 빈도 발생 
    for (int i = 0; i < numbers.length; i++) {
      numbers[i] = (int) (Math.random() * 10);
      frequency[numbers[i]]++;
    }

    // 
    for (int i = 0; i < frequency.length; i++) {
      StringBuilder sb = new StringBuilder();
      // 
      for (int n = 0; n < frequency[i]; n++) {
        // append 로 # 횟수만큼 저장 
        sb.append('#');
      }
      
      String graph = sb.toString();
      System.out.println(i + " : " + graph + " : " + frequency[i]);
      
    }

  }
  
  public static void method9() { // 숫자 빙고판 섞기 
    
    // 5 x 5 숫자 빙고판 자동 생성
    // 지시사항)
    //   1. 1 ~ 25 사이 정수를 2차원 배열 bingo 에 순차적으로 넣는다.
    //      1  2  3  4  5
    //      6  7  8  9 10
    //     11 12 13 14 15
    //     16 17 18 19 20
    //     21 22 23 24 25
    //   2. 25번 서로 섞는다.
    //      순차적으로        랜덤하게
    //      모든요소접근      접근
    //      ----------------------------
    //      bingo[0][0]  <->  bingo[1][4]
    //      bingo[0][1]  <->  bingo[0][2]
    //      bingo[0][2]  <->  bingo[2][1]
    //      ...
    //      bingo[4][4]  <->  bingo[3][1]
    //
    // 실행예시)
    //  10  9  4 25  2
    //  15  3 13 21  1
    //  14 20 11 19  6
    //   8 17  5 12  7
    //  16 22 18 24 23
    //========================================================
    // 빙고판 크기 선언 
    final int SIZE = 5;
    // 빙고판 생성 
    int[][] bingo = new int[SIZE][SIZE];
    // 순서대로 초기화. 1~25 까지 올바르게 숫자 넣기 
    for (int i = 0; i < SIZE; i++) {
      for(int j = 0; j < SIZE; j++) {
        bingo[i][j] = (i * SIZE) + (j + 1);
      }
    }
    //========================================================
    // 순서대로 넣어진 빙고판 랜덤하게 섞기 
    for(int i = 0; i < SIZE; i++) {
      for(int j = 0; j < SIZE; j++) {
        //bingo[i][j] 와 bingo[x][y] 서로 교환
        //랜덤한 index x, y 생성
        int x = (int) (Math.random() * SIZE);
        int y = (int) (Math.random() * SIZE);
        int temp; // 임시 값 저장. 교환을 위해.
        
        temp = bingo[i][j];
        bingo[i][j] = bingo[x][y];
        bingo[x][y] = temp;
        
      }
    }
    //========================================================
    // 섞어진 빙고판 출력하기
    for(int i = 0; i < SIZE; i++) {
      for(int j = 0; j < SIZE; j++) {
        System.out.print(String.format("%3d", bingo[i][j]));
      }
      System.out.println();
    }
  }
  
  public static void main(String[] args) {

//    method1(); // UUID 파일이름 만들기 
//    Map<String, Object> map = method2("140101-3123456");
//    // map 을 for 문으로 돌려서 확인하기
//    for (Entry<String, Object> entry : map.entrySet()) {
//      System.out.println(entry.getKey() + ": " + entry.getValue());
//    }
//    method3(); // 수도 퀴즈  
//    method4(); // 랜덤하게 통장 출금하기     
//    method5(); // 윷놀이
//    method6(); // 인증 코드 만들기 
//    method7(); // UpDown 게임
//    method8(); // 빈도수 그래프 그리기 
    method9(); // 빙고 섞기

  }

}
