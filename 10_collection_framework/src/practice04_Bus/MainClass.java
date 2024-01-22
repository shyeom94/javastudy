package practice04_Bus;

public class MainClass {

  public static void main(String[] args) {

    try {
      Bus bus = new Bus();

      bus.on(new Man("톰"));
      bus.on(new Woman("캐시"));
      bus.on(new Man("피터"));
      bus.on(new Woman("세라"));
      bus.on(new Man("알렉스"));
      bus.on(new Man("밥"));

      bus.info();

      bus.off(3);
      // bus.off(0);
      bus.off(2);
      bus.off(1);
      bus.off(-4325);
      // bus.off(10);

      bus.info();

      bus.on(new Woman("레이첼"));
      bus.on(new Man("브루스"));
      bus.on(new Woman("미셸"));
      bus.on(new Man("스티브"));
      bus.on(new Man("아서"));

      bus.info();

    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
  }

}
