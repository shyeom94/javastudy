package pkg01_java_net;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Class03_HttpURLConnection {

  public static void main(String[] args) {

    String spec = "https://www.naver.com/";
    URL url = null;
    HttpURLConnection con = null;

    try {

      url = new URL(spec);
      con = (HttpURLConnection) url.openConnection();

      /*
       * 접속 상태 확인 (HTTP Response Code : 응답 코드)
       * 1. 200 : 정상
       * 2. 4XX : 요청 문제 ex) 404
       * 3. 5XX : 서버 문제 
       */
      
       // 응답 코드 (서버 -> 클라이언트) : 서버가 클라이언트로 보내는 것 
       // 요청 코드 (클라이언트 -> 서버) : 클라이언트가 서버로 보내는 것 
      
      int responseCode = con.getResponseCode(); // 응답 코드 
      
      if (responseCode == 200) { // 200 = HttpURLConnection.HTTP_OK
      //if (responseCode == HttpURLConnection.HTTP_OK) { // 200 = HttpURLConnection.HTTP_OK

        System.out.println("정상 접속");
        
      } else {
        
        System.out.println("접속 불가");
        
      }
      
      /*
       * Content-Type 
       * 1. 컨텐트 타입 - 이미 정해져 있는 타입. 별도로 만들 수 없다.
       * 2. 종류
       *    1) 문서   타입 : text/xxx
       *    2) 이미지 타입 : image/xxx
       *    3) 데이터 타입 : application/xxx
       */
      
      String contentType = con.getContentType();
      System.out.println(contentType);
      
      /*
       * 요청 메소드 (Request Method, 요청 방법) 클라이언트가 서버 측으로 
       * 1. GET  : 주소창(URL)을 이용한 요청. 기본 요청 방식. 
       * 2. POST : 본문(BODY)을 이용한 요청 
       */
      
      String requestMethod = con.getRequestMethod(); 
      System.out.println(requestMethod); 
      
      /*
       * 요청 헤더
       * 1. 요청 정보가 저장된다.
       * 2. 종류
       *    1) User-Agent     : 무엇으로 접속하였는지에 관한 정보 ex) 크롬인지, 엣지인지, 자바인지, 사파리인지...
       *    2) Referer        : 이전 접속 주소 정보 (돌아가기 위해)
       *    3) Content-Type   : 컨텐트 타입
       *    4) Content-Length : 컨텐트 크기
       */
      
       //String userAgent = con.getRequestProperty(requestMethod);
      
       String userAgent = con.getRequestProperty("user-Agent");
       System.out.println(userAgent);
       String referer = con.getRequestProperty("Referer");
       System.out.println(referer);
      
//      Map<String, List<String>> requestHeader = con.getRequestProperties();
//      
//      // key - value 하나로 -> Entry ---> 컬렉션 프레임워크 복습하기 
//      for(Entry<String, List<String>> entry : requestHeader.entrySet()) {
//        System.out.println(entry.getKey() + " : " + entry.getValue());
//      }
      
     } catch (MalformedURLException e) {
       e.printStackTrace();
     } catch (IOException e) {
       e.printStackTrace();
     } finally {

       if (con != null) {
         // 커넥션 초기화
         con.disconnect(); // 접속 해제
       }
     }

   }
 }
