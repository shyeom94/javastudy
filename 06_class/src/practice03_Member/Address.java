package practice03_Member;

public class Address {

  // field - class 내의 field 는 특별한 사유가 없으면 외부에 공개하지 않는다.(private)
  private String postCode;
  private String readAddress;
  private String jibunAddress;
  private String detailAddress;
  private String extraAddress;
  private boolean isBasicAddress;

//============================================================================================================================  
  
  // constructor 디폴트 형식의 아무일도 안하는 생성자

  // constructor 생성자. 값을 전달해서 setter 와 역할이 같다.
  public Address() { // publuc 으로 선언하는 이유 : 외부에서 접근이 용히해야 하므로 
  }

  // 필드값을 유지하는 생성자
  public Address(String postCode, String readAddress, String jibunAddress, String detailAddress, String extraAddress,
      boolean isBasicAddress) {
    super();
    this.postCode = postCode;
    this.readAddress = readAddress;
    this.jibunAddress = jibunAddress;
    this.detailAddress = detailAddress;
    this.extraAddress = extraAddress;
    this.isBasicAddress = isBasicAddress;
  }

//============================================================================================================================  
    
  // method getter / setter 입출력 용도 - class 에서 기능을 수행한다. 
  public String getPostCode() {
    return postCode;
  }

  public void setPostCode(String postCode) {
    this.postCode = postCode;
  }

  public String getReadAddress() {
    return readAddress;
  }

  public void setReadAddress(String readAddress) {
    this.readAddress = readAddress;
  }

  public String getJibunAddress() {
    return jibunAddress;
  }

  public void setJibunAddress(String jibunAddress) {
    this.jibunAddress = jibunAddress;
  }

  public String getDetailAddress() {
    return detailAddress;
  }

  public void setDetailAddress(String detailAddress) {
    this.detailAddress = detailAddress;
  }

  public String getExtraAddress() {
    return extraAddress;
  }

  public void setExtraAddress(String extraAddress) {
    this.extraAddress = extraAddress;
  }

  // boolean type 의 getter 는 is 로 시작한다.
  public boolean isBasicAddress() {
    return isBasicAddress;
  }

  public void setBasicAddress(boolean isBasicAddress) {
    this.isBasicAddress = isBasicAddress;
  }

//============================================================================================================================  
    
  // VO : Value Object
  // DTO : DB 로 값을 전달하거나 읽어들이는 역할

  // 둘 다 통칭해서 : Bean. 데이터를 주고받는 단위.

}
