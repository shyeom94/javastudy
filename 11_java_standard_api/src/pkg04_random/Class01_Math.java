package pkg04_random;

public class Class01_Math {

  public static void main(String[] args) {

    /*
     * Math.random()                      (0.0 이상 1.0 미만) 의 난수 발생
     * 
     */

    // 5% 확률로 "대박"
    if (Math.random() < 0.05) {
      System.out.println("대박");
    } else {
      System.out.println("대박은 무슨");
    }
    
    /*
     * Math.random() 
     * Math.random() * 5                  (0.0 이상 5.0 미만) 의 난수 발생 
     * (int)(Math.random() * 5)           (0   이상 5   미만) 의 난수 발생 
     * (int)(Math.random() * 5 + 1)       (1   이상 6   미만) 의 난수 발생    // 캐스팅 형 변환
     * 
     */
    
    // 주사위 던지기
    int dice = (int) (Math.random() * 6 + 1);     // 1부터 6개의 수 중 하나가 발생한다. 
    System.out.println("주사위의 눈은 " + dice + "입니다.");
    
    // 웹 개발에서 인증코드 등의 난수값 생성할 때 사용 
    
    
    
  }

}
