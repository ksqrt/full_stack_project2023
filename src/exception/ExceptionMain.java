package exception;

import java.util.Scanner;

public class ExceptionMain {
    public static void main(String[] args) {

        if (args.length >= 2) {
            System.out.println(args[0]);
            System.out.println(args[1]);
        }
        System.out.println();

        try {
            int num1 = Integer.parseInt(args[0]);

            Scanner scan = new Scanner(System.in);
            System.out.println("숫자입력");
            int num2 = scan.nextInt();

            System.out.println(num1 + "/" + num2);
        } catch (NumberFormatException e) {
            System.out.println("반드시 숫자 형식으로 입력하세요");
            e.printStackTrace();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("error");
        } finally {
            System.out.println("finally 에러가 있건 없건 무조건 실행!!");
        }

    }
}