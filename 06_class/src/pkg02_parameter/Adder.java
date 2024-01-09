package pkg02_parameter;

public class Adder {
  // 합계 구하는 매서드
  void add(int... params) {
    int total = 0;
    for(int param : params) {
      total += param;
    }
    System.out.println("합 : " + total);
  }
  
  
}


