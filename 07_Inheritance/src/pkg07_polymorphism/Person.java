package pkg07_polymorphism;

public class Person {

  public void powerOn(Elec elec) { // 업캐스팅된 Tv 와 Radio 의 powerOn() (전원을 켜는 기능)을 불러오기 위해
    // Elec elec = new Tv() 또는 Elce elec = new Radio()
    // elec.powerOn(); => 오류 

    // 1. 다운캐스팅으로 powerOn() 호출하기 -> 전자 제품이 추가될때마다 코드에 추가가 필요하므로 추천하지 않는다.
    // 다운캐스팅이 업캐스팅의 문제점을 해결하는 방식이다.
    //    if (elec instanceof Tv) {
    //      ((Tv) elec).powerOn();
    //    } else if (elec instanceof Radio) {
    //      ((Radio) elec).powerOn();
    //    }

    // 업캐스팅을 하면 부모에 있는 메소드만 호출할 수 있다. 
    
    /*
     * 2. Elec 에 powerOn() 메소드를 추가하고 Tv 나 Radio 가 오버라이드
     * 
     */
    
    elec.powerOn(); // 모든 서비스의 실행을 담당하는 코드 service.execute()
    
  }

}



