package practice03_Club;

import java.util.HashSet;
import java.util.Set;

public class Club {

  // field
  private Set<Person> pool;

  // constructor
  public Club() {
    pool = new HashSet<Person>(); // 생성자 
  }

  // method 
  public void enterClub(Person person) { // 추가
    pool.add(person);
  }

  public void leaveClub(Person person) { // 삭제 
    pool.remove(person);
  }

  public void poolList() {
    for (Person person : pool) {
      System.out.println(person);
    }

  }

}
