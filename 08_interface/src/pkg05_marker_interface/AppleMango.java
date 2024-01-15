package pkg05_marker_interface;

public class AppleMango implements Food, Eatable {
  @Override
  public void eat() {
    System.out.println("애플망고 먹는다.");
  }
}
