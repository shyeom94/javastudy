package pkg08_Object; // Object 대문자, 클래스라는 의미 

/*
 * Object 클래스 
 * 
 * 1. 모든 클래스들의 최상위 부모 클래스이다. 
 * 
 * 2. extends 키워드를 명시하지 않은 클래스들은 모두 Object 클래스를 상속한다. 
 * 
 * 3. 주요 메소드 
 *    1) boolean equals(Object another) { } // 반환타입 true or false  -> Object 타입은 만능 타입 
 *    2) String toString() { }              // 반환타입 String         
 *    
 * 4. 역할 
 *    1) 모든 것(값, 객체)을 저장할 수 있는 만능 타입이다. 
 *       -> Object 타입으로 저장된 객체는 해당 객체 타입으로 "캐스팅해야" 메소드를 호출할 수 있다. => 다운캐스팅을 해야지'만' 
 *    2) 모든 클래스들의 공통 기능을 지원한다. 
 *       -> Object Class 의 method 를 Override 해서 원하는 기능으로 바꿀 수 있다. 
 *       => 모든 클래스들은 동등 비교를 할 수 있고, 모든 클래스들은 문자열로 값을 비교할 수 있다. 
 * 
 */

public class Book extends Object { // extends Object 
  
  // field 
  private String isbn;
  private String title;
  
  //==============================================================================================//    
  
  // constructor
  public Book() {
  }

  public Book(String isbn, String title) {
    super(); // Object() { } 생성자 호출, 생략할 수 있다. 
    this.isbn = isbn;
    this.title = title;
  }

  //==============================================================================================//    
  
  // method
  public String getIsbn() {
    return isbn;
  }

  public void setIsbn(String isbn) {
    this.isbn = isbn;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }
  
  //==============================================================================================//  

  // 무시해도 된다. hashCode()
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((isbn == null) ? 0 : isbn.hashCode());
    result = prime * result + ((title == null) ? 0 : title.hashCode());
    return result;
  }

  //==============================================================================================//  
  
  // 자동생성 - Source -> Generate hashCode() and equals()...
  
  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Book other = (Book) obj; // 다운캐스팅 
    if (isbn == null) {
      if (other.isbn != null) // 널체크 
        return false;
    } else if (!isbn.equals(other.isbn))
      return false;
    if (title == null) {
      if (other.title != null)
        return false;
    } else if (!title.equals(other.title))
      return false;
    return true; // 최종 
  }

  //==============================================================================================//  
  
  // 자동생성 - Source -> Generate toString()...
  
  @Override
  public String toString() {
    return "Book [isbn=" + isbn + ", title=" + title + "]";
  }
}
