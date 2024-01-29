package db.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
// 모듈화용
public class UserDao { // 데이터베이스 

  // field
  private Connection con;
  
  // private 메소드 (UserDao 내부에서 호출할 메소드)
  
  // private 하는 이유 : 외부에선 안쓴다. 
  
  private void connection() {

    try {

      Class.forName("oracle.jdbc.Oracle.Driver");
      String url = System.getProperty("jdbc.url");
      String user = System.getProperty("jdbc.user");
      String password = System.getProperty("jdbc.password");
      con = DriverManager.getConnection(url, user, password);

    } catch (ClassNotFoundException e) {

      System.out.println("OracleDriver 클래스 로드 실패");

    } catch (SQLException e) {

      System.out.println("데이터베이스 접속 실패");

    }
  }

  private void close() {
    try {
      if (con != null) 
        con.close();
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }

  // public 메소드 (실제 기능을 담당하는 메소드)
  
}
