package pkg02_generic_type;

// 제네릭 클래스 
public class Container<T> {

  // private Object item; // 모든 타입을 담을 수 있지만, 꺼낼 때마다 캐스팅해야 한다.
  private T item;

  public T getItem() {
    return item;
  }

  public void setItem(T item) {
    this.item = item;
  }

}
