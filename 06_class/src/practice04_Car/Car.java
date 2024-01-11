package practice04_Car;

public class Car {

  // static 처리하기

  // field
  private Driver driver;
  private int currSpeed;
  private int fuel;
  public final static int MAX_SPEED = 100;// 공개한다.

  public Car() {
  }

  public Car(Driver driver, int currSpeed, int fuel) {
    super();
    this.driver = driver;
    this.currSpeed = currSpeed;
    this.fuel = fuel;
    // static 은 빠진다.
  }

  // static 은 getter setter 을 할 필요가 없다.
  // 클래스 이름으로 호출. => Car.MAX_SPEED
  // static 은 static 답게 호출하기

  public Driver getDriver() {
    return driver;
  }

  public void setDriver(Driver driver) {
    this.driver = driver;
  }

  public int getCurrSpeed() {
    return currSpeed;
  }

  public void setCurrSpeed(int currSpeed) {
    this.currSpeed = currSpeed;
  }

  public int getFuel() {
    return fuel;
  }

  public void setFuel(int fuel) {
    this.fuel = fuel;
  }

  public void enginStart() {
    if (driver == null || fuel == 0) {
      System.out.println("시동 실패");
    } else {
      System.out.println("시동 성공");
    }

  }

  // 1초당 n 씩 속도가 증가하는 액셀. => 10 -> n  (bestDriver 는 10씩 증가, 아니면 5씩 증가)
  // 1초당 1 씩 연료가 줄어든다.
  public void accelerator(int pushTime) {

    if (currSpeed == MAX_SPEED) {
      System.out.println("이미 최고 속도입니다.");
      return;
    }

    if (fuel == 0) {
      System.out.println("연로가 없습니다.");
      return;
    }

    if (pushTime <= 0) {
      System.out.println("액셀을 잘 밟으세요.");
      return;
    }
    
    int n = driver.isBestDriver() ? 10 : 5; // 아래와 같다. 삼항연산자 
    
//    if (driver.isBestDriver()) {
//      n = 10;
//    } else {
//      n = 5;
//    }
    
    currSpeed += (pushTime * n);
//    if(currSpeed > MAX_SPEED) {
//      currSpeed = MAX_SPEED;
//    }
    currSpeed = Math.min(currSpeed, MAX_SPEED); // 위의 if 문과 같다.

    fuel -= pushTime;
    fuel = Math.max(fuel, 0); // fuel 값이 - 가 되지 않도록

    System.out.println("현재 연료량 : " + fuel + " 현재 속도 : " + currSpeed);

  }

  // 1초당 10씩 속도가 줄어드는 break
  public void brake(int pushTime) {

    if (currSpeed == 0) {
      System.out.println("이미 멈춰있습니다.");
      return;
    }
    
    if (pushTime <= 0) {
      System.out.println("액셀을 잘 밟으세요.");
      return;
    }
    
    currSpeed -= (pushTime * 10);
    currSpeed = Math.max(currSpeed, 0);
    
    System.out.println("현재 연료량 : " + fuel + " 현재 속도 : " + currSpeed);
    
  }

}


