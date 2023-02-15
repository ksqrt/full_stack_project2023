package sungjuk;

import java.util.ArrayList;
import java.util.Scanner;

public class SungJukDelete implements SungJuk {

    @Override
    public void execute(ArrayList<SungJukDTO> arrayList) {

        Scanner scan = new Scanner(System.in);

        System.out.print("이름을 입력하세요 : ");
        String name1 = scan.nextLine();
        int check = 0;

        for (SungJukDTO sungJukDTO : arrayList) {
            // 입력한 이름이 있으면 삭제하고 채크카운트 +1
            if (sungJukDTO.getName() == name1) {
                arrayList.remove(sungJukDTO);
                check = check + 1;
            }
        }
        if (check == 0) {
            System.out.println("회원의 정보는 없습니다.");
        } else {
            System.out.println("삭제 하였습니다.");
        }
    }

}
