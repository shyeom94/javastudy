package db.main;

import java.util.List;

import db.dao.UserDao;
import db.dto.UserDto;

public class MainClass {

  public static void main(String[] args) {
    

//    UserDto userDto = new UserDto(0, "테스트이름", "테스트연락처", null);

    UserDao userDao = UserDao.getInstance(); 
    
    // 사용자 입력 
//    int result = userDao.saveUser(userDto);
//    System.out.println(result + "행이 삽입되었습니다.");
   
    // 전체 목록 보기
//   List<UserDto> users = userDao.getUsers();
//   for(UserDto user : users) {
//     System.out.println(user);
//   }
   
    // 특정 사용자 검색
//   UserDto userDto = userDao.getUser(2);
//   System.out.println(userDto);
   
    // 수정하기 
//    UserDto userDto = new UserDto(1, "수정이름", "수정연락처", null);
//    int result = userDao.modifyUser(userDto);
//    System.out.println(result + "행이 수정되었습니다.");
    
    // 삭제하기
//    int result = userDao.removeUser(1);
//    System.out.println(result + "행이 삭제되었습니다.");

  }
}
