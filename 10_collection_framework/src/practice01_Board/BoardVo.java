package practice01_Board;

public class BoardVo {
  
  // field 
  private int boardNo;
  private String title;
  private String writer;
  private String createAt;
  
  // constructor
  public BoardVo() { // 디폴트 생성자
  }

  public BoardVo(int boardNo, String title, String writer, String createAt) {
    super();
    this.boardNo = boardNo;
    this.title = title;
    this.writer = writer;
    this.createAt = createAt;
  }

  // method
  public int getBoardNo() {
    return boardNo;
  }

  public void setBoardNo(int boardNo) {
    this.boardNo = boardNo;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getWriter() {
    return writer;
  }

  public void setWriter(String writer) {
    this.writer = writer;
  }

  public String getCreateAt() {
    return createAt;
  }

  public void setCreateAt(String createAt) {
    this.createAt = createAt;
  }

  // Source - Generate toString...
  @Override
  public String toString() {
    return "BoardVo [boardNo=" + boardNo + ", title=" + title + ", writer=" + writer + ", createAt=" + createAt + "]";
  }
  
  
  
}
