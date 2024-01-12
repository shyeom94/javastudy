package pkg03_constructor;

public class Person { // Person 에도 부모가 있다!

  // field
  private String name;

  // constructor -> 꼭 생성해야 한다
  public Person() {
    // 디폴트 생성자 => 아무것도 안만들었을 때, 사용한다.
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
