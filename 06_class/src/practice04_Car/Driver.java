package practice04_Car;

public class Driver {
  
  // field
  private String name;
  private int career;
  private boolean bestDriver; // career 가 10 이상이면 true.
  
  // 아무 필드도 초기화하지 않는 생성자
  public Driver() {
  }

  // 초기화하는 생성자 
  public Driver(String name, int career) {
    super();
    this.name = name;
    this.career = career;
    this.bestDriver = career >= 10;
  }

  // getter setter 
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getCareer() {
    return career;
  }

  public void setCareer(int career) {
    this.career = career; 
    this.setBestDriver(career >= 0); // 클래스 내부에서 호출하여 비교하기 
    
  }

  public boolean isBestDriver() {
    return bestDriver;
  }

  private void setBestDriver(boolean bestDriver) {
    this.bestDriver = bestDriver;
  }
  
  
  
  
}
