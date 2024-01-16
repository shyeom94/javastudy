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
  
  // 예외처리 하기 
  
  // 1. method 마다 try - catch 넣기
  // 2. method 호출한 곳으로 예외 던지기 
  
  // 입금
  public void deposit(long money) { 
    // void 를 왜 썼지? deposit 이 별도의 리턴값을 요구하지 않으므로
    
    // 예외처리 필요
    try {
    
    if(money <= 0) {
      
      throw new RuntimeException(money + "원 입금 불가");
      
    }
    
    balance += money;
    
    } catch (RuntimeException e) {
      
      System.out.println(e.getMessage());
      
    }
    
  }
  
  // 출금
  public long withdrawal(long money) { // 오류 나는 이유 : try - return 예외 발생

    // 예외처리 필요
    long retValue = 0L; // 예외가 발생했을 때는 초기값 0 반환,

    try {

      if (money <= 0) {

        throw new RuntimeException(money + "원 출금 불가");

      }

      if (money > balance) {

        throw new RuntimeException("잔액 부족");

      }

      balance -= money;
      retValue = money; // 초기값 설정 

    } catch (RuntimeException e) {

      System.out.println(e.getMessage());

    }

    return retValue;

  }

  // 이체 (송금)
  public void transfer(BankAccount account, long money) {
  // 예외처리 필요 -> 필요없음, deposit(), withdrawal() 에서 각각 처리하고 있으므로 

    // 내 통장에서 출금 먼저 -> 출금 금액 반환 -> 상대방 통장에 입금
    
    // 내 통장에서 출금 
    // long a = withdrawal(money);
    // long b = this.withdrawal(money); 
        
    // 상대방 통장에 입금
    // account.deposit(a);
    
    account.deposit(withdrawal(money)); 
    
  }
  
}
