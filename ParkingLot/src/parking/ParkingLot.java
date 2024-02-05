package parking;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ParkingLot {

  /* field 영역 수정 금지 */
  private String name;
  private List<Car> cars;

  private Scanner sc;

  public final static int LIMIT = 5;

  public ParkingLot(String name) {
    sc = new Scanner(System.in);
    cars = new ArrayList<Car>();
  }

  public void addCar() throws RuntimeException {

    System.out.println("현재 등록된 차량 : " + cars.size() + "대 ");

    if (cars.size() == LIMIT) {
      throw new RuntimeException("만차입니다. 더 이상 차량 등록이 불가능합니다.");
    }

    System.out.println("차량번호 입력 >>> ");

    String carNo = sc.next();

    System.out.println("모델 입력 >>> ");

    String model = sc.next();

    cars.add(new Car(carNo, model));

    System.out.println("차량번호 " + carNo + " 차량이 등록되었습니다.");

  }

  public void deleteCar() throws RuntimeException {

    if (cars.isEmpty()) {
      throw new RuntimeException("현재 주차장에 등록된 차량이 없습니다.");
    }

    System.out.println("삭제할 차량번호 입력 >>> ");

    String carNo = sc.next();

    try {

      for (Car car : cars) {

        if (carNo.equals(car.getCarNo())) {
          System.out.println("차량번호 " + carNo + " 차량이 삭제되었습니다.");
          cars.remove(car);
          break;
        }
      }
    } catch (Exception e) {
      throw new RuntimeException("차량번호 " + carNo + " 차량이 존재하지 않습니다.");
    }
  }

  public void searchCar() throws RuntimeException {

    if (cars.isEmpty()) {
      throw new RuntimeException("현재 주차장에 등록된 차량이 없습니다.");
    }

    System.out.println("조회할 차량번호 입력 >>> ");

    String carNo = sc.next();

    try {

      for (Car car : cars) {
        if (carNo.equals(car.getCarNo())) {
          System.out.println("조회 결과: " + car.toString());
          break;
        }
      }

    } catch (Exception e) {
      throw new RuntimeException("차량번호 " + carNo + " 차량이 존재하지 않습니다.");
    }
  }

  public void printAllCars() throws RuntimeException {

    if (cars.isEmpty()) {
      throw new RuntimeException("현재 주차장에 등록된 차량이 없습니다.");
    }
    System.out.println("대박주차장 차량 목록");

    int n = 1;

    for (Car car : cars) {
      System.out.println(n + "번째 차량: " + car.toString());
      n++;
    }
  }

  public void manage() {

    while (true) {

      try {

        System.out.println("1.추가 2.삭제 3.조회 4.전체조회 0.종료 >>> ");
        String choice = sc.next();
        switch (choice) {
        case "1":
          addCar();
          break;
        case "2":
          deleteCar();
          break;
        case "3":
          searchCar();
          break;
        case "4":
          printAllCars();
          break;
        case "0":
          System.out.println("프로그램 종료");
          // break;
          return;
        default:
          throw new RuntimeException("잘못된 입력입니다.");
        }
      } catch (Exception e) {
        System.out.println(e.getMessage());
      }
    }
  }
}
