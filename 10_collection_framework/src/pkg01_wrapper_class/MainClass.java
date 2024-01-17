package pkg01_wrapper_class;
// 8가지 primitive type 
public class MainClass {

  public static void main(String[] args) {

    // Auto Boxing (기본 타입 값 -> Wrapper 타입) 참조 타입
    // Integer num = new Integer(10); @Deprecated 가급적 사용하지 말 것
    Integer num = 10; // Class 는 참조 타입 -> 메모리 주소 위치를 반환한다.

    // Auto Unboxing (Wrapper 참조 타입 값 -> 기본 타입)
    int iNum = num; // primitive type 은 값을 저장 -> 기본 자료형에 없는 null 값이 필요할 때 

    System.out.println(iNum);

  }

}


