package pkg09_this;

public class MainClass {

  public static void main(String[] args) {

    Computer computer = new Computer(); // 참조값 computewr, 객체 new Computer()
    
    System.out.println(computer);
    computer.showThis();
    // 같은 값이 나온다. 
    
    
    System.out.println(computer.model);
    computer.showModel();
    // 같은 값이 나온다. 
    
    
    
  }

}


