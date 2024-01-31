package db.main;
// 인터페이스 : 작업지시서. 추상메소드. 인터페이스를 구현한다. (상속한다 (X))

import java.util.List;

import db.dto.UserDto;

public interface UserService { // 인터페이스 이름 명명할 때에 I (대문자 i) 로 시작하는 경우도 있다. 
  
  List<UserDto> getUsers(); // 전체 사용자를 조회할 리스트 필요  
  
  UserDto getUser(int user_no); // 특정 사용자 조회할 번호 필요
  
  int saveUser(UserDto userDto); // 삽입할 사용자 정보 필요
  
  int modifyUser(UserDto userDto); // 수정할 사용자 정보 필요 
  
  int removeUser(int user_no); // 삭제할 사용자 번호 필요
  
}
