package pkg05_Reader;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import org.xml.sax.InputSource;

public class MainClass {

  /*
   * java.io.FileReader
   * 1. 문자 기반의 파일 입력 스트림이다.
   * 2. 입력 단위
   *    1) int 한글자
   *    2) char[] 여러개
   *    3) String 여러개
   * => 출력 단위와 일치한다. 
   */
  
  /*
   * java.io.BufferedReader
   * 1. 버퍼링을 지원하는 문자 입력 스트림이다.
   * 2. 보조 스트림으로 메인 스트림과 함께 사용해야 한다. 
   * 3. 버퍼링을 지원하므로, 입력 속도가 향상된다.
   * 4. 한줄씩 읽는 readLine() 메소드가 있다. 
   */
  
  /*
   * java.io.InputStreamReader
   * 1. 바이트 입력 스트림을 문자 입력 스트림으로 변환한다.
   * 2. 바이트 입력 스트림으로 문자 데이터가 전달되는 경우 사용한다.
   */
  
  /* 참고)
   * InputStream에 포함된 문자를 안깨지고 받기 // 읽었을 때 전혀 깨지지 않는다.
   * 
   * 1. InputStreamReader 를 사용한다.
   * 2. DataInputStream 을 사용한다. 
   */
  
  public static void method1() { // sample1.txt 읽어보기 
    
    File dir = new File("\\storage");
    File file = new File(dir, "sample1.txt");
    
    // 파일 입력 스트림 선언 
    FileReader in = null;
    
    try {
      
      // 파일 입력 스트림 생성
      in = new FileReader(file);
      
      // 읽는 단위 (한 글자씩 읽을 것인지, 여러 글자로 읽을 것인지 선택하기)
      char[] cbuf = new char[2]; // 한번에 몇 글자 읽을 것인지 결정, 이번엔 2개씩 읽기
      
      // 읽은 데이터 저장소 
      StringBuilder builder = new StringBuilder(); // append 하기
      
      // 반환값 
//      System.out.println(in.read(cbuf)); // 읽은 글자 수 반환 
//      System.out.println(in.read(cbuf));
//      System.out.println(in.read(cbuf));
//      System.out.println(in.read(cbuf));
      
      // 읽은 글자 수
      int readChar = 0;

      while (true) {
        
        readChar = in.read(cbuf);
        
        if (readChar == -1) {
          break;
        }
        builder.append(cbuf, 0, readChar); // cbuf (2개) 의 갯수만큼 index 0 부터 readChar 읽은 글자수 만큼 추가하기
      }
      
      // 확인 
      System.out.println(builder.toString());

      // 파일 입력 스트림 닫기
      in.close();
      
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  public static void method2() { // sample2.txt 읽어보기 
    
    File dir = new File("\\storage");
    File file = new File(dir, "sample2.txt");
    
    // 버퍼 입력 스트림 선언
    BufferedReader in = null;
    
    try {

      // 버퍼 입력 스트림 생성
      in = new BufferedReader(new FileReader(file));

      // 읽는 단위
      String line = null;

      // 읽은 데이터 모으기
      StringBuilder builder = new StringBuilder();

      // readLine 메소드는 파일에 끝에 도달하면 null 반환
      while ((line = in.readLine()) != null) {
        builder.append(line); // .append("\n")
      }
      
//      while (true) {
//        line = in.readLine();
//        if (line == null) {
//          break;
//        }
//        builder.append(line); // .append("\n")
//      }
      // => 같은 역할 무한 루프, 같은 일을 하는 코드는 가급적 지우자. -> 주석처리 하지 말 것.

      // 확인
      System.out.println(builder.toString());

      // 버퍼 입력 스트림 닫기
      in.close();

    } catch (IOException e) {
      e.printStackTrace();
    }

  }

  public static void method3() {
    
    File dir = new File("\\storage");
    File file = new File(dir, "sample3.html");
    
    // BufferedReader 선언
    BufferedReader in = null;
    
    try {
      
      // BufferedReader 생성
      // 바이트 입력 스트림(FileInputStream) -> 문자 입력 스트림(InputStreamReader) 역할 -> 버퍼 입력 스트림 (BufferedReader)
      in = new BufferedReader(new InputStreamReader(new FileInputStream(file))); // 이렇게 변환해서 받아와야 한다. 
      
      // 읽는 단위
      String line = null;
      
      // 읽은 데이터 모으기
      StringBuilder builder = new StringBuilder();
      
      // 읽기
      while((line = in.readLine()) != null ) {
        builder.append(line).append("\n");
      }
      
      // 확인
      System.out.println(builder.toString());
      
      // BufferedReader 닫기
      in.close();
      
    } catch (IOException e) {
      e.printStackTrace();
    }
    
  }
  
  public static void main(String[] args) {
    
    // method1();
    // method2();
    method3();
  }
}
