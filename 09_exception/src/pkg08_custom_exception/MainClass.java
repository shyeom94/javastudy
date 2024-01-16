package pkg08_custom_exception;

public class MainClass {

  public static void main(String[] args) {

    try {

      // Integer.parseInt("12.3");
      throw new MyException("예외메시지", 1000);

    } catch (MyException e) {

      System.out.println(e.getMessage());
      System.out.println(e.getErrorCore());

    }

  }

}


