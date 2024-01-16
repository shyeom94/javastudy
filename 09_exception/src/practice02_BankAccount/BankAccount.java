package practice02_BankAccount;
// 예외 처리 - 메소드에서 안하기 
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
  public void deposit(long money) throws RuntimeException { 
    
    if(money <= 0) {
      throw new RuntimeException(money + "원 입금 불가"); // throw 는 메소드를 호출한 곳으로 던졌다.
    }
    balance += money;
  }
  
  ///////////////////////////////////////////////////
  
  // 출금 
  public long withdrawal(long money) throws RuntimeException {
    
    if(money <= 0) {

      throw new RuntimeException(money + "원 출금 불가"); 
      
    }
    
    if(money > balance) {

      throw new RuntimeException("잔액 부족"); 
      
    }
    
    balance-= money;
    return money;
    
  }
  
  ///////////////////////////////////////////////////
  
  // 이체 (송금)
  public void transfer(BankAccount account, long money) throws RuntimeException { // 예외 처리 필요하다.
    
    // 내 통장에서 출금 먼저 -> 출금 금액 반환 -> 상대방 통장에 입금
    
    // 내 통장에서 출금 
    // long a = withdrawal(money);
    // long b = this.withdrawal(money); 
    
    // 상대방 통장에 입금
    // account.deposit(a);
    
    account.deposit(withdrawal(money)); // 받는 곳 위치 => 받아서 다시 MainClass 쪽으로 던진다. 
    
  }
  
  
  
}
