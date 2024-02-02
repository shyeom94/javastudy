package db.view;
// 사용자가 입력한 정보들을 반환하는 것이 목적

import db.dto.UserDto;

public interface View {
  
  UserDto display(); // 출력하는 메세지 
  
}
