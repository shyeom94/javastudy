package db.app;

import java.util.List;

import javax.swing.JOptionPane;

import db.ctrl.UserController;
import db.dao.UserDao;
import db.dto.UserDto;
import db.service.UserService;
import db.service.UserServiceImpl;
import db.view.DeleteView;
import db.view.DetailView;
import db.view.EditView;
import db.view.ListView;
import db.view.RegisterView;
import db.view.View;

// UserApp 동작 흐름
/*
 * [UserApp]                 [UserController]                                           [UserService]                                        [UserDao]
 *    작업 선택        --->                                                            
 *    View 실행 결과   --->                                                                
 *                           String requsetHandle(작업 선택, View 실행 결과) {
 *                              작업에 따른 Service 호출(View 실행 결과 전달)     --->      
 *    작업결과메시지   <---     작업결과 메시지 반환
 *    message 확인           }
 * 
 *                                                                                      반환타입 선택된 메소드(View 실헹 결과) {
 *                                                                                        DAO 메소드 호출 (View 실행 결과)         --->
 *                                                                                <---    반환값 반환         
 *                                                                                       }
 * 
 * 
 *                                                                                                                                           반환타입 선택된 메소드 (View 실행 결과) {
 *                                                                                                                                              DB 처리
 *                                                                                                                                 <---         반환값 반환   
 *                                                                                                                                           }                                                              
 */

public class UserApp {

  public static void main(String[] args) {
    
    UserController userController = new UserController();
    
    while (true) { 
      
      String choice = JOptionPane.showInputDialog("1. 전체명단\n2. 상세조회\n3. 등록\n4. 편집\n5. 삭제\n0. 종료\n원하는 작업 번호를 입력하세요.");
      
      // 모든 View 들은 타입이 View 이다.
      
      View view = null;
      
      switch(choice) {
      case "1" : view = new ListView(); break;
      case "2" : view = new DetailView(); break;
      case "3" : view = new RegisterView(); break;
      case "4" : view = new EditView(); break;
      case "5" : view = new DeleteView(); break;
      case "0" : JOptionPane.showMessageDialog(null, "사용자 앱을 종료합니다."); return; // 반환 타입이 void 인 메소드 끝내는 키워드 return;
      default : JOptionPane.showMessageDialog(null, "잘못된 입력입니다. 다시 선택하세요.");

      }
      if(view != null) { // view 가 null 이 아니면, 
        String message = userController.requestHandleString(choice, view.display()); // 모든 view 의 display() 호출 결과로 입력 결과를 넘겨준다.
        JOptionPane.showMessageDialog(null, message);
      }
      
    }
  }

//    System.out.println(userController.requestHandleString("3", new UserDto(0, "테스트이름5", "테스트연락처5", null)));
//    System.out.println(userController.requestHandleString("1", null));
    
//    UserDto userDto = new UserDto(0, "테스트이름", "테스트연락처", null);

//    UserDao userDao = UserDao.getInstance(); 
    
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

