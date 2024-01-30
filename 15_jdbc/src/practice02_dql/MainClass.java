package practice02_dql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class MainClass {
  /*
   * TALK_T 테이블의 데이터를 TALK_NO의 내림차순으로 정렬한 뒤 11~20번째 행을 조회하여 List 에 저장하시오.
   * TALK 구조
   *    TALK_NO       NUMBER  (PK)
   *    TALK_CONTENT  VARCHAR2(1000 BYTE)
   *    TALK_USER     VARCHAR2(1000 BYTE)
   *    WRITTEN_AT     TIMESTAMP (* 현재 날짜/시간 : CURRENT_TIMESTAMP) 
   *    
   * DB 서버 환경
   *    192.168.0.214
   *    GD/1111 
   *    
   *    -Djdbc.url=jdbc:oracle:thin:@192.168.0.214:1521:xe
   *    -Djdbc.user=GD
   *    -Djdbc.password=1111
   */

  public static void method1() { // 테이블에서 조회 

    Connection con = null;
    PreparedStatement ps = null;
    ResultSet rs = null;

    try {

      Class.forName("oracle.jdbc.OracleDriver");

      String url = System.getProperty("jdbc.url");
      String user = System.getProperty("jdbc.user");
      String password = System.getProperty("jdbc.password");
      con = DriverManager.getConnection(url, user, password);

      // Query 문 만들기
      String sql = "SELECT TALK_NO, TALK_CONTENT, TALK_USER, WRITTEN_AT "
          + " FROM (SELECT ROW_NUMBER() OVER(ORDER BY TALK_NO DESC) AS RN, TALK_NO, TALK_CONTENT, TALK_USER, WRITTEN_AT"
          + "       FROM TALK_T)"
          + " WHERE RN BETWEEN 11 AND 20";
//      + " WHERE RN BETWEEN ? AND ?";

      ps = con.prepareStatement(sql);

//      BETWEEN 절 ? AND ? 
//      int begin = 0; // 시작 값
//      int end = 0; // 끝 값
//      ps.setInt(1, begin);
//      ps.setInt(2, end);

      // SELECT Query 문 실행 결과는 ResultSet 이 처리한다.
      rs = ps.executeQuery();

      // List 생성 및 저장하기
      List<TalkDto> talks = new ArrayList<TalkDto>();

      while (rs.next()) {

        TalkDto talkDto = new TalkDto();
        talkDto.setTalk_no(rs.getInt("TALK_NO"));
        talkDto.setTalk_content(rs.getString("TALK_CONTENT"));
        talkDto.setTalk_user(rs.getString("TALK_USER"));
        talkDto.setWritten_at(rs.getTimestamp("WRITTEN_AT"));

        talks.add(talkDto);
      }

      // 결과 확인
      for (int i = 0, size = talks.size(); i < size; i++) {
        System.out.println(talks.get(i));
      }

    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      try {

        if (rs != null)
          rs.close();
        if (ps != null)
          ps.close();
        if (con != null)
          con.close();

      } catch (Exception e) {
        e.printStackTrace();
      }
    }
  }

  public static void main(String[] args) {

    method1(); // 테이블에서 조회

  }
}
