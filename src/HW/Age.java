package src.HW;
import java.util.Scanner;

class Member{
    private int age;
    private String name,address,callnum;
    public Member(){
        this.age = 0;
        this.callnum = "010-1234-5678";
        this.name = "홍길동";
        this.address = "서울";
    }
    public Member(int age,String callnum,String name,String address) {
        this.age = age;
        this.callnum = callnum;
        this.name = name;
        this.address = address;
    }

}





public class Age {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        Member[] member = new Member[5];
        int count = 0;
        while(true){
            System.out.println("*************");
            System.out.println("1. 가입");
            System.out.println("2. 출력");
            System.out.println("3. 수정");
            System.out.println("4. 탈퇴");
            System.out.println("5. 끝내기");
            System.out.println("*************");
            int number = scan.nextInt();
            scan.nextLine();

            if(number == 1 && count <4){
                count ++;
                System.out.print("이름 입력 : ");
                String name = scan.nextLine();
                System.out.print("나이 입력 : ");
                int age = scan.nextInt();
                scan.nextLine();
                System.out.print("핸드폰 입력 : ");
                String callnum = scan.nextLine();
                System.out.print("주소 입력 : ");
                String address = scan.nextLine();
                member[count] =new Member(age,callnum,name,address);
            }
            else if (number == 1 && count >4){
                System.out.println("정원이 꽉 찼습니다.");
            }
            else if (number ==5 ){
                System.out.println("나가기");
                System.exit(1);
            }


            
        }
        
    }
}
