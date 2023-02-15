package sungjuk;

import java.util.ArrayList;
import java.util.Scanner;

public class SungJukSort implements SungJuk {

    @Override
    public void execute(ArrayList<SungJukDTO> arrayList) {
        while (true) {
            Scanner scan = new Scanner(System.in);
            System.out.println("1. 총점으로 내림차순");
            System.out.println("2. 이름으로 오름차순");
            System.out.println("3. 이전 메뉴");
            int num = scan.nextInt();

            if (num == 3) {
                break;
            }
        }

    }

}
