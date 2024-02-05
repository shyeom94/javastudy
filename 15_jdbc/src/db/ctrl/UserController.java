package db.ctrl;

import db.dto.UserDto;
import db.service.UserService;
import db.service.UserServiceImpl;

public class UserController { // jsp 에서는 servlet 으로 구현 
  
  /*
   * Controller 
   * 1. 사용자의 요청을 받는 영역이다. 
   * 2. 사용자에게 응답을 보내는 영역이다. 
   * 3. 요청에 따른 Service 를 실행하고 실행 결과를 응답한다. 
   */

  // [사용자]  ->  [Controller]  ->  [Service]

  // field
  private UserService userService;

  public UserController() {
    userService = new UserServiceImpl();
  }

  // method
  public String requestHandleString(String choice, UserDto userDto) {
  
    String message = "";
    
    switch (choice) {

    case "1":
      for (UserDto user : userService.getUsers()) {
        message += user.toString() + "\n";
      }
      break;

    case "2":
      UserDto user = userService.getUser(userDto.getUser_no());
      if (user == null) {
        message = "조회된 사용자 정보가 없습니다.";
      } else {
        message = user.toString();
      }
      break;

    case "3":
      message = userService.saveUser(userDto) + "명의 정보가 등록되었습니다.";
      break;

    case "4":
      message = userService.modifyUser(userDto) + "명의 정보가 수정되었습니다.";

    case "5":
      message = userService.removeUser(userDto.getUser_no()) + "명의 정보가 삭제되었습니다.";

    }
    return message;
  }
}