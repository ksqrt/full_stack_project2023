package src.HW;

import java.util.Scanner;

class Compute{
    private int x,y,sum,sub,mul;
    private double div;

    public void setData(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void calc() {
        this.sum = x+y;
        this.sub = x-y;
        this.mul = x*y;
        this.div = (double)(x)/(double)(y);
    }
    public int getX() {
        return this.x;
    }
    public int getY() {
        return this.y;
    }
    public int getSum() {
        return this.sum;
    }
    public int getSub() {
        return this.sub;
    }
    public int getMul() {
        return this.mul;
    }
    public double getDiv() {
        return this.div;
    }
}
public class ComputeMain {
    // [문제] 사칙연산
// x, y를 입력하여 합, 차, 곱, 몫을 구하시오



// 클래스명 : Compute (1인분)
// 필드 : x, y, sum, sub, mul, div
// 메소드 : setData(x의 값, y의 값)
//         calc()
//         getX()
//         getY()
//         getSum()
//         getSub()
//         getMul()
//         getDiv()
        
// 클래스명 : ComputeMain        

// [실행결과]
// 횟수 입력 : 2

// [1번째]
// x 입력 : 25
// y 입력 : 36

// [2번째]
// x 입력 : 35
// y 입력 : 12

// x   y   sum      sub      mul      div
// 25   36
// 35   12
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("횟수입력 : ");
        int n = scan.nextInt();
        // 클래스가 들어갈 빈 배열을 일단 만들고
        Compute[] computes = new Compute[n];
        
        
        for(int i = 0 ; i < n; i++){
            // 안에 클래스를 넣어줍니다.
            computes[i] = new Compute();
            System.out.printf("[%d 번째]\n",i+1);
            System.out.print("x 입력 : ");
            int a = scan.nextInt();
            System.out.print("y 입력 : ");
            int b = scan.nextInt();
            computes[i].setData(a,b);
            computes[i].calc();
        }
        
        System.out.println("x   y   sum   sub   mul   div");
        for(int i = 0 ; i < n; i++){
            System.out.printf("%5d%5d%5d%5d%5d%.2f\n",computes[i].getX(),
            computes[i].getY(),
            computes[i].getSum(),
            computes[i].getSub(),
            computes[i].getMul(),
            computes[i].getDiv()
            );
        }
    }
}

