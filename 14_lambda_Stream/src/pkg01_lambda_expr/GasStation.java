package pkg01_lambda_expr;

/*
 * Lambda Expression
 * 1. Anonymous Inner Type 객체를 생성할 때 사용할 수 있는 새로운 표현식이다. 
 * 2. 추상 메소드가 "1개"인 인터페이스 (함수형 인터페이스) 에서 사용할 수 있다. // 제한적인 경우에만 사용 가능 (함수 = 메소드) 
 * 3. Interface A { void method(int number); }
 *    1) Anonymous Inner Type
 *      A a = new A() {
 *        @Override
 *        void method(int number) { }        // -> 이부분을 살린다. 나머지는 생략.
 *      };
 *      
 *    2) Lambda Expression
 *      A a = (number) -> { }                // -> 이렇게
 *     
 */

/*
 * 메소드 형식에 따른 Lambda Expression
 * 
 * 1. 파라미터 X, 반환 X 
 *    interface A { void method(); } 
 *    1) A a = () -> { 
 *                본문 
 *                }
 *    2) A a = () -> 본문 // 경우에 따라서 : 본문 내용이 1개인 경우 중괄호 {} 를 생략할 수 있다.
 *    
 * 2. 파라미터 X, 반환 O 
 *    interface A { String method(); } 
 *    1) A a = () -> { 
 *                본문 
 *                return 문자열;
 *                }
 *    2) A a = () -> 문자열 // 경우에 따라서 : 본문 내용이 return 만 있는 경우 중괄호 {} 와 return 키워드를 생략할 수 있다.
 *    
 * 3. 파라미터 O, 반환 X 
 *    interface A { void method(String name); } 
 *    1) A a = (name) -> { 
 *              본문 
 *             }
 *    2) A a = (name) -> 본문 // 경우에 따라서 : 본문 내용이 1개인 경우 중괄호 {} 를 생략할 수 있다.
 *    
 * 4. 파라미터 O, 반환 O 
 *    interface A { String method(String name); } 
 *    1) A a = (name) -> { 
 *              본문 
 *              return 문자열;
 *             }
 *    2) A a = (name) -> 문자열 // 경우에 따라서 : 본문 내용이 return 만 있는 경우 중괄호 {} 와 return 키워드를 생략할 수 있다.
 */

public class GasStation {

  // field
  private int totalOil;
  private int chargePerLiter;
  private int earning;

  // method
  public void sellOil(String model, int oil) {
    
    // Car car 객체 생성(Anonymous Inner Type) 익명 객체 생성
    /*
    Car car = new Car() {
      @Override
      public void addOil() {
        totalOil -= oil;
        earning += oil * chargePerLiter;
        System.out.println(model + " 차량 " + oil + "L 주유 완료");
      }
    };
    */
    
    // Car car 객체 생성(Lambda Expression) 
    Car car = () -> { 
      totalOil -= oil;
      earning += oil * chargePerLiter;
      System.out.println(model + " 차량 " + oil + "L 주유 완료");
    };
    
    // addOil() 메소드 호출
    car.addOil();
  }

  public int getTotalOil() {
    return totalOil;
  }

  public void setTotalOil(int totalOil) {
    this.totalOil = totalOil;
  }

  public int getChargePerLiter() {
    return chargePerLiter;
  }

  public void setChargePerLiter(int chargePerLiter) {
    this.chargePerLiter = chargePerLiter;
  }

  public int getEarning() {
    return earning;
  }

  public void setEarning(int earning) {
    this.earning = earning;
  }

}
