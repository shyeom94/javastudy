package pkg06_downcasting;

public class MainClass {

  public static void main(String[] args) {

    /*
     * 다운캐스팅 Downcasting 
     * 1. (업캐스팅 된)부모 타입의 객체를 자식 타입으로 바꿀 수 있다. 
     * 2. 강제로 변환해야 한다. -> 시키면 무조건 한다.
     * 3. 잘못된 캐스팅의 우려가 있다. instanceof 연산자를 사용할 수 있다.
     */

    // 업캐스팅된 부모 타입의 자식 객체
    Computer computer = new Tablet();

    // 다운캐스팅
    
    // Tablet 타입으로 변환 / 부모 타입을 자식 타입으로 바꾼다 (강제로)
//    ((Tablet) computer).screenTouch();
//    ((Tablet) computer).portable();
    
    // Tablet 타입으로 변환 
    if(computer instanceof Tablet) { // 잘못된 캐스팅을 방지하기 위한
      ((Tablet) computer).screenTouch();
      ((Tablet) computer).portable();
    }    
    
    // => 업캐스팅 때문에 못부르면 다운캐스팅하면 된다. 
    
    // Object 클래스를 활용할 때 다운캐스팅 사용
  
    // 잘못된 다운캐스팅 (Wearable 타입으로 변환) - ClassCastException
    ((SmartWatch) computer).wearble(); // 오류는 나지 않는다. 예외는 나온다.
    
  }

}


