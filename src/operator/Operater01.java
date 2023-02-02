
package src.operator;
import java.util.Scanner;

public class Operater01 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("점수 입력 : ");
        int score = scan.nextInt();
        String result = score >= 80 && score <=100 ? "합격" : "불합격";

        System.out.println(result);

        // if (score>=80){
        //     System.out.println("합격");
        // }
        // else{
        //     System.out.println("불합격");
        // }
        scan.close();


    }
}
