package practice02_Watch;

public class Watch {

  private int hour;
  private int minute;
  private int second;

  public Watch(int hour, int minute, int second) {
    super();
    this.hour = hour;
    this.minute = minute;
    this.second = second;
  }

  public int getHour() {
    return hour;
  }

  public void setHour(int hour) {
    this.hour = hour;
  }

  public int getMinute() {
    return minute;
  }

  public void setMinute(int minute) {
    this.minute = minute;
  }

  public int getSecond() {
    return second;
  }

  public void setSecond(int second) {
    this.second = second;
  }

  ///////////////////////////////////////////////////////

  public void addHour(int hour) {
    // watch.addHour(3); // 12:00:00
    if(hour <= 0) {
      return; 
    }
    this.hour += hour;
    this.hour %= 24; // hour 이 0 ~ 23 사이 값을 가지게 된다.
  }

  public void addMinute(int minute) {
    // watch.addMinute(80); // 13:20:00
    if(minute <= 0) {
      return;
    }
    this.minute += minute;
    addHour(this.minute / 60); // 몫
    this.minute %= 60; // 나머지   
   }

  public void addSecond(int second) {
    // watch.addSecond(3650); // 14:20:50
    if(second <= 0) {
      return;
    }
    this.second += second;
    addMinute(this.second / 60);
    this.second %= 60;
  }

  public void see() {
    // watch.see(); // 14:20:50
    System.out.println(String.format("%02d:%02d:%02d", hour, minute, second));
  }

}
