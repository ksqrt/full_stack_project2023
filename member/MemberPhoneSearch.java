package member;

import java.util.List;
import java.util.Scanner;

public class MemberPhoneSearch implements Member {

    private Scanner scanner;

    public MemberPhoneSearch() {
        scanner = new Scanner(System.in);
    }

    @Override
    public void execute(List<MemberDTO> list) {
        System.out.print("검색할 회원의 핸드폰 번호를 입력하세요 : ");
        String searchPhone = scanner.nextLine();

        boolean isFound = false;

        for (MemberDTO member : list) {
            if (member.getPhone().equals(searchPhone)) {
                System.out.println(member.getName().toString());
                isFound = true;
            }
        }

        if (!isFound) {
            System.out.println("검색 결과가 없습니다.");
        }
    }
}