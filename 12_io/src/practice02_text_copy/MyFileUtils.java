package practice02_text_copy;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class MyFileUtils {

  // 파일 복사 메소드
  public static void fileCopy(File src, File dest) {
    
    // 인풋 스트림으로 파일 읽어오기
  
    // 아웃풋 스트림으로 복사하기 
    
    // BufferedReader : File src 읽는 역할
    // bufferedWriter : File dest 만드는 역할

    try (BufferedReader in  = new BufferedReader(new FileReader(src)); 
         BufferedWriter out = new BufferedWriter(new FileWriter(dest))) {
      
     char[] cbuf = new char[256]; // 256 글자씩  
     
     // 실제로 읽어들인 글자수를 반환받아서 사용한다.
     int readChar = 0;

     // in.read(cbuf) -> out.write(cbuf)
     while ((readChar = in.read(cbuf)) != -1) { // -1 이 아니라면 계속 읽어라

       out.write(cbuf, 0, readChar); // ( cbuf, 0 ) -> 배열의 첫번째 글자부터 readChar 까지 읽어라

       // try-catch-resources 사용하여 close 안해도 된다.
     }
   } catch (IOException e) {
     e.printStackTrace();
   }

 }

  // 파일 이동 메소드
  public static void fileMove(File src, File dest) {
    
    // 파일 복사하기
    fileCopy(src, dest);
    
    // 원본 지우기 
    src.delete();
    
  }

  public static void main(String[] args) {

    File src = new File("\\Program Files\\Java\\jdk-17\\LICENSE");
    File dest = new File("\\storage\\LICENSE");
    
    MyFileUtils.fileCopy(src, dest);
    MyFileUtils.fileMove(src, dest);

  }
}
