package practice03_BankAccount;

public class DepositException extends BankException {

  // field 가 필요없다.

  // * * * 자식을 만들땐 부모의 constructor(생성자) 호출 필수 * * *
  public DepositException(int errodCode) {
    super(errodCode);
  }

  public DepositException(String message, int errodCode) {
    super(message, errodCode);
  }
    
}
