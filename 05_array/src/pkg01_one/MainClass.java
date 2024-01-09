package pkg01_one; 

public class MainClass {
  
  public static void method1() {
    
    /*
     * 배열
     * 1. 변수 여러개를 하나의 이름으로 관리하는 자료구조이다.
     * 2. 각 변수 구분을 위해서 인덱스를 활용한다. 
     * 3. 구성 
     *    1) 배열이름 : 모든 변수의 대표 이름
     *    2) 배열길이 : 변수의 갯수 
     *    3) 인덱스   : 변수를 구분하는 숫자(0부터 시작하는 정수값)
     *    4) 배열요소 : 각 변수를 의미(배열이름과 대괄호[]와 인덱스를 조합해서 사용)
     * 
     *  1차원 배열, 2차원 배열 ... 
     *  
     */
    
    /*
     * 배열의 선언과 생성
     * 1. 배열은 선언과 생성 과정이 모두 필요하다. 
     * 2. 배열의 선언 
     *    1) int[] 배열이름 => 추천 : 타입만으로 배열의 속성값 확인 가능 
     *    2) int 배열이름[]
     * 3. 배열의 생성 
     *    new int[배열길이] => Heap 영역 
     * 4. 배열이 생성되면 배열의 모든 요소는 자동으로 초기화된다. // 변수는 자동 초기화가 없음!!! but 배열은 자동으로 초기화된다. 
     *    초기값 : 0, 0.0, false, null // 기억하기 
     */
    
    // 배열 선언 
    int[] arr;
    
    // 배열 생성
    arr = new int[3]; // 배열의 길이 반드시 쓰기 
    
    // 배열 요소(배열이름 + 대괄호 + 인덱스), 자동초기화 0
    System.out.println(arr[0]);
    System.out.println(arr[1]);
    System.out.println(arr[2]);
  }
  
  public static void method2() {
    
    /*
     * 배열 초기화 * * * * * 
     * 1. 배열을 선언할 때 초기화 값들을 전달할 수 있다. 
     * 2. 형식
     *    1) int[] 배열이름 = new int[] {값1, 값2, 값3, ...} 메소드로 값을 전달할 때 사용
     *    2) int[] 배열이름 = {값, 값2, 값3, ...} 
     */
    
    // 배열 선언 및 초기화 
    int[] arr = new int[] {10, 20 ,30, 40, 50};
    
    // 배열 요소 
    System.out.println(arr[0]);
    System.out.println(arr[1]);
    System.out.println(arr[2]);
    System.out.println(arr[3]);
    System.out.println(arr[4]); 
    // => 반복문으로 for 문
    
  }
  
  public static void method3() {
    
    /*
     * 배열 길이
     * 1. 배열 요소의 개수를 의미한다. 
     * 2. 배열이 생성된 이후에는 수정할 수 * * *없다* * *. 
     * 3. 배열 길이 필드값 
     *    배열이름.length
     */
    
    // 배열 선언 및 초기화 
    int[] arr = {10, 20, 30, 40, 50};
    
    // 배열 길이 확인 
    System.out.println(arr.length); 
    
    // 배열과 for 문 
    for(int i=0; i<arr.length; i++) {
      System.out.println(arr[i]); 
    } 
  }

  public static void method4() {
    
    /*
     * 배열의 구조
     * 1. 배열의 타입은 메모리 주소값을 가진 참조 타입(reference type)이다. 
     * 2. 배열의 모든 요소는 순서대로 메모리의 연속된 공간을 할당받는다. 
     *                                         -----------
     *    int[] a = new int[] {10, 20, 30};
     *    -------   -----------------------
     *    stack     heap                   
     *    
     *    ┌--------------┐
     *   a│  0x10000000  │
     *    │--------------│
     *    │     ...      │
     *    │--------------│
     *    │      10      │0x10000000
     *    │--------------│
     *    │      20      │0x10000004
     *    │--------------│
     *    │      30      │0x10000008
     *    └--------------┘
     *    
     */
    
    /*
     * 배열의 길이를 늘이는 방법 
     * 1. 새로운 배열을 만든다. 
     * 2. 기존 배열 요소를 모두 옮긴다. 
     * 3. 새로운 배열의 참조값을 가져온다. 
     */
    
    int[] a = new int[] {10, 20, 30};
    
    int[] b = new int[10];
    
    for(int i=0; i<a.length; i++) {
      b[i] = a[i];
    }
    
    // 참조값 가져오기
    a = b; // 사용하지 않는 메모리 값은 jvm이 gc로 해결. 메모리 누수 발생!
    
    for(int i=0; i<a.length; i++) {
      System.out.println(a[i]);
    }
  }
  
  public static void method5() {
    
    // advanced for (향상 for 문)
    // for(변수 : 배열) { }
    
    int[] arr = new int[] {10, 20, 30, 40, 50};
    
    // 데이터 참조용으로만 쓰인다. 
    for(int number : arr) {
      System.out.println(number);
    }
    
    // 제약적으로 쓰인다. 
  }
  
  public static void main(String[] args) {
    
    // method1();
    // method2();
    // method3();
    // method4();
    method5();
    
  }
}


