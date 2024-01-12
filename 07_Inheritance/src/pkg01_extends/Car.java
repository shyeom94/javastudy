package pkg01_extends;

public class Car {

  private String model;   // private 는 자식 class 에 상속을 줄 수 없다.
  protected String maker; // protected 는 자식 class 가 상속받아 사용할 수 있다.

  public void forward() {
    System.out.println("전진");
  }

  public void reverse() {
    System.out.println("후진");
  }

  public void stop() {
    System.out.println("정지");
  }

}
