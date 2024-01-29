package pkg08_intermedia_method;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MainClass {
  
  public static void method1() { // 짝수 출력하기 
    
    // filter() 메소드
    // Stream<T> filter(Predicate<T> predicate) {  }                    -> if 와 비슷하게 쓰임
    
    List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
    // Stream<Integer> numbers = list.stream(); 생략 가능
    list.stream()
    // numbers 생략 가능 
      .filter((number)  -> number % 2 == 0)
      .forEach((number) -> System.out.println(number));
    
  }

  public static void method2() { // 책들 리스트 
  
    List<Book> books = Arrays.asList(
        new Book("a", "aa", 20000),
        new Book("b", "bb", 8000),
        new Book("c", "cc", 15000),
        new Book("d", "dd", 9000),
        new Book("e", "ee", 25000)
        );
    
    books.stream()
        .filter((book) -> book.getPrice() >= 10000)
        .forEach((book) -> System.out.println(book.getTitle()));
    
    List<Book> over20000 = books.stream()
        .filter((book) -> book.getPrice() >= 20000) // 20000원 넘는 책을 리스트로 모아줌
        .collect(Collectors.toList());
    
    System.out.println(over20000);
    
  }

  public static void method3() {
    
    // map() 메소드 : 값을 바꿀 때 사용한다. 
    // Stream<T> map(Function<T, R> function) {  }
    
    List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

    list.stream()    // 스트림으로 만드는 이유는 map 의 여러가지 값을 리스트로 바꿀 수 있으므로
      .map((number) -> number + 1)
      .forEach((number) -> System.out.println(number));
  }
  
  public static void method4() { // 20000원 이상은 책 가격을 50% 세일한 리스트를 생성하기 

    List<Book> books = Arrays.asList(
        new Book("a", "aa", 20000),
        new Book("b", "bb", 8000),
        new Book("c", "cc", 15000),
        new Book("d", "dd", 9000),
        new Book("e", "ee", 25000)
        );
    
    List<Book> saleList = books.stream()
        .filter((book) -> book.getPrice() >= 20000)
        .map((book) -> new Book(book.getTitle(), book.getAuthor(), book.getPrice() / 2))
        .toList();
        
    saleList.stream()
        .forEach((book) -> System.out.println(book.getTitle() + " : " + book.getPrice() / 2));
    
  }

  public static void main(String[] args) {

    method1();
    method2();
    method3();
    method4();

  }
}
