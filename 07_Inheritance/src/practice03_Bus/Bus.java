package practice03_Bus;

public class Bus {

  // field
  private Seat[] seats; // 버스 자리 수
  private int numOfPerson; // 남은 승객 수

  // constructor
  public Bus() {
    seats = new Seat[25];
    for (int i = 0; i < seats.length; i++) {
      seats[i] = new Seat();
    }
  }

  // method

  // 버스 타기(앞자리부터 채워가는 방식으로 앉기)
  public void on(Person person) {
    if (numOfPerson >= seats.length) {
      System.out.println("만석입니다. 버스에 탈 수 없습니다.");
      return;
    }
    for (int i = 0; i < seats.length; i++) {
      if (seats[i].getPerson() == null) {
        seats[i].setPerson(person);
        numOfPerson++;
        break;
      }
    }
  }

  // 버스 내리기
  public void off(int seatNo) {
    if (seatNo <= 0 || seatNo > seats.length) {
      System.out.println("좌석 번호가 잘못 전달되었습니다.");
      return;
    }
    seats[seatNo - 1].setPerson(null);
    numOfPerson--;
  }

  // 버스 탑승 명단
  public void info() {
    System.out.println("===== 탑승자 목록 확인 =====");
    for (int i = 0; i < seats.length; i++) {
      // 각 좌석에 앉아있는 사람
      Person person = seats[i].getPerson();
      if (person == null) {
        System.out.println(String.format("%02d", i + 1) + "번 좌석 : 비어있음");
      } else {
        System.out.println(String.format("%02d", i + 1) + "번 좌석 : " + person.getName());
      }
    }
  }

}