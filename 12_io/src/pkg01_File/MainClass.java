package pkg01_File;

import java.io.File;
import java.security.Timestamp;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;

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
        e.printStackTrace();
      }
    }
  }

  public static void method3() { // 
    
    /*
     * File 클래스의 주요 메소드
     * 1. listFiles()    : 디렉터리 내의 모든 file 객체를 File[] 배열로 반환
     * 2. getName()      : 이름 반환
     * 3. getParent()    : 저장된 디렉터리 반환
     * 4. getPath()      : getParent() + getName()
     * 5. LastModified() : 최종 수정일을 long 타입으로 반환 -> 타임스탬프 방식
     * 6. length()       : 파일 크기를 long 타입으로 반환 (바이트 단위)
     * 7. isDirectory()  : 디렉터리면 true 반환
     * 8. isFile()       : 파일이면 true 반환
     */
    
    // JAVA_HOME (환경변수) 을 File 객체로 생성
    File javaHome = new File("\\Program Files\\Java\\jdk-17");

    // JAVA_HOME 에 있는 모든 디렉터리와 파일을 File 객체로 가져오기
    File[] files = javaHome.listFiles();

    // for 문 사용하여 파일 하나씩 확인
    for (File file : files) {

      StringBuilder builder = new StringBuilder();

      // 이름
      builder.append(String.format("%-20s", file.getName().substring(0, Math.min(file.getName().length(), 20)))); // "%-20s" -> 20 자리 폭을 가진 파일 이름

      // 최종 수정일
      String lastModified = new SimpleDateFormat("yyyy-MM-dd a h:mm").format(file.lastModified());
      builder.append(String.format("%-20s", lastModified));

      // 유형
      builder.append(String.format("%-10s", file.isDirectory() ? "파일 폴더" : "파일"));

      // 크기
      long byteSize = file.isDirectory() ? 0 : file.length();
      long kbSize = (byteSize / 1024) + (byteSize % 1024 != 0 ? 1 : 0); // 나머지가 0이 아니면 -> 나머지가 존재 하면
      if (byteSize != 0)
        builder.append(String.format("%10s", new DecimalFormat("#,##0").format(kbSize) + "KB"));
      
      // 출력 
      System.out.println(builder.toString());

      // 파일 폭 맞춰서 출력하는 방법 
      
      // 로그 줄 맞춰서 출력하는 방법 
      
    }
  }

  public static void main(String[] args) {
    
    //method1(); // 디렉터리 만들기/삭제하기
    //method2(); // 파일 만들기/삭제하기
    //method3();
    
    //practice1();
    practice2(new File("\\2024\\01\\22")); 
    
  }

  public static void practice1() {
    
    // C:\2024\01\22 디렉터리 만들기 (현재 년도 \ 월 \ 일 디렉터리 만들기) 
    
    LocalDate today = LocalDate.now();
    int year = today.getYear();
    int month = today.getMonthValue();
    int day = today.getDayOfMonth();
    
    StringBuilder builder = new StringBuilder();
    
    builder.append("\\");
    builder.append(year);
    builder.append("\\");
    builder.append(String.format("%02d", month));
    builder.append("\\");
    builder.append(String.format("%02d", day));
    
    File dir = new File(builder.toString()); // 경로. 폴더 이름
    
    if(!dir.exists()) { // 없으면, 만드시오.
      dir.mkdirs();
    }
    
    System.out.println(dir.getPath() + "디렉터리 생성이 완료되었습니다.");
  }
  
  public static void practice2(File dir) {
    
    // C:\2024 디렉터리 삭제하기 - 비어있는 디렉터리만 지울 수 있다. 
    
    // 순서대로 하나씩 삭제할 수 있다. 
    
    // 재귀호출로 작성하기 (자기가 자기를 호출하는 방식)
    // \2024\01\22 삭제 -> \2024\01 삭제 -> \2024 삭제 
    
    // 파라미터 File dir 객체의 상위 디렉터리가 없으면 종료 
    File parent = dir.getParentFile();
    if (parent == null) {
      return;
    }

    // 현재 디렉터리를 삭제한다.
    System.out.println(dir.getPath() + " 삭제했습니다.");
    dir.delete();
    
    // 상위 디렉터리를 practice2 메소드에 전달
    practice2(parent);
    
  }
}
