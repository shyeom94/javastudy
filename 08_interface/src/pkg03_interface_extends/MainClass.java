package pkg03_interface_extends;

public class MainClass {

  public static void main(String[] args) {
    
    // 업캐스팅과 다운캐스팅 
    Elec elec = new SmartPhone();
    elec.powerOn();
    ((SmartPhone) elec).game();
    ((SmartPhone) elec).call();

    Computer computer = new SmartPhone();
    computer.powerOn();
    computer.game();
    ((SmartPhone) computer).call();

    Phone phone = new SmartPhone();
    phone.call();
    ((SmartPhone) phone).powerOn();
    ((SmartPhone) phone).game();

    // 타입에 따라 호출할 수 있는 메소드가 다르다
    SmartPhone smartphone = new SmartPhone();
    smartphone.powerOn();
    smartphone.game();
    smartphone.call();
    
    // 인터페이스는 공통 기능만 정의한다.

  }
}
