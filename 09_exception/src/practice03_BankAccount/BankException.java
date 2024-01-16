package practice03_BankAccount;

public class BankException extends Exception {

  // field
  private int errorCode;

  // constructor
  public BankException(int errodCode) {
    super();
    this.errorCode = errodCode;
  }
  
  public BankException(String message, int errodCode) {
    super(message);
    this.errorCode = errodCode;
  }

  // method
  public int getErrorCode() {
    return errorCode;
  }

  public void setErrorCode(int errorCode) {
    this.errorCode = errorCode;
  }
  
}
