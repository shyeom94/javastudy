package pkg05_Reader;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class MainClass {

  /*
   * java.io.FileReader
   * 1. 문자 기반의 파일 입력 스트림이다.
   * 2. 입력 단위
   *    1) int 한글자
   *    2) char[] 여러개
   *    3) String 여러개
   */
  
  public static void method1() { // sample1.txt. 읽어보기
    
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

  public static void method2() {
  }
  
  public static void main(String[] args) {
    
    method1();
    method2();
    
  }
}
