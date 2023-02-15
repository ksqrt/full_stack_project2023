package sungjuk;

import java.util.ArrayList;
import java.util.Scanner;

public class SungJukUpdate implements SungJuk {

    @Override
    public void execute(ArrayList<SungJukDTO> arrayList) {
        // TODO Auto-generated method stub
        Scanner scan = new Scanner(System.in);
        System.out.print("번호입력 : ");
        int no = scan.nextInt();
        scan.nextLine();
        int i;
        int sw = 0;
        for (i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i).getNumber() == no) {
                sw = 1;
                if (sw == 1) {
                    System.out.println(arrayList.get(i));

                    System.out.println();

                    System.out.print("수정할 이름입력 : ");
                    String name = scan.nextLine();

                    System.out.print("수정할 국어입력 : ");
                    int kor = scan.nextInt();
                    scan.nextLine();

                    System.out.print("수정할 영어입력 : ");
                    int eng = scan.nextInt();
                    scan.nextLine();

                    System.out.print("수정할 수학입력 : ");
                    int math = scan.nextInt();
                    scan.nextLine();

                    arrayList.get(i).setName(name);
                    arrayList.get(i).setKor(kor);
                    arrayList.get(i).setEng(eng);
                    arrayList.get(i).setMath(math);
                    arrayList.get(i).calc();

                    System.out.println("업데이트 완료");

                } else {
                    System.out.println("없는번호입니다");
                }

                break;
            }

        }

    }

}
