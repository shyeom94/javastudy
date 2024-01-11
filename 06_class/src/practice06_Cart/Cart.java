package practice06_Cart;
// ArrayList<E>
public class Cart {

  // field
  public final static int CART_SIZE = 10; // 카트에 담을 수 있는 물건의 최대 수
  private Product[] products; // 카트에 담은 물건들
  private int count; // 카트에 담은 물건의 수

  // constructor
  public Cart(int cartSize) {
    products = new Product[Math.min(cartSize, CART_SIZE)];
  }

  // getter setter
  public Product[] getProducts() {
    return products;
  }

  public void setProducts(Product[] products) {
    this.products = products;
  }

  public int getCount() {
    return count;
  }

  public void setCount(int count) {
    this.count = count;
  }

  // 물건 담기
  public void addProduct(Product product) {

    // 카트가 꽉 찬 경우
    if (count == products.length) {
      System.out.println("카트가 가득 찼습니다.");
      return;
    }

    // 담을 물건이 없는 경우
    if (product == null) {
      System.out.println("카트에 담을 물건이 없습니다.");
      return;
    }

    products[count++] = product; // 인덱스 요소번호 count

  }

  // 물건 바꾸기
  public void changeProduct(int idx, Product product) {

    // 카트가 비어 있는 경우
    if (count == 0) {
      System.out.println("카트가 비어 있습니다.");
      return;
    }

    // 바꿀 물건이 없는 경우
    if (product == null) {
      System.out.println("바꿀 물건이 없습니다.");
      return;
    }

    // 존재하지 않는 물건 번호(인덱스)인 경우
    if (idx < 0 || idx >= products.length) {
      System.out.println("물건 번호가 잘못되었습니다.");
    }

    products[idx] = product; // 원래 index 위에 덮어 씌운다.

  }

  // 물건 빼기
  public void removeProduct(int idx) { // 물건을 빼서 null 값으로 만든다. // 배열 복사로 중간 값 삭제 후 채우기

    // 카트가 비어 있는 경우
    if (count == 0) {
      System.out.println("카트가 비어 있습니다.");
      return;
    }

    // 존재하지 않는 물건 번호(인덱스)인 경우
    if (idx < 0 || idx >= products.length) {
      System.out.println("물건 번호가 잘못되었습니다.");
    }

    /*
     * 물건이 5개(count)인 경우로 가정
     * 
     * 삭제할 idx            복사할 요소의 개수 (count - idx -1)
     * 0                     4         =           5   -  0  -1
     * 1                     3         =           5   -  1  -1
     * 2                     2         =           5   -  2  -1
     * 3                     1         =           5   -  3  -1
     * 4                     0         =           5   -  4  -1
     * 
     */
    
    System.arraycopy(products, idx + 1, products, idx, count - idx -1);
    count--;

  }

}


