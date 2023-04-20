package mini2CRUD;
import java.util.Scanner;
public class show {
    public static void main(String[] args) throws Exception {
        int option;
        Scanner sc = new Scanner(System.in);
        Membership memberships = new Membership();
        while(true){
            System.out.println("--------------------");
            System.out.println("1. 회원가입 ");
            System.out.println("2. 조회하기 ");
            System.out.println("3. 글작성하기 ");
            System.out.println("4. 글수정하기 ");
            System.out.println("5. 글삭제하기 ");
            System.out.println("6. 끝내기 ");
            System.out.println("--------------------");
            System.out.println("--------------------");
            System.out.println("--------------------");
            System.out.println("선택하세요 :");
            option = sc.nextInt();
            switch(option){
                case 1:
                memberships.join();
                break;
                case 2:
                memberships.read();
                break;
                case 3:
                memberships.write();
                break;
                case 4:
                memberships.update();
                break;
                case 5:
                memberships.delete();
                break;
                case 6:
                System.out.println("시스템을 종료합니다.");
                return;
                default:
                System.out.println("그런 옵션은 없습니다.");
                break;
            }
        }
    }
}
