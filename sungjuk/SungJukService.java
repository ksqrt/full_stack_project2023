package sungjuk;

import java.util.Scanner;
import java.util.ArrayList;

public class SungJukService {
    Scanner scan = new Scanner(System.in);
    // 성적 dto 만 들어올수 있는 arraylist 입니다.
    private ArrayList<SungJukDTO> arrayList = new ArrayList<SungJukDTO>();

    public void menu() {
        // 일단 부모를 널값으로 준뒤 하나씩 선언합니다.
        SungJuk sungJuk = null;
        while (true) {
            System.out.println("=====================");
            System.out.println("               1.입력");
            System.out.println("               2.출력");
            System.out.println("               3.수정");
            System.out.println("               4.삭제");
            System.out.println("               5.정렬");
            System.out.println("               6.끝");
            System.out.println("=====================");

            int num = scan.nextInt();

            if (num == 6) {
                break;
            } else if (num == 1) {
                sungJuk = new SungJukInsert();
                sungJuk.execute(arrayList);
            } else if (num == 2) {
                sungJuk = new SungJukList();
                sungJuk.execute(arrayList);
            } else if (num == 3) {
                // sungJuk = new SungJukUpdate();
                // sungJuk.execute();
            } else if (num == 4) {
                // sungJuk = new SungJukDelete();
                // sungJuk.execute();
            } else if (num == 5) {
                // sungJuk = new SungJukSort();
                // sungJuk.execute();
            } else {
                System.out.println("1 ~ 6 번만 입력하세요!");
                continue;
            }
        }

    }

    public SungJukService() {

    }

}
