package mini2CRUD;
import java.util.Scanner;
import java.util.ArrayList;

public class Membership {
    private ArrayList<Member> members;
    private ArrayList<Board> boards;
    Scanner sc = new Scanner(System.in);

    public Membership(){
        members = new ArrayList<>();
        boards = new ArrayList<>();;
    }

    public void join(){
        System.out.println("이름을 입력하세요.");
        String uname = sc.next();
        // if(members.isEmpty())
        Member member = new Member(uname);
        members.add(member);
        System.out.println(members);
        System.out.println("회원가입이 완료되었습니다.");
        
        // else{
        //     for(Member m : members){
        //         if(m.getUname() != uname)
        //         {
        //             System.out.println("가입된 회원이 없습니다.");
        //         }
        //     }
        // }
    }
    public void write()
    {
        System.out.println("작성자의 이름을 입력해주세요: ");
        String wname = sc.next();
        boolean isExist = false;
        int uid = 0;

        for(Member m: members){
            if(m.getUname().equals(wname)){
                isExist = true;
                uid = m.getUid();
                break;
            }
        }
        if(!isExist){
            System.out.println("그런 사람은 없습니다.");
            return;
        }

        System.out.println("제목을 입력해주세요.");
        String title = sc.next();
        System.out.println("내용을 입력해주세요.");
        String contents = sc.next();
        Board board = new Board(title, contents, uid);
        boards.add(board);
        System.out.println(wname +"님이 글을 작성하셨습니다.");

    }
    public void read(){
        System.out.println("조회하기");
        System.out.println("------------------");
        System.out.println("1. 회원 조회 ");
        System.out.println("2. 게시글 조회 ");
        System.out.println("------------------");
        int option = sc.nextInt();
        switch(option){
            case 1: //회원조회
                if(members.isEmpty()){
                    System.out.println("조회할 회원이 없습니다.");
                    break;
                }
                else{
                    System.out.println("1. 전체 조회");
                    System.out.println("2. 특정 유저 조회");
                    int pick = sc.nextInt();
                    switch(pick){
                        case 1:
                        for (Member m : members){
                            // m.toString();
                            System.out.println("UserNo:"+m.getUid()+" User Name:"+m.getUname());
                        }
                        break;
                        case 2:
                        System.out.println("검색할 유저 이름을 입력하세요.");
                        String pickedName = sc.next();
                        for (Member m : members){
                            if (m.getUname().equals(pickedName)){
                                System.out.println("UserNo:"+m.getUid()+" User Name:"+m.getUname());
                            }
                            break;
                        }
                    }
                    break;
                }
                case 2: //게시글조회
                if(boards.isEmpty()){
                    System.out.println("조회할 글이 없습니다.");
                    break;
                }
                else{
                    System.out.println("1. 전체 조회");
                    System.out.println("2. 특정 게시글 조회");
                    int pick = sc.nextInt();
                    switch(pick){
                        case 1:
                        for (Board b : boards){
                            // m.toString();
                            System.out.println("BoardNo:"+b.getBId()+" Title:"+b.getTitle());
                        }
                        break;
                        case 2:
                        System.out.println("검색할 게시글 번호를 입력하세요.");
                        int pickedNo = sc.nextInt();
                        for (Board b : boards){
                            if (b.getBId() == pickedNo){
                                System.out.println("UserNo: "+b.getWId()+" Title : "+b.getTitle()+" Contents: "+b.getContent());
                                break;
                            }
                            else{
                                System.out.println("게시글 번호를 잘못 입력하셨습니다.");
                            }
                        }
                    }
                break;
            }
        }
    }
    public void update(){
        System.out.println("작성자명을 입력해주세요.");
        String uname = sc.next();
        for(Member m: members){
            if(uname.equals(m.getUname())){
                System.out.println("---------------");
                System.out.println("1. 제목 수정");
                System.out.println("2. 내용 수정");
                System.out.println("3. 뒤로가기");
                System.out.println("---------------");
                System.out.println("어떤것을 수정하시겠어요?");
                int option = sc.nextInt();
                switch(option){
                    case 1: // 제목수정
                        for (Board b: boards){
                            if(b.getWId() ==  m.getUid()){
                                // 사용자가 작성한 게시글 다 보여주기 추가
                                System.out.println("제목을 입력하세요.");
                                String new_title = sc.next();
                                b.setTitle(new_title);
                                System.out.println("제목이 수정되었습니다.");
                                break;
                            }
                            else
                            {
                                System.out.println("작성한글이 존재하지 않습니다.");
                            }
                        }
                    case 2: // 내용수정
                    for (Board b: boards){
                        if(b.getWId() ==  m.getUid()){
                            // 사용자가 작성한 게시글 다 보여주기 추가
                            System.out.println("내용을 입력하세요.");
                            String new_content = sc.next();
                            b.setContent(new_content);
                            System.out.println("내용이 수정되었습니다.");
                            break;
                        }
                        else
                        {
                            System.out.println("작성한글이 존재하지 않습니다.");
                        }
                    }
                    // case 3: //뒤로 가기

                    // default: // 이상한값 입력했을때
                }
            }
            else{
                System.out.println("그런 사용자는 없습니다.");
            }
        }
    }
    public void delete(){
        System.out.println("삭제할 게시글 번호를 입력해주세요.");
        int dno = sc.nextInt();
        for(Board b: boards){
            if( b.getBId() == dno){
                boards.remove(b);
                System.out.println("삭제되었습니다.");
                break;
            }
            else{
                System.out.println("게시물 번호를 잘못입력하셨습니다.");
            }
        }
    }
}
