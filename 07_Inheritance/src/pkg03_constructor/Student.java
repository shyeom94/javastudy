package pkg03_constructor;

/*
 * 자식 클래스의 생성자
 * 1. 반드시 부모 클래스를 가장 먼저 생성해야 한다. => 코드 순서!
 *    -> 부모 클래스의 생성자()를 호출해야 한다.
 * 2. 부모 클래스의 생성자를 호출하지 않는 경우, 
 *    -> JVM이 부모 클래스의 디폴트 생성자를 "자동"으로 호출한다.
 * 3. 부모 클래스에 디폴트 형식의 생성자가 없는 경우,
 *    -> 개발자가 직접 부모 클래스의 생성자를 호출해야 한다.  
 * 4. 부모 클래스의 생성자를 호출하는 방식
 *    super()
 */

public class Student extends Person {

  // field
  private String school;

  // constructor
  public Student() {
    super(null); // Person(null) 초기화를 안하기 위해 생성, 호출은 반드시 해야 함. 
  }
  
  public Student(String name) { // 매개변수 String name 추가
    super(name); // super 는 person 을 의미한다.
  }

  public Student(String name, String school) { // 매개변수 String name 추가
    super(name); // super 의 호출을 가장 먼저 할 것. 코드 순서 가장 먼저 호출해야 한다!
    this.school = school;
    // super(name); // 순서도 꼭 지켜야 함!
  }

  // method
  public String getSchool() {
    return school;
  }

  public void setSchool(String school) {
    this.school = school;
  }

}


