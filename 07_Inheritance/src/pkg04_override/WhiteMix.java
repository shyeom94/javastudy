package pkg04_override;

public class WhiteMix extends Kanu {
  /* 
   * 메소드 오버라이드  
   * 1. 자식 클래스가 부모 클래스의 메소드를 다시 만드는 것이다.
   * 2. 메소드 앞에 @Override annotation 을 추가한다. => 권장사항. 추가 하십시오. 
   * 3. 똑같이(반환타입, 메소드명, 매개변수) 만들어야 한다. -> JVM 이 문법 검사를 해줌. 똑같이 만들었는지 
   */

  @Override // 오버라이드한 메소드라고 JVM에게 알려준다.(부가적으로 다른 개발자에게도 알려준다.)
  public void color() {
    System.out.println("커피색"); // -> 다시 만들었다. 
  }
  
}


