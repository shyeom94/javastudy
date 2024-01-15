package pkg05_marker_interface;

public class DurianHatePerson {

//  public void eat(Food food) {
//
//    if (food instanceof Durian) {
//      return;
//    }
//    food.eat();
//  }

  public void eat(Eatable eatable) {
    ((Food) eatable).eat(); // Food 타입으로 캐스팅
  }

}
