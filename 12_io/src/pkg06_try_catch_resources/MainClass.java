package pkg06_try_catch_resources;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class MainClass {
  
  /*
   * try - catch - resources
   * 1. 생성한 자원(resource, 대표적으로 입출력 스트림)을 자동으로 close 하는 try 문이다. 
   *    -> 자동으로 close ...> 몇몇 상황에는 사용하면 안된다. close 가 사용되면 안되는 상황
   * 2. try (자원 생성) {
   *  
   *    } catch(  ) {
   *  
   *    }
   */  

  public static void method1() {

    File dir = new File("\\storage");

    if (!dir.exists()) {
      dir.mkdirs();
    }

    File file = new File(dir, "sample4.txt");

    try (BufferedWriter out = new BufferedWriter(new FileWriter(file))) {

      out.write("안녕하세요");
      out.newLine();
      out.write("반갑습니다");
      out.newLine();

    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  public static void method2() {

  }

  public static void main(String[] args) {

    method1();

  }
}
