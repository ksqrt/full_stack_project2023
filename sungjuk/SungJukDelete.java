package sungjuk;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class SungJukDelete implements SungJuk {

    @Override
    public void execute(ArrayList<SungJukDTO> arrayList) {

        Scanner scan = new Scanner(System.in);

        System.out.print("이름을 입력하세요 : ");
        String name1 = scan.nextLine();
        int check = 0;

//        for (int i = 0; i < arrayList.size(); i++) {
//            // 입력한 이름이 있으면 삭제하고 채크카운트 +1
//            if (arrayList.get(i).getName().equals(name1)) {
//                arrayList.remove(i);
//                check = check + 1;
//            }
//        }
//
        // 1. 배열을 이터레이터로 변환합니다.
        Iterator<SungJukDTO> it = arrayList.iterator();
        while (it.hasNext()) {
            SungJukDTO sungJukDTO = it.next();
            if (sungJukDTO.getName().equals(name1)) {
                it.remove();
                check = check + 1;

            }
        }

        if (check == 0) {
            System.out.println("회원의 정보는 없습니다.");
        } else {
            System.out.println(check + " 건을 삭제 하였습니다.");
        }
    }

}
