package practice04_Car;

public class MainClass {

  public static void main(String[] args) {

    // 클래스 입력값 오류 상황 처리
    
    // 생성자
    // Driver driver = new Driver("elsa", 20, false); // 따로따로 주다보니, 운전경력과 Best driver boolean 값에 영향을 줄 수 있다. 
    Driver driver1 = new Driver("Tom", 5); // 클래스에서 처리를 해준다.
    
    System.out.println(driver1.isBestDriver());
    
//============================================================================================================================  
    
    Driver driver2 = new Driver();
    
    driver2.setName("Jerry");
    driver2.setCareer(20);    // career 을 전달하면 값비교를 하자. setCareer 에서 값 비교  
    // driver2.setBestDriver(false); // setBestDriver 를 부르지 못하도록 한다. 남겨두고, 호출은 못하게 한다. public 을 -> private 으로 바꾼다. 
    
    System.out.println(driver2.isBestDriver());
    
//============================================================================================================================  
    
    Car car = new Car(driver1, 0, 100);
    car.enginStart();
    car.accelerator(5);
    car.brake(5);
    
  }

}


