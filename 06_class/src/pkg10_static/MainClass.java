package pkg10_static;

public class MainClass {

  /*
   * main 이 static 인 이유? 
   * 
   * 클래스 영역에 별도로 메모리 공간을 할당받지 않고 
   * 
   */
  
  public static void main(String[] args) {
    // 클래스 멤버 호출 : 클래스.멤버
    System.out.println(Calculator.maker); // static 처리되었으면 기울임 표시 
    
    int num = Integer.parseInt("100"); // static 처리 
    System.out.println(num);
    
    Calculator.add(5 , 8);
    
  }
}

