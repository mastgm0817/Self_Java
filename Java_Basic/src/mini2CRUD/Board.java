package mini2CRUD;


public class Board {
    private static int count = 0;  // 글 번호 생성용 static 변수
    private int bId;   // 글 번호
    private String title; // 글 제목
    private String content;  // 글 내용
    private int wId; // 글 작성자 번호

    Board(String title, String content, int wId){
        this.bId = ++count;
        this.title = title;
        this.content = content;
        this.wId = wId;
    }


    // Getter, Setter
    public String getTitle() {
        return title;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }
    
    public void setContent(String content) {
        this.content = content;
    }

    public int getWId() {
        return wId;
    }
    
    public void setWId(int wId) {
        this.wId = wId;
    }
    
    public int getBId() {
        return bId;
    }
    
    public void setBId(int bId) {
        this.bId = bId;
    }

    @Override
    public String toString() {
        return "wId: " + wId + ", bId: " + bId + ", title: " + title + ", content: " + content;
    }

}
