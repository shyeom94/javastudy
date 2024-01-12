package practice05_Bakery;

public class Customer {

  // field
  private int money;
  private int count;

  public Customer() {
    // 아무것도 없는거
  }

  public Customer(int money, int count) {
    super();
    this.money = money;
    this.count = count;
  }

  public int getMoney() {
    return money;
  }

  public void setMoney(int money) {
    this.money = money;
  }

  public int getCount() {
    return count;
  }

  public void setCount(int count) {
    this.count = count;
  }

  // 구매
  // 구매할 때 필요한 인자값 : 구매할 가게, 구매할 붕어빵 갯수, 구매할 때 낼 돈
  // 구매가 끝나고 반환 값 : 없음 (구매하면 끝임)
  public void buy(Bakery bakery, int count, int money) {

    // 가진 돈이 부족하다.
    if (this.money < money) {
      System.out.println("가진 돈이 부족합니다.");
      return;
    }

    // 구매 (곧 Bakery 의 판매를 의미한다.)
    // BreadChange breadChange = bakery.sell(money, count); // null 발생 가능
    // NullPointException 발생 가능성
    // 개선
    BreadChange breadChange = null;
    if (bakery != null) {
      breadChange = bakery.sell(money, count); // null 발생 가능 -> 개선
    }

    // 구매 결과 처리
    if (breadChange != null) {
      this.count += breadChange.getBread();
      this.money += breadChange.getChange();
      this.money -= money;
    }

  }

}
