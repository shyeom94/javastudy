package practice03_Employee;

public class Regular extends Employee {

  // field
  private int salary;

  // constructor
  public Regular(int empNo, String name) { // 사번, 이름 받아오는 Regular 클래스
    super(empNo, name);
    // TODO Auto-generated constructor stub
  }

  public Regular(int empNo, String name, int salary) { // 사번, 이름, 연봉 받아오는 Regular 클래스
    super(empNo, name);
    this.salary = salary;
  }

//public Regular() { // 디폴트 안만든다
//
//}

  // method
  public int getSalary() {
    return salary;
  }

  public void setSalary(int salary) {
    this.salary = salary;
  }

  @Override
  public void info() { // 부모 클래스의 info() 불러오기
    super.info();
    System.out.println("연봉 : " + salary);
  }

}
