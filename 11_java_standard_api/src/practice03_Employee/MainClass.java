package practice03_Employee;

public class MainClass {

  public static void main(String[] args) {

    Company company = new Company("samsumg");

    new CompanyHandler(company).manage();

  }

}
