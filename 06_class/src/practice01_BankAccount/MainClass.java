package practice01_BankAccount;

public class MainClass {

  public static void main(String[] args) {

    /////////////////////////////////////////////////////////////
    
    // 생성자 
    BankAccount account1 = new BankAccount();
    
    // Setter
    account1.setAccNo("01047353821");
    account1.setBalance(100000);
    
    // 생성자 
    BankAccount account2 = new BankAccount("01045673421", 50000);
    
    System.out.println(account1);
    System.out.println(account2);
    
    /////////////////////////////////////////////////////////////
    
    account1.deposit(100000); // 10만원 입금(성공)
    account1.deposit(-50000); // -5만원 입금(실패)
    
    long money;
    money = account1.withdrawal(100000); // 10만원 출금 (성공) 
    System.out.println(money);           // 100000      (출금된 금액 출력)
    money = account1.withdrawal(200000); // 20만원 출금 (실패) 
    System.out.println(money);           // 0           (출금된 금액 입력)
    
    /////////////////////////////////////////////////////////////

    account1.transfer(account2, 50000);  // accont1 -> account2, 50000원 이체 성공   (성공)
    account1.transfer(account2, 100000); // accont1 -> account2, 100000원 이체 성공  (실패)
    
    
    
  }
}


