package pkg01_abstract;

public class MainClass {

  public static void main(String[] args) {

    // Circle

    // Upcasting 업캐스팅 : 자식 객체(Circle)는 부모 타입(Shape)으로 자동 변환된다.
    Shape shape1 = new Circle("원", 0, 0, 1.5);

    // Downcating 다운캐스팅 : 자식 객체를 부모 타입으로 변환시키면, 부모의 업캐스팅된 객체는 '부모의 메소드만' 호출할 수 있다.
    System.out.println("Name : " + shape1.getName());

    // 업캐스팅된 객체의 메소드는 다운캐스팅 후 호출할 수 있다. => 다시, 자식의 타입으로 바꾸겠다.
    // instanceof

    if (shape1 instanceof Circle) {
      System.out.println("X : " + ((Circle) shape1).getX()); // Circle 로 다운캐스팅, 타입을 바꾼다.
      System.out.println("Y : " + ((Circle) shape1).getY());
      System.out.println("Radius : " + ((Circle) shape1).getRadius()); 
      // 부모는 같은데, 서로 가진 메소드가 다를 경우, 다운캐스팅으로 메소드 호출
    }
    
    System.out.println("넓이 : " + shape1.getArea());
    System.out.println("둘레 : " + shape1.getCircum());

    // Rectangle

    // 업캐스팅
    Shape shape2 = new Rectangle("사각형", 0, 0, 5, 5);

    System.out.println("Name : " + shape2.getName());

    if (shape2 instanceof Rectangle) {
      System.out.println("X1 : " + ((Rectangle) shape2).getX1());
      System.out.println("Y1 : " + ((Rectangle) shape2).getY1());
      System.out.println("X2 : " + ((Rectangle) shape2).getX2());
      System.out.println("Y2 : " + ((Rectangle) shape2).getY2());
    }

    System.out.println("넓이 : " + shape2.getArea());
    System.out.println("둘레 : " + shape2.getCircum());

    // 자식이 가진 공통 메소드는 부모에 두고, 자식이 가져다 쓸 수 있도록 하자. 

  }
  
  // Shape shape = new Shape(); // 오류 : 객체 생성을 못한다. 형태가 없으므로. 추상적이므로. 메소드가 없기 때문에. 이름은 있는데 본문이 없으므로 
  
  // 추상 클래스를 객체로 만들고 싶으면, 메소드를 다 만들어야 한다. 
  
  // 임시 객체 만들때, 주로 사용한다. 

}
