package src.operator;
// import java.util.Scanner;

public class Comp {
    public static void main(String[] args) {
        // [문제] 변수의 값이 대문자이면 소문자로 변환해서 출력,
        //  소문자이면 대문자로 변환해서 출력하시오
        // [실행결과]
        // B → b         e → E



        // System.out.print("변환 하고 싶은 문자를 입력하세요 : ");
        // Scanner scan = new Scanner(System.in);
        // String ste =scan.next();
        // char ch = ste.charAt(0);
        // scan.close();


        char ch ='B';

        System.out.println("[실행결과]");

        if(Character.isUpperCase(ch)) {
            System.out.println(ch+"-> "+(char)(ch+32));
          }
        if(Character.isLowerCase(ch)) {
        System.out.println(ch+"-> "+(char)(ch-32));
        }

    
    }


}
