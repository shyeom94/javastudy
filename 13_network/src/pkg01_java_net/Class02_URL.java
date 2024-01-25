package pkg01_java_net;

import java.net.MalformedURLException;
import java.net.URL;

public class Class02_URL {
  public static void main(String[] args) {

    try {

      URL url = new URL("https://wwww.example.com:9090/webtoon/list?page=1&id=100#memo"); // 주소는 공백없이 완벽하게

      System.out.println(url.getProtocol());
      System.out.println(url.getHost());
      System.out.println(url.getPort());
      System.out.println(url.getPath());
      System.out.println(url.getQuery()); // parameter
      System.out.println(url.getFile());
      System.out.println(url.getRef());
      
      //url.openConnection();
      //url.openStream(); - inputStream 입력 스트림 / 접속한다
      
    } catch (MalformedURLException e) {
      e.printStackTrace();
    }
  }
}
