package practice03_Bus;

public class Person {
  
  // field
  private String name; // 사람별로 이름을 가질 수 있도록 
  
  // constructor
  public Person() {
    // 생성자 
  }
  public Person(String name) {
    super();
    this.name = name;
  }
  
  // method
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  
  
}
