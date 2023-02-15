package sungjuk;

import java.util.ArrayList;

public class SungJukList implements SungJuk {

    @Override
    public void execute(ArrayList<SungJukDTO> arrayList) {
        // TODO Auto-generated method stub

        System.out.print("번호" + "\t");
        System.out.print("이름" + "\t");
        System.out.print("국어" + "\t");
        System.out.print("영어" + "\t");
        System.out.print("수학" + "\t");
        System.out.print("총점" + "\t");
        System.out.print("평균" + "\t");
        System.out.println();

        // 1번방법
        // for (int i = 0; i < arrayList.size(); i++) {
        // System.out.print(arrayList.get(i).getNumber() + "\t");
        // System.out.print(arrayList.get(i).getName() + "\t");
        // System.out.print(arrayList.get(i).getKor() + "\t");
        // System.out.print(arrayList.get(i).getEng() + "\t");
        // System.out.print(arrayList.get(i).getMath() + "\t");
        // System.out.print(arrayList.get(i).getTot() + "\t");
        // System.out.print(arrayList.get(i).getAvg() + "\t");
        // System.out.println();
        // }
        // // 2번방법
        // for (SungJukDTO sungJukDTO : arrayList) {
        // System.out.print(sungJukDTO.getNumber() + "\t");
        // System.out.print(sungJukDTO.getName() + "\t");
        // System.out.print(sungJukDTO.getKor() + "\t");
        // System.out.print(sungJukDTO.getEng() + "\t");
        // System.out.print(sungJukDTO.getMath() + "\t");
        // System.out.print(sungJukDTO.getTot() + "\t");
        // System.out.print(sungJukDTO.getAvg() + "\t");
        // System.out.println();
        // }
        // 3번방법 toString 을 만들어서 하기
        for (SungJukDTO sungJukDTO : arrayList) {
            System.out.println(sungJukDTO.toString());
        }
    }

    //

}
