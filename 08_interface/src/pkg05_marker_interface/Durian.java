package pkg05_marker_interface;

// 음식 -> Eatable 구현하지 않음

public class Durian implements Food {
  @Override
  public void eat() {
    System.out.println("두리안 먹는다.");
  }
}
