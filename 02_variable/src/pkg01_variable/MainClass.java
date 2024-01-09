package pkg01_variable;

public class MainClass {

  public static void main(String[] args) {
    
    /*
     *  메모리 Memory 
     *  
     *  1. 램(RAM) 
     *  2. 자바 프로그램이 동작하기 위한 모든 것이 저장되는 장소이다.
     *  3. 변수도 메모리에 생성된다. 
     *  4. 메모리는 1byte 마다 16진수로 된 고유의 번호를 부여해서 관리한다. 메모리는 1byte 마다 주소값을 가지고 있다.
     *    1) 주소값 
     *    2) 참조값 
     *    3) 16진수 작성 예시 : 0x123456 ~ 
     */
    
    /*
     * 식별자의 이름 규칙
     * 1. Pascal Case : 각 단어의 첫 글자는 대문자, 나머지는 소문자 (Class 이름) 
     * 2. Camel  Case : Pascal Case 와 동일하지만, 첫 글자는 소문자 (메소드, 변수)
     * 3. Snake  Case : 각 단어의 연결을 밑줄(_)로 하는 방식        (상수)
     */
    
    /*
     * 사용 가능한 식별자
     * 1. 영문
     * 2. 한글
     * 3. 숫자 (숫자로 시작은 불가능)
     * 4. 특수문자 (_, $) 나머지는 불가능 
     */
    
    /*
     * 변수
     * 1. 어떤 값을 저장하기 위해 메모리에 할당된 저장소를 의미한다.
     * 2. 변수를 선언한 뒤 사용할 수 있다. 
     * 3. 저장하려는 데이터의 종류에 따라 2가지로 구분한다.
     * 
     *    1) 기본 자료형(타입) Primitive type
     *      (1) 값 자체를 저장한느 RAW DATA 타입이다.
     *      (2) 8가지 타입이 제공된다.
     *          byte, short, int, long, float, double, char, boolean
     *      
     *    2) 참조 자료형(타입) 
     *      (1) 값이 저장된 참조값을 저장하는 REFERENCE DATA 타입이다.
     *      (2) 기본 자료형을 제회한 모든 데이터는 참조 자료형이다.
     */
    
    // 변수 선언 
    
    // byte : 1 byte 정수 
    byte myFirstVariable = 127; // -128 ~ 127 저장 가능 
    System.out.println(myFirstVariable);
    
    // short : 2 byte 정수
    short a = 32767; // 32768 부터 안들어감 
    System.out.println(a);
    
    // int : 4 byte 정수 
    int b = 100; // -21억 ~ 21억
    System.out.println(b);
    
    // long : 8 byte 정수
    long c = 1000000000000000000L; // 뒤에 L 붙이기 -> long 타입이라고 인식, 
    System.out.println(c);
    
    // float : 4 byte 실수 
    float d = 1.1F; // 뒤에 F 붙이기 -> float 타입이라고 인식, 
    System.out.println(d);
    
    // double : 8바이트 실수
    double f = 1.1;
    System.out.println(f);
    
    // char : 2 byte 문자 (1글자만 저장 가능)
    char ch = '한'; // 1글자면 ' '  쓰기
    System.out.println(ch);
    
    /*
     * 이스케이프 시퀀스
     * 1. 역슬래쉬로 시작하는 특수 문자를 의미한다. 
     * 2. 종류
     *    1) 줄 바꿈  : \n
     *    2) 탭       : \t
     *    3) 따옴표
     *      (1) \'
     *      (2) \"
     *    4) 역슬래시 : \\
     */
    
    // boolean : 논리값 (true, false)
    boolean isAlive = false; // 변수 생성 시, 참고
    System.out.println(isAlive);
    
    /*
     * 변수의 스코프 scope 
     * 1. 변수의 가용 범위를 의미한다.
     * 2. 변수가 선언된 코드 블록(중괄호, {}) 내에서만 사용할 수 있다.
     */
    
    {
      int x = 10;
      System.out.println(x); 
    }
    
    // System.out.println(x); x 인식 못한다. 접근 불가능하다. 
    
    // main method 에서 선언하면 인식한다. 
    
    // 블락 후 alt 위 아래로 이동 : 코드 라인 변경 
   
    //===================================================================================================================
    
    /*
     * 상수 
     * 1. Constant Variable
     * 2. 값을 바꿀 수 없는 변수이다.
     * 3. 상수 선언 규칙
     *  1) final 키워드를 추가한다.
     *  2) 반드시 초기값을 지정한다.
     *  3) 관례상 대문자로 작성한다.
     */
    
    final double PI = 3.141592;
    System.out.println(PI);
    
    /*
     * String  클래스
     * 1. 문자열을 관리하는 클래스이다.
     * 2. 문자열을 저장하는 타입으로 사용한다. 
     * 3. 참조 자료형이지만 마치 기본 자료형처럼 쉬운 사용을 제공한다.
     */
    
    // 참조 자료형 : 참조값 메모리 위치 정보 s가 저장하고 있다. 
    // 메모리의 참조값을 가지고 있다.
    // Hello world가 저장된 
    
    String s = "Hello world!";
    System.out.println(s);
    
    /*
     * ┌-------------┐
     * |  0x12345678 |   s           - s에는 hello world 가 아닌 메모리 위치 정보가 저장되어있다. 
     * |-------------|
     * |             |
     * |-------------|
     * |             |
     * |-------------|
     * | hello world | 0x12345678    - hello world가 저장된 메모리 위치 정보 주소 
     * |-------------|
     * |             |
     * └-------------┘
     */
    
    }
  }


