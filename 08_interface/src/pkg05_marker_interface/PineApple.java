package pkg05_marker_interface;

public class PineApple implements Food, Eatable {

  @Override
  public void eat() {
    System.out.println("파인애플 먹는다.");
  }

}


