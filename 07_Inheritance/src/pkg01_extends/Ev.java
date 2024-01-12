package pkg01_extends;

// class 자식 extends 부모 { } -> 상속 
// class 서브 extends 슈퍼 { } 

public class Ev extends Car {

  public void charge() {
    // System.out.println(model); -> 부모 class 의 private 는 가져올 수 없다. (접근 불가)
    System.out.println(maker); // -> protected 는 접근 가능
    System.out.println("충전");

  }

}
