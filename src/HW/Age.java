package src.HW;
import java.util.Scanner;

class Member{
    Scanner scan = new Scanner(System.in);
    private int age;
    private String name,address,callnum;
    
    public Member(int age,String callnum,String name,String address) {
        this.age = age;
        this.callnum = callnum;
        this.name = name;
        this.address = address;
    }
    public int getAge() {
        return this.age;
    }
    public String getCallnum() {
        return this.callnum;
    }
    public String getName() {
        return this.name;
    }
    public String getAddress() {
        return this.address;
    }

    public void update(String callnum){
        if(callnum==this.callnum){
            System.out.println("수정 할 나이 입력 : ");
            this.age = scan.nextInt();
            scan.nextLine();
            System.out.println("수정 할 이름 입력 : ");
            this.name = scan.nextLine();
            System.out.println("수정 할 주소 입력 : ");
            this.address = scan.nextLine();
            System.out.println("1 row(s) updated");
        }
      
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

            if(number == 1 && count <5){
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
                count ++;
            }
            else if (number == 1 && count >=5){
                System.out.println("!!!!! 5명의 정원이 꽉 찼습니다.!!!!!");
            }
            else if (number == 2){
                System.out.println("출력");
                for(int i=0; i<count; i++){
                    System.out.println("=============================");
                    System.out.println("나이 : "+(member[i].getAge()));
                    System.out.println("이름 : "+(member[i].getName()));
                    System.out.println("핸드폰 : "+(member[i].getCallnum()));
                    System.out.println("주소 : "+(member[i].getAddress()));
                    System.out.println("=============================");
                }
            }
            else if (number ==3){
                System.out.print("핸드폰 번호 입력 :");
                String callnum1 = scan.nextLine();
                for(int i=0; i<count; i++){
                    member[i].update(callnum1);
                }
                
            }
            else if (number ==5 ){
                System.out.println("나가기");
                System.exit(1);
            }


            
        }
        
    }
}
