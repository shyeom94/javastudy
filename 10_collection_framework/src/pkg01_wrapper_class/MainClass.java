package pkg01_wrapper_class;
// 8가지 primitive type 
public class MainClass {

  public static void main(String[] args) {

    // Auto Boxing (기본 타입 값 -> Wrapper 타입)
    // Integer num = new Integer(10); @Deprecated
    Integer num = 10; // Class 는 참조 타입 -> 메모리 주소 위치를 반환한다.

    // Auto Unboxing (Wrapper 타입 값 -> 기본 타입)
    int iNum = num; // primitive type 은 값을 저장

    System.out.println(iNum);

  }

}


