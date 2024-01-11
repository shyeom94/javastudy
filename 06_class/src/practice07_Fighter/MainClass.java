package practice07_Fighter;

public class MainClass {

  public static void main(String[] args) {

    // Fighter1
    Fighter fighter1 = new Fighter("정찬성", 180);

    // Fighter2
    Fighter fighter2 = new Fighter("김동현", 150);

    // turn
    boolean myTurn = true;

    // keep fight until KO
    while (fighter1.isAlive() && fighter2.isAlive()) {

      if (myTurn) {
        fighter1.punch(fighter2, (int) (Math.random() * 16) + 15); // (int) Math.random() * (최댓값-최소값+1) + 최소값 : => 범위 최대 30  ~ 최소 15
        // 가드 or 회피 or 카운터 
      } else {
        fighter2.punch(fighter1, (int) (Math.random() * 16) + 20); 
        // 가드 or 회피 or 
      }

      myTurn = !myTurn; // 

    }

    if (fighter1.isAlive()) {
      System.out.println(fighter1.getName() + "의 승리를 축하합니다.");
    } else {
      System.out.println(fighter2.getName() + "의 승리를 축하합니다.");
    }

  }

}
