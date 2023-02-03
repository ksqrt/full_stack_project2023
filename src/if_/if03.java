package src.if_;
import java.util.Scanner;
import java.util.Arrays;


public class if03 {
    public static void main(String[] args) {
        // [문제] 3개의 숫자(a,b,c)를 입력받아서 순서대로 출력하시오 (if문 사용하시오)
        // [실행결과]
        // a의 값 : 98
        // b의 값 : 90
        // c의 값 : 85
        
        // 85 90 98
        // ---------------------
        // a의 값 : 75
        // b의 값 : 25
        // c의 값 : 36
        // 25 36 75
        Scanner scan = new Scanner(System.in);
        System.out.print("a의 값 : ");
        int a = scan.nextInt();
        System.out.print("b의 값 : ");
        int b = scan.nextInt();
        System.out.print("c의 값 : ");
        int c = scan.nextInt();
        int[] intArray = {a,b,c};
        Arrays.sort(intArray);
        for(int i = 0 ; i <intArray.length; i++){
            System.out.print(intArray[i]+" ");
        }
        System.out.println();
        scan.close();
    }
}
