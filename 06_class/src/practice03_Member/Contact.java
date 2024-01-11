package practice03_Member;

public class Contact {

  // field
  private String tel;
  private String mobile;

  // 필드값의 초기화를 안하는 생성자
  public Contact() {

  }

  // 필드값을 초기화해주는 생성자
  public Contact(String tel, String mobile) {
    super();
    this.tel = tel;
    this.mobile = mobile;
  }

  // getter / setter
  public String getTel() {
    return tel;
  }

  public void setTel(String tel) {
    this.tel = tel;
  }

  public String getMobile() {
    return mobile;
  }

  public void setMobile(String mobile) {
    this.mobile = mobile;
  }

}
