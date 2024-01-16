package pkg08_Object;

public class Student {

  // field
  private int stuNo;
  private String name;
  private Book[] books; 
  private int bookCount; 

  //==============================================================================================//
  
  // constructor
  public Student() {
    books = new Book[100];
  }

  public Student(int stuNo, String name) {
    super();
    this.stuNo = stuNo;
    this.name = name;
    books = new Book[100]; // 책 배열 선언, 최대 100 까지 
  }

  //==============================================================================================//
  
  // method
  public int getStuNo() {
    return stuNo;
  }

  public void setStuNo(int stuNo) {
    this.stuNo = stuNo;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Book[] getBooks() {
    return books;
  }

  public void setBooks(Book[] books) {
    this.books = books;
  }

  public int getBookCount() {
    return bookCount;
  }

  public void setBookCount(int bookCount) {
    this.bookCount = bookCount;
  }

  //==============================================================================================//  
  
  // 책 등록
  public void addBook(Book book) {

    if (bookCount >= books.length) {
      System.out.println("더 이상 책을 등록할 수 없습니다.");
      return;
    }
    books[bookCount++] = book;
  }
  
  //==============================================================================================//    

  // 책 삭제
  public void removeBook(int idx) { // 인덱스를 입력했을 경우, 

    if (idx < 0 || idx >= bookCount) {
      System.out.println("잘못된 인덱스입니다.");
      return;
    }
    System.arraycopy(books, idx + 1, books, idx, bookCount - idx - 1);
    bookCount--;
    books[bookCount] = null; // 삭제 후처리 
  }

  //==============================================================================================//    
  
  // 책 삭제 (Overloading)
  public void removeBook(Book book) { // 책 이름을 입력했을 경우,

    if (bookCount == 0) {
      System.out.println("저장된 책이 없습니다.");
      return;
    }

    for (int i = 0; i < bookCount; i++) {
      if (book.equals(books[i])) { // Book 클래스에 Object class 의 equals() method Override 해야 한다. (isbn 이 같으면 true 반환)
        System.arraycopy(books, i + 1, books, i, bookCount - i - 1);
        bookCount--;
        books[bookCount] = null; // 삭제 후처리 
        break;
      }
    }
  }

  //==============================================================================================//  
  
  /*
   * Object 클래스의 equals() 메소드 오버라이드 stuNo 필드 값이 일치하면, true 반환
   */

  @Override
  public boolean equals(Object obj) {
    if (obj == null)
      return false;
    if (obj == this)
      return true;
    return this.stuNo == ((Student) obj).stuNo;
    // return super.equals(obj);
  }

  //==============================================================================================//  
  
  
  /*
   * Object 클래스의 toString() 메소드 오버라이드 "stuNo : 10101, name : 고길동" 형식의 문자열 반환
   */

  @Override
  public String toString() {
    return "stuNo : " + stuNo + ", name : " + name;
  }

  //==============================================================================================//  

  
}
