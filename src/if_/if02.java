package src.if_;

import java.util.Scanner;
import java.util.Arrays;

public class if02 {
    public static void main(String[] args) {
        // [문제] 
        // 3과목(a,b,c)의 점수를 입력받아서 합격인지 불합격인지 출력하시오
        // 합격은 평균이 60점 이상이어야 하고 각 과목이 40점 이상이어야 한다
        // [실행결과]
        // a의 값 : 98
        // b의 값 : 90
        // c의 값 : 85
        // 합격
        
        // a의 값 : 98
        // b의 값 : 90
        // c의 값 : 35
        // 과락으로 불합격
        
        // a의 값 : 68
        // b의 값 : 50
        // c의 값 : 45
        // 불합격
        Scanner scan = new Scanner(System.in);
        System.out.print("a의 값 : ");
        int a = scan.nextInt();
        System.out.print("b의 값 : ");
        int b = scan.nextInt();
        System.out.print("c의 값 : ");
        int c = scan.nextInt();

        
        int[] intArray = {a,b,c};
        double aver = (a+b+c)/3.0;
        int MIN = Arrays.stream(intArray).min().getAsInt();
        
        // System.out.println("평균 :"+aver+"최솟값 : "+MIN);


        if(aver>=60 && MIN>=40){
            System.out.println("합격");
        }
        else if(aver>=60){
            System.out.println("과락으로 불합격");
        }
        else{
            System.out.println("불합격");
        }

        scan.close();
        

    }
}
