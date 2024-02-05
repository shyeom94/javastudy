package practice03_Employee;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CompanyHandler {

  // field
  private Scanner sc;
  private Company company;

  // constructor
  public CompanyHandler(Company company) {
    sc = new Scanner(System.in);
    this.company = company;
  }

  // method

  // 사원 정보 입력
  private Employee getEmployee() throws InputMismatchException, RuntimeException {

    System.out.println("사원 타입 \n[1.정   규] \n[2.파   트] \n>>> ");
    String type = sc.next();

    System.out.println("사원번호 입력 >>> ");
    int empNo = sc.nextInt(); // 정수 입력 안할경우, 예외처리 필요
    System.out.println("사원명 입력 >>> ");
    String name = sc.next();

    switch (type) {
    case "1":
      System.out.println("연봉 입력 >>> ");
      return new Regular(empNo, name, sc.nextInt()); // 정수 입력 안할경우, 예외처리 필요
    case "2":
      System.out.println("시급 입력 >>> ");
      return new PartTime(empNo, name, sc.nextInt()); // 정수 입력 안할경우, 예외처리 필요
    default:
      throw new RuntimeException("잘못된 사원타입입니다."); //

    }
  }

  // 사원 번호 입력
  private int getEmpNo() throws InputMismatchException {

    System.out.println("사원번호 입력 >>> ");
    return sc.nextInt(); // 정수 입력 안할경우, 예외처리 필요

  }

  // 회사 관리
  public void manage() {

    System.out.println("===== 사원관리 프로그램 시작 =====");
    
    while (true) {

      try { 

        System.out.println("\n[1.고    용] \n[2.해    고] \n[3.조    회] \n[4.전체조회] \n[0.종    료] \n>>> ");
        String choice = sc.next();
        switch (choice) {
        case "1": // getEmployee() -> hire()
          company.hire(getEmployee());
          break;
        case "2": // getEmpNo() -> fire()
          company.fire(getEmpNo());
          break;
        case "3": // getEmpNo() -> search()
          company.search(getEmpNo());
          break;
        case "4": // searchAll()
          company.searchAll();
          break;
        case "0":
          System.out.println("===== 사원관리 프로그램 종료 =====");
          // break;
          return; // 종료
        default: // 잘못된 입력 -> 던지기
          throw new RuntimeException("잘못된 입력입니다."); // -> try 안의 throw 는 catch 가 받는다.

        }
      } catch (Exception e) {

        System.out.println(e.getMessage());

      }

    }

  }

}
