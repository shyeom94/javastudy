package pkg10_static;

public class MainClass {

  /*
   * main 이 static 인 이유? 
   *
   * 가장 처음 실행되는 부분 
   * 
   * 
   * 
   * 미리 메모리에 할당되어 있어야 하므로 
   * 
   * 객체를 생성하지 않은 채로 바로 작업을 수행해야 하므로 
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

