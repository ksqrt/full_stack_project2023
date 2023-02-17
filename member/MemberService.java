package member;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class MemberService {

    private List<MemberDTO> memberList = new ArrayList<>();

    public void menu(int menuNum) {
        Scanner scanner = new Scanner(System.in);

        switch (menuNum) {
            case 1:
                System.out.println("회원 정보를 입력하세요.");
                MemberInsert memberInsert = new MemberInsert();
                memberInsert.execute(memberList);
                break;
            case 2:
                System.out.println("회원 정보를 출력합니다.");
                MemberPrint memberPrint = new MemberPrint();
                memberPrint.execute(memberList);
                break;
            case 3:
                System.out.println("회원 정보를 핸드폰 번호로 검색합니다.");
                MemberPhoneSearch memberPhoneSearch = new MemberPhoneSearch();
                memberPhoneSearch.execute(memberList);
                break;
            case 4:
                System.out.println("회원 정보를 이름으로 오름차순 정렬합니다.");
                MemberNameAsc memberNameAsc = new MemberNameAsc();
                memberNameAsc.execute(memberList);
                break;
            case 5:
                System.out.println("회원 정보를 파일에 저장합니다.");
                MemberFileOutput memberFileOutput = new MemberFileOutput();
                memberFileOutput.execute(memberList);
                break;
            case 6:
                System.out.println("회원 정보를 파일에서 불러옵니다.");
                MemberFileInput memberFileInput = new MemberFileInput();
                memberFileInput.execute(memberList);
                break;
            default:
                System.out.println("잘못된 번호입니다.");
                break;
        }
    }
}
