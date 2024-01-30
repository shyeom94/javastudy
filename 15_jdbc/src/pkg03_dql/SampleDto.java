package pkg03_dql;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/*
 * DTO
 * 1. Data Transfer Object 데이터 전송 객체
 * 2. 데이터베이스의 데이터를 자바와 주고 받을 때 사용하는 객체이다.
 * 3. 기본적으로 테이블 하나당 DTO 하나를 만든다. 
 * 4. 필드는 칼럼에 매칭하고 생성자와 Getter / Setter 를 만든다. -> lombok : Eclipse 에 설치한다.
 * java -jar lombok.jar
 * 이클립스에 설치 후 프로젝트에 jar 파일 빌드 패스 지정하기
 */

@ToString               // Generate toString()  
@NoArgsConstructor      // * default constructor 디폴트 생성자 
@AllArgsConstructor     // * constructor using field
@Getter
@Setter
public class SampleDto {
  
  // field
  private int sample_no; // DB 칼럼에 매칭하기
  private String sample_content;
  private String sample_editor;
  private Date sample_dt;
  // 타입과 칼럼을 DB 와 맞춰둔다. 

  // ResultSet rs;              select 결과 조회 인터페이스 
  // rs.next(); -> true/false   호출 1번당 1 row 값 확인 가능  
  // re.getInt(1), re.getString("~~~")  ->     name    or     No    
  // while(rs.next()) {    }    [목록보기] 데이터 전체 값 확인 
  // if(rs.next()) {    }       [상세보기] 유무 판단 
  
  
  
}
