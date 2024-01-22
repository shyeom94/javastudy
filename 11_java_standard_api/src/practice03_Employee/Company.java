package practice03_Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.management.RuntimeErrorException;

public class Company {

  // field
  private String name;
  private List<Employee> employees;
  // private Scanner sc;

  // constructor
  public Company(String name) {
    this.name = name;
    employees = new ArrayList<Employee>();
    // sc = new Scanner(System.in);

  }

  // method
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

//==============================================================================================================   

  // 고용
  public void hire(Employee employee) throws RuntimeException { // <- getEmployee()
    if (employee == null) {
      throw new RuntimeException("고용될 사원 정보가 올바르지 않습니다.");
    }
    // 사원번호 중복 체크 필요 -> 객체 간의 비교가 가능한 상황에서
    if (employees.contains(employee)) { // 객체 비교
      throw new RuntimeException("이미 등록된 사원 번호입니다.");
    }
    employees.add(employee);
  }

//==============================================================================================================     

  // 해고
  public void fire(int empNo) {
    if (employees.isEmpty()) {
      throw new RuntimeException("해고할 사원이 없습니다.");
    }
    // 해고 방식 - 번호를 받아와서 해고한다.
    for (int i = 0, size = employees.size(); i < size; i++) {
      // 삭제 방법
      // 1) 객체 오브젝트 전달하는 방법 // 방식 - 객체 간의 비교 => empNo equals @Override
      // 2) 인덱스 전달하는 방법 // 방식 - int 비교 => employees.get(i).getEmpNo() == empNo;
      // => 이 방법 사용 ... 삭제할 인덱스 알아오면 삭제하기 )
      if (employees.get(i).getEmpNo() == empNo) {
        employees.remove(i);
        break;
      }
    }
  }

//==============================================================================================================   

  // 조회
  public void search(int empNo) {
    if (employees.isEmpty()) {
      throw new RuntimeException("조회할 사원이 없습니다.");
      // 방식 - 객체 간의 비교 => empNo equals @Override
    }
    // 인덱스 사용하지 않고 객체 자체만으로 비교 => 향상 for 문 사용
    //Employee searchEmployee = new Employee(empNo, null); // 조회하고자 하는 사원, 객체로 만듦

    for (Employee employee : employees) {
      //if (employee.equals(searchEmployee)) {
        employee.info();
      //}
    }
  }

//==============================================================================================================   

  // 전체 조회
  public void searchAll() throws RuntimeException {
    if (employees.isEmpty()) {
      throw new RuntimeException("조회할 사원이 없습니다.");
    }
    System.out.println("전체 사원 명단");
    System.out.println("----------------");
    for (Employee employee : employees) {
      employee.info();
      System.out.println("----------------");
    }
  }
}
