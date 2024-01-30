package practice02_dql;

import java.sql.Timestamp;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@ToString               // Generate toString()  
@NoArgsConstructor      // * default constructor 디폴트 생성자 
@AllArgsConstructor     // * constructor using field
@Getter
@Setter
public class TalkDto {
  // field
  private int talk_no; // DB 칼럼에 매칭하기
  private String talk_content;
  private String talk_user;
  private Timestamp written_at;
}

/*
* TALK 구조
*    TALK_NO       NUMBER  (PK)
*    TALK_CONTENT  VARCHAR2(1000 BYTE)
*    TALK_USER     VARCHAR2(1000 BYTE)
*    WRITEN_AT     TIMESTAMP (* 현재 날짜/시간 : CURRENT_TIMESTAMP) 
 */
