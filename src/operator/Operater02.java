
package src.operator;
import java.util.Scanner;

public class Operater02 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("정수를 입력하세요 : ");
        int score = scan.nextInt();

        if (score %2 == 0){
            System.out.println("짝수");
            }
        else{
            System.out.println("홀수");
        }
        
        if (score%2 ==0 && score%3==0){
            System.out.println("공배수이다");
        }
        else{
            System.out.println("공배수 아니다");
        }
        
        scan.close();

    }
}
