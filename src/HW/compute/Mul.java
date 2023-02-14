package src.HW.compute;

import java.util.Scanner;

public class Mul implements Compute {
    private int x, y;

    public Mul() {
        Scanner scan = new Scanner(System.in);
        System.out.print("x 의 값 입력 : ");
        x = scan.nextInt();
        System.out.print("y 의 값 입력 : ");
        y = scan.nextInt();
    }

    @Override
    public void disp() {
        System.out.println(x + "*" + y + "=" + (x * y));

    }

}
