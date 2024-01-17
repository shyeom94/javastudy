package practice01_Board;

import java.util.List;

public class MainClass {

  public static void main(String[] args) {

    BoardService boardService = new BoardService();

    List<BoardVo> boardList = boardService.getBoardList();

    // 출력하기 2가지 방법

    System.out.println("= = = toString 활용하기 = = =");

    // toString 활용하기
    for (int i = 0, size = boardList.size(); i < size; i++) {
      System.out.println(boardList.get(i));
    }

    System.out.println("= = = Getter 활용하기 = = =");

    //
    for (int i = 0, size = boardList.size(); i < size; i++) {
      System.out.println("번호 : " + boardList.get(i).getBoardNo());
      System.out.println("제목 : " + boardList.get(i).getTitle());
      System.out.println("작성자 : " + boardList.get(i).getWriter());
      System.out.println("작성일자 : " + boardList.get(i).getCreateAt());
    }

  }

}
