package pkg03_InputStream;
// ctrl + shift + O = import 자동 정리
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

import pkg02_OutputStream.Employee;

public class MainClass {

  /*
   * java.io.FileInputStream 
   * 1. 바이트 기반의 파일 입력 스트림이다. 
   * 2. 입력단위 
   *    1) int 
   *    2) byte[]
   */
  
  /*
   * java.io.BufferedInputStream
   * 1. 버퍼링을 지원하는 바이트 입력 스트림이다.
   * 2. 보조 스트림이므로 메인 스트림과 함께 사용해야 한다.
   * 3. 버퍼링을 지원하므로 입력 속도가 향상된다.
   */
  
  /*
   * java.io.DataInputStream
   * 1. 자바 변수로 구성된 데이터를 읽는 바이트 입력 스트림이다.
   * 2. 보조 스트림이므로 메인 스트림과 함께 사용해야 한다.
   * 3. 타입 별로 전용 메소드가 존재한다. 
   */
  
  /*
   * java.io.ObjectInputStream
   * 1. 객체로 구성된 데이터를 읽는 바이트 입력 스트림이다.
   * 2. 보조 스트림이므로 메인 스트림과 함께 사용해야 한다.
   * 3. 읽은 객체는 Object 타입으로 반환되므로 객체 타입으로 캐스팅해서 사용한다.
   *    -> IOException과 ClassNotFoundException 예외가 발생할 수 있다. / (ClassCastException) -> 실행 중 예외 발생 
   */

  public static void method1() { // int 단위로 데이터 읽어들여보기
    // sample1.dat 파일
    File dir = new File("\\storage");

    // 필요없다.
//    if(!dir.exists()) {
//      dir.mkdirs();
//    }

    File file = new File(dir, "sample1.dat");

    // 파일 입력 스트림 선언
    FileInputStream in = null;

    try {

      // 파일 입력 스트림 생성
      in = new FileInputStream(file); // FileNotFoundException 예외 발생 가능성 - 폴더가 없는 경우,

      // 읽어들인 데이터를 보관할 장소 - 배열
      byte[] b = new byte[(int) file.length()]; // 배열 길이 - 파일의 크기 file.length() - 반환값이 long 타입 -> int 캐스팅해줘야 한다
      // List<Byte> 도 가능하다.

      int idx = 0;

      // 읽을 단위 - (int 변수로 1 byte 씩 읽는다.)
      int c;

      // -> 반복문 while 문으로 출력하기 c == -1 이면, 종료
      while (true) {

        // 읽기
        c = in.read(); // IOException 필요

        // EOF 문자열 (-1 ) 으로 읽는다 - 종료조건
        if (c == -1) { // EOF 검사, -1 일 경우, 즉시 종료
          break;
        }

        b[idx++] = (byte) c; // 캐스팅 필요 1 byte 를 4 byte 로

      }

      System.out.println(new String(b));

      for (int i = 0; i < b.length; i++) {
        // 결과 확인
        System.out.println(b[i]);
      }

      // 파일 입력 스트림 닫기
      in.close();

    } catch (FileNotFoundException e) { // Exception 바꾸기
      // e.printStackTrace();
      System.out.println("파일의 경로를 확인하세요.");
    } catch (IOException e) { // 입출력 예외 발생 시,
      System.out.println("입출력 예외가 발생했습니다.");
    }
  }

  public static void method2() { // 다량의 데이터를 읽어들이는 방법 <- 주로 사용한다

    File dir = new File("\\storage");
    File file = new File(dir, "sample2.dat");

    // 파일 입력 스트림 선언
    FileInputStream in = null;

    try {

      // 파일 입력 스트림 생성
      in = new FileInputStream(file); // FileNotFoundException 예외 발생

      // 읽어들인 데이터를 보관할 장소 - 배열
      byte[] b = new byte[(int) file.length()]; // 배열 길이 - 파일의 크기 file.length() - 반환값이 long 타입 -> int 캐스팅해줘야 한다

      // 단위 변경, byte[] 바이트 배열로 읽어보기
      byte[] bytes = new byte[5]; // 5씩 읽어오자는 뜻 (단위)
      int idx = 0;

      // 읽기
      // in.read(bytes); // IOException 필요
      // System.out.println(in.read(bytes));

      // 읽기
      while (true) {

        // 반환값 확인하기
        int readByte = in.read(bytes); // readByte 가 -1 일때, 종료 EOF

        // 검사, 읽은게 있는지, 없는지(-1)
        if (readByte == -1) {
          break;
        }
        System.arraycopy(bytes, 0, b, idx, readByte); // 배열 복사
        // bytes 배열의 인덱스 0 첫번째 요소부터 b 배열의 0 첫번째 요소로 읽어들인 만큼 복사한다.

        // 0~5까지 b 배열을 변수처리
        idx += bytes.length; // idx += readByte; // 같은 결과
      }

      // 확인
      System.out.println(new String(b));

      // 파일 입력 스트림 닫기
      in.close();

    } catch (FileNotFoundException e) { // 예외처리
      System.out.println(file.getPath() + " 파일이 존재하지 않습니다.");
    } catch (IOException e) {
      System.out.println("입출력 오류가 발생했습니다.");
    }
  }

  public static void method3() { // 버퍼 입력 스트림

    File dir = new File("\\storage");
    File file = new File(dir, "sample3.dat");

    // 버퍼 입력 스트림 선언
    BufferedInputStream in = null;

    try {

      // 버퍼 입력 스트림 생성
      in = new BufferedInputStream(new FileInputStream(file));

      // 읽어들인 데이터를 보관할 장소 - 배열
      byte[] b = new byte[(int) file.length()]; // 배열 길이 - 파일의 크기 file.length() - 반환값이 long 타입 -> int 캐스팅해줘야 한다

      // 단위 변경, byte[] 바이트 배열로 읽어보기
      byte[] bytes = new byte[5]; // 5씩 읽어오자는 뜻 (단위)
      int idx = 0;

      // 읽기
      // in.read(bytes); // IOException 필요
      // System.out.println(in.read(bytes));

      // 반환값 확인하기
      // int readByte = in.read(bytes); // readByte 가 -1 일때, 종료 EOF
      // while 문 안에 있으면 반복문 실행될 때마다 계속 선언된다. 

      // 읽기
      int readByte = 0; 
      
      // 읽기 => 수정한다. -> 변수 선언 
      while ((readByte = in.read(bytes)) != -1) { // -1 이 아니면, 계속(true)

        // 코드 스타일 -> != -1
//        if (readByte == -1) {        // 검사, 읽은게 있는지, 없는지(-1)
//          break;
//        }

        // bytes 배열의 인덱스 0 첫번째 요소부터 b 배열의 0 첫번째 요소로 읽어들인 만큼 복사한다.
        System.arraycopy(bytes, 0, b, idx, readByte); // 배열 복사

        // 0~5까지 b 배열을 변수처리
        idx += bytes.length; // idx += readByte; // 같은 결과
      }

      // 확인
      System.out.println(new String(b));

      // 파일 입력 스트림 닫기
      in.close();

    } catch (IOException e) { // IOException 준다. 업캐스팅
      e.printStackTrace();
    }

  }

  public static void method4() { // 데이터 InputStream
    
    File dir = new File("\\storage");
    File file = new File(dir, "sample4.dat");
    
    // 데이터 입력 스트림 선언
    DataInputStream in = null; // => 스트림은 통로의 개념
    
    try {
      
      // 데이터 입력 스트림 생성
      in = new DataInputStream(new FileInputStream(file));
      
      // 입력
      String name = in.readUTF();         // 출력 시, out.writeUTF(name) 사용 => 한글이 포함되어 있는 텍스트는 반드시 UTF-8 사용
      int age = in.readInt();             // 출력 시, out.writeInt(age) 사용 
      double height = in.readDouble();    // 출력 시, out.writeDouble(height) 사용 
      boolean isAdult = in.readBoolean(); // 출력 시, out.writeBoolean(isAdult) 사용 
      char gender = in.readChar();        // 출력 시, out.writeChar(gender) 사용 

      // 출력 확인 
      System.out.println(name);
      System.out.println(age);
      System.out.println(height);
      System.out.println(isAdult);
      System.out.println(gender);

      // 데이터 입력 스트림 닫기
      in.close();
      
    } catch (Exception e) {
      e.printStackTrace();
    }

  }
  
  public static void method5() {
    
    File dir = new File("\\storage");
    File file = new File(dir, "sample5.dat");

    // 객체 입력 스트림 선언
    ObjectInputStream in = null;

    try {

      // 객체 입력 스트림 생성
      in = new ObjectInputStream(new FileInputStream(file));

      // 객체 입력
      Employee emp1 = (Employee) in.readObject(); // 다른 패키지에 있는 클래스 -> import 해서 사용한다.
      List<Employee> empList = (List<Employee>)in.readObject();
      
      //Employee emp2 = (Employee) in.readObject(); // 다른 패키지에 있는 클래스 -> import 해서 사용한다.
      //Employee emp3 = (Employee) in.readObject(); // 다른 패키지에 있는 클래스 -> import 해서 사용한다.

      // 확인하는 코드
      System.out.println(emp1);
      System.out.println(empList.get(0));
      System.out.println(empList.get(1));
      
      // 객체 입력 스트림 닫기
      in.close();
      
    } catch (IOException | ClassNotFoundException e) { // 동시에 선언하기
      e.printStackTrace();
    }
  }

  
  
  public static void main(String[] args) {

    // method1(); // int 로 읽어오기
    // method2(); // byte[] 로 읽어오기
    // method3(); // 버퍼 입력 스트림으로 더 빠르게 
    // method4(); // 
    method5(); // 

  }
}
