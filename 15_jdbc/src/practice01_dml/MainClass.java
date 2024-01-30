package practice01_dml;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class MainClass {

  /*
   * TALK_T 테이블에 1행씩 삽입하시오.
   * TALK 구조
   *    TALK_NO       NUMBER  (PK)
   *    TALK_CONTENT  VARCHAR2(1000 BYTE)
   *    TALK_USER   VARCHAR2(1000 BYTE)
   *    WRITEN_AT     TIMESTAMP (* 현재 날짜/시간 : CURRENT_TIMESTAMP) 
   *    
   * DB 서버 환경
   *    192.168.0.214
   *    GD/1111 
   *    
   *    -Djdbc.url=jdbc:oracle:thin:@192.168.0.214:1521:xe
   *    -Djdbc.user=GD
   *    -Djdbc.password=1111
   */
  
  public static void method1() {
    
    // Connection, PreparedStatement 객체 선언
    Connection con = null;
    PreparedStatement ps = null;
    
    try {
      
      // oracle.jdbc.OracleDriver 클래스 로드
      Class.forName("oracle.jdbc.OracleDriver");
      
      // 데이터베이스 접속 정보
      String url = System.getProperty("jdbc.url");
      String user = System.getProperty("jdbc.user");
      String password = System.getProperty("jdbc.password");
      
      // Connection 객체 생성
      con = DriverManager.getConnection(url, user, password);

      // 쿼리문
      String sql = "INSERT INTO TALK_T(TALK_NO, TALK_CONTENT, TALK_USER, WRITEN_AT) VALUES(TALK_SEQ.NEXTVAL, '안녕하세요', '염상훈', CURRENT_TIMESTAMP)";
      // 쿼리문 안쪽 마지막 부분 세미콜론 붙이지 말 것! (문자열 안쪽 세미콜론 붙이지 말 것)

      // PreparedStatement 객체 생성
      ps = con.prepareStatement(sql);

      // 쿼리문 실행 -> 삽입된 행의 개수가 반환됨. (int)
      int result = ps.executeUpdate();

      System.out.println(result + " 행 이(가) 삽입되었습니다.");

    } catch (Exception e) {
      e.printStackTrace();
      // Connection, PreparedStatement 객체 닫기(반환)
    } finally {

      try {
        if (con != null)
          con.close();
        if (ps != null)
          ps.close();
      } catch (Exception e) {
        e.printStackTrace();
      }
    }
  }
 
  public static void main(String[] args) {
    
    method1();
    
  }

}
