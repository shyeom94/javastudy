package pkg02_generic_type;
// 제네릭 타입 
public class MainClass {
  public static void main(String[] args) {

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
    
    // 제네릭 타입은 참조 타입만 전달이 가능하다.
    // Wrapper Class 활용한다.
    
  }

}


