package pkg02_OutputStream;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.List;

public class MainClass { // 로그 파일 남길때 -> 추가모드 사용한다.

  /*
   * java.io.FileOutputStream 
   * 1. 바이트 기반의 파일 출력 스트림이다. 
   * 2. 출력 단위 
   *    1) int 하나를 보낼땐 
   *    2) byte[] 여러개를 보낼땐
   */
  
  /*
   * java.io.BufferdOutputStream
   * 1. 버퍼링을 지원하는 바이트 출력 스트림이다. 
   * 2. 보조 스트림으로 메인 스트림과 함께 사용해야 한다.
   * 3. 버퍼링을 지원하므로 출력 속도가 향상된다. 
   */
  
  /*
   * java.io.DataOutputStream 
   * 1. Java 변수 값을 출력하는 바이트 출력 스트림이다.
   * 2. 보조 스트림으로 메인 스트림과 함께 사용해야 한다. 
   * 3. 타입 별로 전용 메소드가 존재한다. 
   * 
   */
  
  /*
   * java.io.ObjectOutputStream
   * 1. 객체를 출력하는 바이트 출력 스트리 
   * 2. 보조 스트림으로 메인 스트림과 함께 사용해야 한다. 
   * 3. 객체를 출력 스트림으로 전송하기 위해서는 직렬화 과정이 필요하다. 
   * 4. 직렬화 방법
   *    1) 직렬화할 클래스는 java.io.Serializable 인터페이스를 구현한다. (필수)
   *    2) long serialVersionUID 필드 값을 임의로 생성한다.
   * 
   */
  
  public static void method1() {

    // 무조건 생성 모드 : 기존에 파일이 있으면 지우고 다시 만든다.

    // 디렉터리
    File dir = new File("\\storage");
    if (!dir.exists()) {
      dir.mkdirs();
    }

    // 파일
    File file = new File(dir, "sample1.dat");

    // 파일 출력 스트림 선언
    FileOutputStream out = null;

    try {

      // 파일 출력 스트림 생성 (무조건 생성 모드)
      out = new FileOutputStream(file);

      // 출력할 데이터 int 필요
      int c = 'A';
      String str = "pple";

      byte[] b = str.getBytes();

      // 출력
      out.write(c); // IOException 발생 가능성이 있다.
      out.write(b);

      // 플러싱(선택 작업)
      out.flush();

      // 파일 출력 스트림 닫기(종료) => 위치 선정 잘하기
      // out.close();

      // 확인
      System.out.println(file.length() + "바이트 크기의 " + file.getPath() + " 파일이 생성되었습니다.");

    } catch (Exception e) {

      e.printStackTrace(); // 예외 처리

    } finally {

      try {
        // 파일 출력 스트림 닫기(종료) => 위치 선정 잘하기
        if (out != null) { // NullPiontException 방지 
          out.close(); // try 블록을 finally 에 한번더 넣어준다.
        }
      } catch (Exception e2) {
        e2.printStackTrace();
      }
    }
  }

  public static void method2() { // 안녕하세요 반갑습니다. -> sample2.dat 파일로 보내기 
    
    // 추가 모드 : 기존에 파일이 없으면 새로 만들고, 있으면 내용만 추가한다.
    
    // 디렉터리
    File dir = new File("\\storage");
    if (!dir.exists()) {
      dir.mkdirs();
    }
    
    // 파일
    File file = new File(dir, "sample2.dat");
    
    // 파일 출력 스트림 선언
    FileOutputStream out = null;
    
    try {

      // 파일 출력 스트림 생성 (추가 모드)
      out = new FileOutputStream(file, true); // 생성 모드와 추가 모드의 다른점 

      // 출력할 데이터 

      String str = "안녕하세요 반갑습니다\n";
      byte[] b = str.getBytes();

      // 출력
      out.write(b); // IOException 발생 가능성이 있다.

      // 플러싱(선택 작업)
      out.flush();

      // 파일 출력 스트림 닫기(종료) => 위치 선정 잘하기
      // out.close();

      // 확인
      System.out.println(file.length() + "바이트 크기의 " + file.getPath() + " 파일이 생성되었습니다.");

    } catch (Exception e) {

      e.printStackTrace(); // 예외 처리

    } finally {

      try {
        // 파일 출력 스트림 닫기(종료) => 위치 선정 잘하기
        if (out != null) { // NullPiontException 방지 
          out.close(); // try 블록을 finally 에 한번더 넣어준다.
        }
      } catch (Exception e2) {
        e2.printStackTrace();
      }
    }
    
  }
  
  public static void method3() {
    
    File dir = new File("\\storage");
    if(!dir.exists()) {
      dir.mkdir();
    }
    
    File file = new File(dir, "sample3.dat");
    
    // 버퍼 출력 스트림 선언
    BufferedOutputStream out = null;
    
    // 생성 
    
    try {
      
      // 버퍼 출력 스트림 생성
      out = new BufferedOutputStream(new FileOutputStream(file)); // 추가한 코드 -> 속도가 빨라진다. 

      // 출력할 데이터
      String str1 = "How do you do? Nice to meet you.\n";
      String str2 = "I'm fine thank you.\n";
      
      out.write(str1.getBytes());
      out.write(str2.getBytes());
      
      // 버퍼 출력 스트림 닫기
      out.close();
      
      // 확인 코드 
      System.out.println(file.length() + "바이트 크기의 " + file.getPath() + " 파일이 생성되었습니다.");

    } catch (Exception e) {
      
      e.printStackTrace();
      
    }
  }
  
  public static void method4() {
  
    File dir = new File("\\storage");
    
    if(!dir.exists()) {
      dir.mkdirs();
    }
    
    File file = new File(dir, "sample4.dat");
    
    // 데이터 출력 스트림 선언
    DataOutputStream out = null;
    
    try {
      // 데이터 출력 스트림 생성
      out = new DataOutputStream(new FileOutputStream(file));
      
      // 출력할 데이터
      String name = "홍길동";
      int age = 10;
      double height = 140.5;
      boolean isAdult = (age >= 20);
      char gender = '남';
      
      // 출력
      out.writeUTF(name);
      out.writeInt(age);
      out.writeDouble(height);
      out.writeBoolean(isAdult);
      out.writeChar(gender);
    
      // 데이터 출력 스트림 닫기
      out.close();
      
      // 확인 코드 
      System.out.println(file.length() + "바이트 크기의 " + file.getPath() + " 파일이 생성되었습니다.");

    } catch (Exception e) {
      e.printStackTrace(); 
    }
  }
  
  public static void method5() {
    
    File dir = new File("\\storage");
    if(!dir.exists()) {
      dir.mkdirs();
    }
    
    File file = new File(dir, "sample5.dat");
    
    // 객체 출력 스트림 선언
    ObjectOutputStream out = null;

    try {
      
      // 객체출력 스트림 생성
      out = new ObjectOutputStream(new FileOutputStream(file));
      
      // 출력할 객체
      Employee employee = new Employee(1, "홍길동");
      List<Employee> employees = Arrays.asList(new Employee(2, "김유신"), new Employee(3, "이순신"));
      
      // 객체 출력
      out.writeObject(employee);
      out.writeObject(employees);

      // 객체 출력 스트림 닫기 
      out.close();
      
      // 확인 코드 
      System.out.println(file.length() + "바이트 크기의 " + file.getPath() + " 파일이 생성되었습니다.");
      
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
  
  public static void main(String[] args) {

    //method1();
    //method2();
    //method3();
    //method4();
    method5();

    // 속도 비교 
    //practice1();
    //practice2();
    
  }
  
  public static final String song = 
        "동해 물과 백두산이 마르고 닳도록\r\n"
      + "하느님이 보우하사 우리나라 만세\r\n"
      + "무궁화 삼천리 화려 강산\r\n"
      + "대한 사람 대한으로 길이 보전하세\n";
  
  public static void practice1() {
    
    // FileOutputStream 으로 애국가 1절 파일로 보내기 : 시간 재기 
    
    File dir = new File("\\storage");
    if(!dir.exists()) {
      dir.mkdirs();
    }
    
    File file = new File(dir, "애국가1.dat");

    // 파일 출력 스트림 선언
    FileOutputStream out = null;
    
    try {
      
      out = new FileOutputStream(file); 
      
      long start = System.nanoTime(); // 작업 시작 때 한번, 작업 끝날 때 한번
      out.write(song.getBytes());
      long fin = System.nanoTime(); // 작업 시작 때 한번, 작업 끝날 때 한번

      // 출력 스트림 닫기
      out.close();
      
      long time = fin - start;
      
      // 확인 코드 
      System.out.println(file.getPath() + " 파일이 생성되었습니다.");
      System.out.println(time + "ns 소요됨");
      
    } catch (Exception e) {

      e.printStackTrace();

    }
  }

  public static void practice2() {

    // BufferedOutputStream 으로 애국가 1절 파일로 보내기 : 시간 재기

    File dir = new File("\\storage");
    if(!dir.exists()) {
      dir.mkdirs();
    }
    
    File file = new File(dir, "애국가2.dat");
    
    // 버퍼 출력 스트림 선언
    BufferedOutputStream out = null;
    
    try {
      
      out = new BufferedOutputStream(new FileOutputStream(file));
      
      long start = System.nanoTime(); // 작업 시작 때 한번, 작업 끝날 때 한번
      out.write(song.getBytes());
      long fin = System.nanoTime(); // 작업 시작 때 한번, 작업 끝날 때 한번

      // 출력 스트림 닫기
      out.close();
      
      long time = fin - start;
      
      // 확인 코드 
      System.out.println(file.getPath() + " 파일이 생성되었습니다.");
      System.out.println(time + "ns 소요됨");    
      
    } catch (Exception e) {
      
      e.printStackTrace();
      
    }
  }

}
