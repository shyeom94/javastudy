package pkg08_access_modifier;

public class MainClass {

  public static void main(String[] args) {
    
    //computer 객체 선언 및 생성
    Computer computer = new Computer("Galaxybook", 400, new Calculator());
    
    // private 필드에 "직접" 접근이 불가능하다.
    // System.out.println(computer.model);
    // computer.develop(); // 메소드를 통해 (간접) 접근 가능.
    
    // 다른 클래스에서 값을 전달하고 싶을 때
    // 외부에서 필드값을 확인하고 싶을 때 
    
    // 필드로 값을 전달하는 메소드 
    computer.setModel("Mac");
    computer.setPrice(280);
    computer.setCalculator(new Calculator());
    
    // 필드값을 가져오는 메소드 
    System.out.println(computer.getModel());
    System.out.println(computer.getPrice());
    System.out.println(computer.getCalculator());
    
    
    
  }

}


 