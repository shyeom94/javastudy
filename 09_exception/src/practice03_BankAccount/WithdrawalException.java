package practice03_BankAccount;

public class WithdrawalException extends BankException {

  // field 없다.

  // constructor 부모의 생성자 
  public WithdrawalException(int errodCode) {
    super(errodCode);
  }
  
  public WithdrawalException(String message, int errodCode) {
    super(message, errodCode);
  }
  
}


