package test;

import java.util.Scanner;

public class SqrtService {
    private int x, y;
    Scanner scan = new Scanner(System.in);

    public void menu() {
        System.out.print("x 입력 : ");
        this.x = scan.nextInt();
        System.out.print("y 입력 : ");
        this.y = scan.nextInt();

    }

    public void calcprint() {
        System.out.println(Math.pow(this.x, this.y));
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        if (y >= 0) {
            return x + "의 " + y + "승은 " + Math.pow(this.x, this.y) + "입니다.";
        } else {
            return "y는 0보다 크거나 같아야합니다.";
        }
    }

}
