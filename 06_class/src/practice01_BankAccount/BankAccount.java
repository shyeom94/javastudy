package practice01_BankAccount;

public class BankAccount {

  // field
  private String accNo;
  private long balance;
  
  // constructor 생성자 
  public BankAccount() {
    this(null, 0);
  }
  
  public BankAccount(String accNo) {
    this(accNo, 0);
  }
  
  public BankAccount(String accNo, long balance) {
    super();
    this.accNo = accNo;
    this.balance = balance;
  }

  // method 메소드 
  public String getAccNo() {
    return accNo;
  }

  public void setAccNo(String accNo) {
    this.accNo = accNo;
  }

  public long getBalance() {
    return balance;
  }

  public void setBalance(long balance) {
    this.balance = balance;
  }
  
  ///////////////////////////////////////////////////
  
  // 입금
  public void deposit(long money) {
    if(money <= 0) {
      System.out.println(money + "원 입금 불가");
      return;
    }
    balance += money;
  }
  
  // 출금 
  public long withdrawal(long money) {
    if(money <= 0) {
      System.out.println(money + "원 출금 불가");
      return 0L;
    }
    if(money > balance) {
      System.out.println("잔액 부족");
      return 0L;
    }
    
    balance-= money;

    return money;
  }
  
  // 이체 (송금)
  public void transfer(BankAccount account, long money) {
    
    // 내 통장에서 출금 먼저 -> 출금 금액 반환 -> 상대방 통장에 입금
    
    // 내 통장에서 출금 
    // long a = withdrawal(money);
    // long b = this.withdrawal(money); 
    
    // 상대방 통장에 입금
    // account.deposit(a);
    
    account.deposit(withdrawal(money)); // 
    
  }
  
  
  
}
