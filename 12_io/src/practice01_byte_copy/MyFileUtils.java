package practice01_byte_copy;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class MyFileUtils {

  /*
   * 모 듈 화
   * 
   * static 으로 모듈화 
   */

  // 파일 복사 메소드
  public static void fileCopy(String src, String dest) {

    // src 로부터 읽은 데이터를 바이트 배열에 저장하고,
    // 바이트 배열에 있는 데이터를 파일 출력 스트림으로 보내는 방식

    // FileInputStream 으로 읽어 들어온다.
    // FileOutputStream 으로 보낸다.

    // 원본 File 객체
    File srcFile = new File(src);
    
    // 복사본 File 객체
    File destFile = new File(dest);
    
    // 원본을 읽는 버퍼 입력 스트림 선언
    BufferedInputStream in = null;
    
    // 복사본 파일을 만드는 버퍼 출력 스트림 선언
    BufferedOutputStream out = null;
    
    try {
      // 원본을 읽는 버퍼 입력 스트림 생성
      in = new BufferedInputStream(new FileInputStream(srcFile));
      
      // 복사본을 만드는 버퍼 출력 스트림 생성
      out = new BufferedOutputStream(new FileOutputStream(destFile));

      // 원본을 5 byte 씩 읽어온다.
      byte[] bytes = new byte[5];
      
      // 원본을 끝까지 읽는다. 그 후 읽은 내용을 복사본으로 보낸다.
      int readByte = 0; // 선언할때는 초기값 0으로 준다

      while ((readByte = in.read(bytes)) != -1) {

        // out.write(bytes); // 실패한다! 5바이트씩 옮겨가며 빈 곳이 발생한다. 
        
        // readByte 까지 읽어와라
        out.write(bytes, 0, readByte);
      }

      // 버퍼 출력 스트림 닫기
      out.close();
      // 버퍼 입력 스트림 닫기
      in.close();
      
      // => 조립은 해체의 역순. 순서 파악하기 
      
    } catch (IOException e) { 
      e.printStackTrace();
      }

  }

  // 파일 이동 메소드
  public static void fileMove(String src, String dest) {

    // 파일 읽기
    // 파일 복사하기
    // 원본 파일 삭제 
    
    // => 파일 이동  

  }

  public static void main(String[] args) {
    MyFileUtils.fileCopy("\\Program Files\\Java\\jdk-17\\LICENSE", "\\storage\\LICENSE");
  }
}
