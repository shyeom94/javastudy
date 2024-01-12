package practice02_Cup;
/*
 * 동적 바인딩
 * 호출하는 대상과 실행하는 대상이 다를 때
 * 호출은 부모것으로 하고 실행은 자식으로 한다. 
 * 
 * 정적 바인딩
 * 호출하는 대상과 실행하는 대상이 같을 때
 * 
 */
public class Coffee {
  
  public void whoami() { // 호출할 수 있도록
    
    System.out.println("나는 커피"); 
    
  }
  
}


