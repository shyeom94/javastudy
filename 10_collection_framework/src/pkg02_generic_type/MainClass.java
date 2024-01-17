package pkg02_generic_type;
// 제네릭 타입 
public class MainClass {
  public static void main(String[] args) {

    // 제네릭(Generic)이란 타입을 일반화하는 것을 의미
    
    // n 개의 타입을 1개의 코드를 이용하여 값을 처리할 수 있다. 
    
    // Integer 저장용 Container
    // Container<int> => 안된다
    Container<Integer> container1 = new Container<Integer>(); 
    container1.setItem(10); // 구체화되었다.
    System.out.println(container1.getItem()); 
    
    // String 저장용 Container
    Container<String> container2 = new Container<>(); 
    container2.setItem("Hello"); 
    System.out.println(container2.getItem()); 
    
    // 제네릭 타입을 활용하면 타입별로 따로 만들 필요없이 값을 넣을 수 있다. 
    
    // 제네릭 타입은 참조 타입만 전달이 가능하다. (기본 타입은 사용 불가능)
    
    // Wrapper Class 활용한다.
    
  }

}


