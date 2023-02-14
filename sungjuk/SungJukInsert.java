package sungjuk;

import java.util.ArrayList;
import java.util.Scanner;

public class SungJukInsert implements SungJuk {

    Scanner scan = new Scanner(System.in);

    @Override
    public void execute(ArrayList<SungJukDTO> arrayList) {
        System.out.println();
        System.out.print("번호입력 : ");
        int no = scan.nextInt();
        scan.nextLine();

        System.out.print("이름입력 : ");
        String name = scan.nextLine();

        System.out.print("국어입력 : ");
        int kor = scan.nextInt();
        scan.nextLine();

        System.out.print("영어입력 : ");
        int eng = scan.nextInt();
        scan.nextLine();

        System.out.print("수학입력 : ");
        int math = scan.nextInt();
        scan.nextLine();

        SungJukDTO sungjukdto = new SungJukDTO(no, name, kor, eng, math);
        sungjukdto.calc();

        arrayList.add(sungjukdto);
        System.out.println("입력하였습니다.");
    }
}
