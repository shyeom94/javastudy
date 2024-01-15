package pkg07_polymorphism;

//Tv 와 Radio 의 부모 클래스 
public class Elec { // 업캐스팅의 문제점. 업캐스팅은 부모 타입의 메소드만 호출할 수 있다.
// => 08_Interface -> abstract 에 의해 추상화가 가능하다. 추상 메소드 
  public void powerOn() {
    System.out.println();
  }

}
