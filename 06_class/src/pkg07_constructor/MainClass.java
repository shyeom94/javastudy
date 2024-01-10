package pkg07_constructor;

public class MainClass {
  
  /*
   * 생성자 constructor
   * 1. constructor
   * 2. 객체를 생성할 때 동작하는 메소드이다.
   * 3. new 키워드와 함께 사용된다. 
   * 4. 특징 
   *    1) 생성자는 클래스와 이름이 같다.
   *    2) 객체(또는 클래스)를 이용해서 호출하지 않는다. 
   *    3) 반환의 개념 자체가 없다. (void 개념 자체가 없음)
   *    4) 매개변수(parameter) 처리는 일반 메소드와 동일하다. 
   *        => 생성자 오버로딩이 가능하다. (여러개 만들수있다.)
   */
  
  /*
   * 디폴트 생성자 
   * 1. 생성자가 없는 클래스는 자동으로 디폴트 생성자가 사용된다. 
   * 2. 매개변수가 없고 본문의 실행 코드가 없는 형식이다. 
   * 
   */

  public static void main(String[] args) {
    
    // computer1 객체 선언 및 생성
    Computer computer1 = new Computer(); // 메소드 호출 
    //       ---------  instance 마다 값이 다른 멤버 = instance member 인스턴스 멤버 
    computer1.develop();
    computer1.danggun();
   
    // 생성자도 메소드이다. 
    
    // computer2 객체 선언 및 생성
     Computer computer2 = new Computer("gram", 200); // 인자 주는 곳
     computer2.develop();
     computer2.danggun();
    
     // computer 3 객체 선언 및 생성
     Computer computer3 = new Computer("Lenovo", 180, new Calculator()); // * * * 중요 * * *
     computer3.develop();
     computer3.danggun();     
     computer3.calculator.add();                     
     computer3.calculator.add(300);                     
     computer3.calculator.add(120, 230, 340, 450);                     
     
     
     
  }
}


