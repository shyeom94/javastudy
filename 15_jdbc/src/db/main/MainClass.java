package db.main;

import java.util.List;

import db.ctrl.UserController;
import db.dao.UserDao;
import db.dto.UserDto;
import db.service.UserService;
import db.service.UserServiceImpl;

public class MainClass {

  public static void main(String[] args) {
    
    UserController userController = new UserController();
    
    System.out.println(userController.requestHandleString("3", new UserDto(0, "테스트이름5", "테스트연락처5", null)));
    System.out.println(userController.requestHandleString("1", null));
    
//    UserDto userDto = new UserDto(0, "테스트이름", "테스트연락처", null);

    UserDao userDao = UserDao.getInstance(); 
    
    // 사용자 입력 
//    int result = userDao.saveUser(userDto);
//    System.out.println(result + "행이 삽입되었습니다.");
   
//    UserService userService = new UserServiceImpl(); 
    
    // 전체 목록 보기
    
   // List<UserDto> users = userDao.getUsers();
    
//   List<UserDto> users = userService.getUsers(); // Service 적용 후 

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
