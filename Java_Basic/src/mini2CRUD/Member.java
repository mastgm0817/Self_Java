package mini2CRUD;
import java.util.ArrayList;

public class Member {
    private static int count = 0;  // 유저 번호 생성용 static 변수
    private String uName;
    private int uId = 0;
    private ArrayList<Board> myBoard;

    public Member(String uName){
        this.uId = count++;
        this.uName = uName;
        this.myBoard = new ArrayList<>();
    }

    // getter, setter
    public int getUid(){
        return uId;
    }
    public String getUname(){
        return uName;
    }
    public void setUid(int uId){
        this.uId = uId;
    }
    public void setUname(String uName){
        this.uName = uName;
    }

    public String toString(){
        return "User ID: "+uId+"User Name:"+uName;
    }

}
