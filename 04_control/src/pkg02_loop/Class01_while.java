package pkg02_loop;

public class Class01_while {

  public static void main(String[] args) {
    
    /*
     * while
     * 1. 조건식을 만족하면 반복해서 실행한다. 
     * 2. 형식 
     *    while(조건식) {
     *      실행문
     *    }
     */
    
    // 1, 2, 3, 4, 5, 출력하기 
    
    int n = 1;      // 초기값 지정 
    
    while(n <=5) {  // 반복 조건
      System.out.println(n);
      n++;          // 상태 변화 
    }
    
    // while 문 3개 설정 필요 : 초기값, 반복조건, 상태변화  

    
    // 1 ~ 5 모두 더하기 
    // total 변수에 누적시키기  
    
    n = 1;          // 초기값 
    int total = 0;
    
    while(n <=5) {  // 반복 조건 
      total += n; 
      n++;          // 상태 변화 
    }
    
    System.out.println(total);
    
  }

}


