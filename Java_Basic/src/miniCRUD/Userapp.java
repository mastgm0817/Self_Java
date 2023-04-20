package miniCRUD;
import java.util.Scanner;
import java.util.ArrayList;
// import library

public class Userapp {
    public static void main(String[] args) throws Exception {
        ArrayList<User> users = new ArrayList<>();
        boolean power = true;
        while(power){
            System.out.println("---------------------");
            System.out.println("---------------------");
            System.out.println("User CRUD 연습코드");
            System.out.println("1. Create User data");
            System.out.println("2. Read User data");
            System.out.println("3. Update User data");
            System.out.println("4. Delete User data");
            System.out.println("5. Exit");
            System.out.println("---------------------");
            System.out.println("---------------------");
            System.out.println("무엇을 하시겠습니까? 선택하세요.");
            // input scanner
            Scanner sc = new Scanner(System.in);
            int option = sc.nextInt();
            // switch-case
            switch(option){
                // create User data
                case 1:
                System.out.println("유저의 이름을 입력하세요.");
                String uName = sc.next();
                System.out.println("유저의 Id를 입력하세요.");
                int uId = sc.nextInt();
                User user = new User(uId, uName);
                users.add(user);
                System.out.println("User added successfully");
                // read User data
                break;
                case 2:
                System.out.println("검색할 유저 아이디를 입력해주세요: ");
                int search = sc.nextInt();
                for(User u: users){
                    if(u.getId() == search){
                        System.out.println(u.getId());
                        System.out.println(u.getName());
                    }
                    else{
                        System.out.println("찾으시는 아이디가 없습니다.");
                    }
                }
                break;
                // update User data
                case 3:
                System.out.println("수정할 유저 아이디를 입력해주세요: ");
                int updateId = sc.nextInt();
                for(User u: users){
                    if(u.getId() == updateId){
                        System.out.println("이름을 뭐로 변경하시겠어요?: ");
                        String updateName = sc.next();
                        u.setName(updateName);
                        System.out.println("이름이" + u.getName()+ "로 수정되었습니다.");
                    }
                    else{
                        System.out.println("찾으시는 아이디가 없습니다.");
                    }
                }
                break;
                // delete User data
                case 4:
                System.out.println("삭제할 유저 아이디를 입력해주세요: ");
                int deleteId = sc.nextInt();
                for(User u: users){
                    if(deleteId == u.getId()){
                        users.remove(u);
                        System.out.println("삭제되었습니다.");
                        break;
                    }
                    else
                    {
                        System.out.println("찾으시는 아이디가 없습니다.");
                    }
                }
                break;
                // exit
                case 5:
                    System.out.println("종료하겠습니다.");
                    power = false;
                    break;
                default:
                    System.out.println("그런 옵션은 없습니다.");
    
            }

        }

    }
}
