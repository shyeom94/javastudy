package pkg01_abstract;

public class Circle extends Shape { // 서브클래스 extends 슈퍼클래스

  // field
  private double x;
  private double y;
  private double radius;

  // constructor
  public Circle() {
    // super(); 부모의 디폴트 생성자는 호출하지 않아도 된다. 생략해도 된다. Shape { } 생성자 호출, 호출을 생략할 수 있다.
  }

  public Circle(String name, double x, double y, double radius) { // 자식 클래스의 생성자는 반드시 부모 클래스의 생성자를 호출해야 한다.
    super(name); // Shape(String name) { } 생성자 호출
    this.x = x;
    this.y = y;
    this.radius = radius;
  }

  // method
  public double getX() {
    return x;
  }

  public void setX(double x) {
    this.x = x;
  }

  public double getY() {
    return y;
  }

  public void setY(double y) {
    this.y = y;
  }

  public double getRadius() {
    return radius;
  }

  public void setRadius(double radius) {
    this.radius = radius;
  }

  /*
   * 추상 메소드는 '반드시' Override 해야 한다.
   */
  
  @Override
  public double getArea() {
    // return super.getArea();
    return Math.PI * Math.pow(radius, 2); // pi * r^2
  }

  @Override
  public double getCircum() {
    // return super.getCircum();
    return 2 * Math.PI * radius;
  }

}
