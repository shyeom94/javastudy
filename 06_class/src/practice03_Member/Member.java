package practice03_Member;

public class Member {
  
  // field
  private String id;
  private Contact contact; // 클래스 안에 필드로 다른 클래스를 불러옴
  private Address address; // "
  
  // constructor
  
  // 초기화 없는거 하나
  public Member() {
  }

  // 초기화 하는거 하나
  public Member(String id, Contact contact, Address address) {
    super();
    this.id = id;
    this.contact = contact;
    this.address = address;
  }

  // getter setter 
  
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Contact getContact() {
    return contact;
  }

  public void setContact(Contact contact) {
    this.contact = contact;
  }

  public Address getAddress() {
    return address;
  }

  public void setAddress(Address address) {
    this.address = address;
  }
  
  // 값을 저장하는 밸류 오브젝트 VO : value object
  
  
  
}
