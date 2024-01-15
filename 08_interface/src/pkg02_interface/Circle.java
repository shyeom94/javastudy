package pkg02_interface;
//인터페이스롤 활용하여 클래스 만들기
 
/*
 * 용어 비교
 * 
 *    클래스                 인터페이스
 * 1. 상속한다.              구현한다.
 * 2. extends                implements
 * 3. 자식클래스             구현클래스
 * 
 */

// 추상을 상속받으면 반드시 오버라이드해라.
public class Circle implements Shape {
  
  // field
  private double x;
  private double y;
  private double radius;
  
  // constructor
  public Circle() {
    // super(); 부모의 디폴트 생성자는 호출하지 않아도 된다. 생략해도 된다. Shape { } 생성자 호출, 호출을 생략할 수 있다.
  }

  public Circle(double x, double y, double radius) { // 자식 클래스의 생성자는 반드시 부모 클래스의 생성자를 호출해야 한다.
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
  
  @Override
  public double getArea() {
    // return super.getArea();
    return PI * Math.pow(radius, 2); // pi * r^2
  }

  @Override
  public double getCircum() {
    // return super.getCircum();
    return 2 * PI * radius;
  }
  
}
