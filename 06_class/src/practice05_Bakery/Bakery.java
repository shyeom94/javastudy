package practice05_Bakery;

public class Bakery {

  // field
  private int count; // 붕어빵의 갯수
  public final static int PRICE = 500; // 붕어빵의 가격
  private int money; // 돈

  // constructor
  public Bakery() {
    // default 형식
  }

  public Bakery(int count, int money) {
    super();
    this.count = count;
    this.money = money;
  }

  // getter - setter
  public int getCount() {
    return count;
  }

  public void setCount(int count) {
    this.count = count;
  }

  public int getMoney() {
    return money;
  }

  public void setMoney(int money) {
    this.money = money;
  }

  // 판매
  // 전달 받는 인자 : 돈, 구매할 붕어빵 갯수
  // 되돌려 줄 반환 : 잔돈, 구매한 붕어빵 갯수 => 객체화 BreadChange 객체를 이용
  public BreadChange sell(int money, int count) {

    // 판매가 불가능한 상황 - 판매할 빵이 없다.
    if (this.count < count) {
      System.out.println("붕어빵이 부족해요");
      return null;
    }

    // 판매가 불가능한 상황 - 거슬러줄 현금 잔돈이 부족해요.
    if (this.money < (money - (count * PRICE))) {
      System.out.println("잔돈이 부족해요");
      return null;
    }

    // 판매가 불가능한 상황 - 고객이 낸 돈이 부족하다.
    if (money < (count * PRICE)) {
      System.out.println("돈 더 주세요");
      return null;
    }

    // 판매 처리하기
    this.money += count * PRICE;
    this.count -= count;

    // 반환
    return new BreadChange(count, money - (count * PRICE));
    
    
    
  }

}
