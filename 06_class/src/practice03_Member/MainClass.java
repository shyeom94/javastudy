package practice03_Member;

public class MainClass {

  public static void main(String[] args) {
    
    // 요구사항 : 임의의 정보를 가지는 Member 1명을 만들고, 정보 출력하기 
    
//=================================================================================    
    
    // 객체 만드는 방법 2가지 
    // 1. 디폴트 형식의 생성자 + setter 
    // 2. 필드를 이용한 생성자 constructor using field 
        
    // 2. 필드를 이용한 생성자
    Address address = new Address("12345", "A", "B", "C", "D", true);
    
    // 2. 필드를 이용한 생성자 
    Contact contact = new Contact("02", "010");
    
    // 1. 디폴트 형식의 생성자 + setter
    Member member = new Member();
    member.setId("yeom");
    member.setContact(contact);
    member.setAddress(address);
    
//=================================================================================    
        
    // 정보 출력에 getter 사용하기
    System.out.println("아이디         : " + member.getId());
    System.out.println("우편번호       : " + member.getAddress().getPostCode());
    System.out.println("도로명         : " + member.getAddress().getReadAddress());
    System.out.println("지번           : " + member.getAddress().getJibunAddress());
    System.out.println("상세           : " + member.getAddress().getDetailAddress());
    System.out.println("추가           : " + member.getAddress().getExtraAddress());
    System.out.println("기본 주소 여부 : " + member.getAddress().isBasicAddress());
    System.out.println("집전화         : " + member.getContact().getTel());
    System.out.println("휴대전화       : " + member.getContact().getMobile());

  }
}


