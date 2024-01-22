package practice03_Employee;

import java.util.Objects;

public class Employee {

  // field
  private int empNo;
  private String name;

  // constructor
  public Employee() {
  }

  public Employee(int empNo, String name) {
    super();
    this.empNo = empNo;
    this.name = name;
  }

  // method
  public int getEmpNo() {
    return empNo;
  }

  public void setEmpNo(int empNo) {
    this.empNo = empNo;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void info() { // 사원 조회, 전체 조회
    System.out.println("사원번호 : " + empNo);
    System.out.println("사원명 : " + name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(empNo); // 번호가 같으면 true
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Employee other = (Employee) obj;
    return empNo == other.empNo;
  }

}
