package pkg01_File;

import java.io.File;

public class MainClass {
  /*
   * java.io.File
   * 1. 디렉터리, 파일을 관리하는 클래스이다.
   * 2. 디렉터리, 파일을 만들고 삭제할 수 있다. 
   * 3. 디렉터리, 파일의 정보(이름, 경로, 파일 크기, 최종 수정일 등)를 확인할 수 있다. 
   */
  
  /*
   * 경로 작성 방법
   * 1. 경로 구분자 (separator)
   *    1) 윈도우      : \ 역슬래시 (자바에서는 \\) 
   *    2) 리눅스, Mac : / 슬래시  
   *    3) File.separator 필드를 사용하면 플랫폼에 따른 경로 구분자가 자동 삽입된다. 
   *        => 최근 윈도우는 / 로 해도 인식한다. 
   *        
   * 2. 디렉터리
   *    1) root 루트 최상위 디렉터리 : 경로 구분자로 시작하는 경로는 루트에서 시작하는 경로 
   *    2) 상위 : ..
   *    3) 현재 : .  
   */
  
  public static void method1() { // 디렉터리 만들기/삭제하기 

    // File 객체 선언 
    File dir; 
    
    // File 객체 생성 
    dir = new File("\\storage"); // 폴더 이름 
    
    // 디렉터리 유무에 따른 생성 
    if (!dir.exists()) { // 디렉터리가 없으면, 
     //(dir.exists() == false) => 프로젝트의 코드 작성 규칙에 따라 다른 방식으로 작성한다. 
      dir.mkdirs(); // 항상 복수형 사용하기 
    } else {               // 디렉터리가 있으면, 
      // dir.deleteOnExit();  // JVM 실행이 종료된 이후 삭제한다. 
      dir.delete();        // JVM 실행 중에 바로 삭제한다. 
    }
 
  }

  public static void method2() { // 파일 만들기/삭제하기 
    
    // 파일이 저장될 디렉터리 작업
    File dir = new File("\\storage");
    if(!dir.exists()) {
      dir.mkdirs();
    }
    
    // 생성할 파일 작업
    // 파일을 File 객체로 생성
    File file = new File(dir, "sample.txt");

    // 파일 유무에 따른 생성/삭제
    if (file.exists()) { // 파일이 있으면
      file.delete();
      // file.deleteOnExit();
    } else { // 파일이 없으면
      try {
        file.createNewFile(); // 예외처리 필요하다. - IOException
      } catch (Exception e) { // IOException 처리가 반드시 필요하다. (Checked Exception)
        System.out.println();
      }
    }
  }

  public static void main(String[] args) {
    
    //method1(); // 디렉터리 만들기/삭제하기
    method2(); // 파일 만들기/삭제하기

  }

}
