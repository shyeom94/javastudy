package pkg02_has_a;

public class Gun {
  
  public final static int MAX_BULLET = 20;
  private int bullet;
 
  public Gun() {
    bullet = 10; // 기본 생성 
  }

  public int getBullet() {
    return bullet;
  }

  public void setBullet(int bullet) {
    this.bullet = bullet;
  }
  
  public void shoot() {
    
    if(bullet == 0) {
      System.out.println("총알이 없습니다.");
      return;
    }   
    System.out.println("탕! 현재 총알은 " + --bullet +"개 남았습니다. ");
  }
  
  public void reload(int bullet) {
    
    if(bullet <= 0) {
      System.out.println("정상적으로 총알을 장전하세요.");
      return;
    }
    
    if(this.bullet + bullet > MAX_BULLET) {
      System.out.println("총알이 꽉 찼습니다.");
      return;
    }
    
    this.bullet += bullet;
    System.out.println(bullet + "발 장전 완료. 현재 " + this.bullet + "발 있음");
    
  }
  
  
  
}


