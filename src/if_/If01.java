package src.if_;
import java.nio.charset.Charset;
import java.util.Scanner;

public class If01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("숫자입력 : ");
        int a = scan.nextInt();

        if(a<=50){
            System.out.println(a+"는 50 보다 작다");
        }
        else{
            System.out.println(a+"는 50보다 크거나 같다");
        }
        System.out.println();
        


        // if(true){
        //     if(false){
        //         System.out.println("A");
        //     }
        //     else{
        //         System.out.println("B");
        //     }
        // }

        char b = 'A';
        
        if(Character.isUpperCase(a)){
            System.out.println((char)(a)+"는 대문자");
        }
        else if (Character.isLowerCase(a)){
            System.out.println((char)(a)+"는 소문자");
        }
        else{
            System.out.println((char)(a)+"는 숫자거나 특수문자");
        }

        scan.close();
    }

}
