package practice02_Cart;

import java.util.ArrayList;
import java.util.List;

// => ArrayList 로 바꾸기
public class Cart {

  // field
  private List<Product> products; // 카트에 담은 물건들 

  // constructor
  public Cart(int cartSize) {
    products = new ArrayList<Product>(cartSize);
  }

  // getter setter
  public List<Product> getProducts() {
    return products;
  }

  public void setProducts(List<Product> products) {
    this.products = products;
  }
 
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////  

  // 물건 담기
  public void addProduct(Product product) {

    // 카트가 꽉 찬 경우 =============> ArrayList 에서 불가능한 경우
//    if (count == products.length) {
//      System.out.println("카트가 가득 찼습니다.");
//      return;
//    }

    // 담을 물건이 없는 경우
    if (product == null) {
      
      System.out.println("카트에 담을 물건이 없습니다.");
      return;
    
    }
    products.add(product); // 인덱스 요소번호 count
  }

  // 물건 바꾸기
  public void changeProduct(int idx, Product product) {

    // 예외 처리

    // 카트가 비어 있는 경우
    if (products.size() == 0) {
      System.out.println("카트가 비어 있습니다.");
      return;
    }

    // 바꿀 물건이 없는 경우
    if (product == null) {
      System.out.println("바꿀 물건이 없습니다.");
      return;
    }

    // 존재하지 않는 물건 번호(인덱스)인 경우
    if (idx < 0 || idx >= products.size()) {
      System.out.println("물건 번호가 잘못되었습니다.");
    }

    // 실제 수정하는 코드
    products.set(idx, product); // 원래 index 위에 덮어 씌운다.

  }
  
  // 물건 빼기
  public void removeProduct(int idx) { // 물건을 빼서 null 값으로 만든다. // 배열 복사로 중간 값 삭제 후 채우기

    // 카트에 담긴 물건 개수
    int size = products.size();
    
    // 카트가 비어 있는 경우
    if (size == 0) {
      System.out.println("카트가 비어 있습니다.");
      return;
    }

    // 존재하지 않는 물건 번호(인덱스)인 경우
    if (idx < 0 || idx >= size) {
      System.out.println("물건 번호가 잘못되었습니다.");
    }
    
    // 삭제하는 method
    // index 로 지우는 기반
    products.remove(idx);

    // 이전 코드
    //    System.arraycopy(products, idx + 1, products, idx, count - idx -1);
    //    count--;

  }
  
  
  
  

}


