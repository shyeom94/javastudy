package db.service;

import java.util.List;

import db.dao.UserDao;
import db.dto.UserDto;

/*
 * Business Layer
 * 1. 핵심 로직을 처리하는 부분이다. 
 * 2. Persistence Layer (DAO) 와 통신하는 레이어이다. (Persistence Layer : DB 와 연결하는 부분)
 * 3. DAO 로 전달할 데이터를 가공하거나, DAO 로부터 전달 받은 데이터를 가공한다.  
 */

public class UserServiceImpl implements UserService {

  // 1 : M 관계 
  // UserDao 가 필요하므로 필드에 추가 
  
  // field
  private UserDao userDao; 
  
  // constructor
  public UserServiceImpl() { 
    // userDao 는 싱글톤 패턴. 객체 생성 "없이" 클래스 이름으로 호출한다. 
    userDao = UserDao.getInstance(); // * * * * * 중요 * * * * * 
  }
  
  @Override
  public List<UserDto> getUsers() {
    return userDao.getUsers(); 
  }

  @Override
  public UserDto getUser(int user_no) {
    return userDao.getUser(user_no);
  }

  @Override
  public int saveUser(UserDto userDto) {
    return userDao.saveUser(userDto);
  }

  @Override
  public int modifyUser(UserDto userDto) {
    return userDao.modifyUser(userDto);
  }

  @Override
  public int removeUser(int user_no) {
    return userDao.removeUser(user_no);
  }

}
