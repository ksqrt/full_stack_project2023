package src.basic;

public class Calc {
    public static void main(String[] args) {
        // 문제 320 와 28 을 변수에 저장하여 합 , 차 , 곱 ,몫을 구하시
        int a = 320;
        int b = 258;

        // 몫
        int c = Math.floorDiv(a, b);
        // 나머지
        
        System.out.printf("%d + %d = %d \n",a,b,a+b);
        System.out.printf("%d - %d = %d \n",a,b,a-b);
        System.out.printf("%d * %d = %d \n",a,b,a*b);
        System.out.printf("%d / %d = %d \n",a,b,c);
        
        // int d = Math.floorMod(a, b);
        // System.out.printf("320 % 258 = %d \n",d);
    }
}
