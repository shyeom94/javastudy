package practice02_Cup;

public class Cup {

  private Coffee coffee;

  public void fill(Coffee coffee) {
    this.coffee = coffee;
  }

  public void whoami() {
    coffee.whoami(); // <= 다형성 
  }

//  public static void main(String[] args) {
//
//    // 동적 바인딩
//    Coffee coffee = new Americano(); // 
//
//    coffee.whoami();
//
//  }

}
