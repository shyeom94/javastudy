package pkg01_java_net;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class Class04_InputStream {

  public static void method1() {
    
    String spec = "https://www.google.com/";
    
    URL url = null;
    
    HttpURLConnection con = null;
    
    // 텍스트므로 Reader
    BufferedReader in = null;
    
    try {
      // 1. url 만들기
      url = new URL(spec);
      
      // 2. Connection 받아오기
      con = (HttpURLConnection) url.openConnection();
      
      if (con.getResponseCode() != 200) { // 200 = HttpURLConnection.HTTP_OK
        throw new RuntimeException(spec + " 접속 불가");
      }
      
      // 속도 향상      //                   // 텍스트를 읽어들이는   
      in = new BufferedReader(new InputStreamReader(con.getInputStream()));

      String line = null;
      StringBuilder builder = new StringBuilder();
      while ((line = in.readLine()) != null) {

        builder.append(line).append("\n");

      }

      System.out.println(builder.toString());

      in.close();

    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      // null 이 아닐때만 닫아준다.
      if (con != null) {
        con.disconnect();
      }
    }

  }

  public static void method2() { // 주소에서 이미지 불러와서 저장하기  

    String spec = "https://ssl.pstatic.net/melona/libs/1478/1478567/8308b46df656a2e535e7_20231219095632646.jpg";
    URL url = null;
    HttpURLConnection con = null;

    BufferedInputStream in = null;
    BufferedOutputStream out = null;

    try {

      url = new URL(spec);
      con = (HttpURLConnection) url.openConnection();

      if (con.getResponseCode() != 200) {
        throw new RuntimeException(spec + "접속 불가");
      }

      in = new BufferedInputStream(con.getInputStream());

      File dir = new File("\\storage");
      if (!dir.exists()) {
        dir.mkdirs();
      }
      File file = new File(dir, "living_img.png");

      out = new BufferedOutputStream(new FileOutputStream(file));

      byte[] b = new byte[10];
      int readByte = 0;
      while ((readByte = in.read(b)) != -1) {
        out.write(b, 0, readByte);
      }

      out.close();
      in.close();

    } catch (Exception e) {
      e.printStackTrace();
    } finally {

      if (con != null) {
        con.disconnect();
      }
    }
  }

    public static void main(String[] args) {
      
      // method1(); 
      method2(); 
      
    } 
}
