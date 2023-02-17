package member;

import java.util.List;
import java.util.Scanner;

public class MemberInsert implements Member {

    @Override
    public void execute(List<MemberDTO> list) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("이름을 입력하세요.");
        String name = scanner.next();
        System.out.println("나이를 입력하세요.");
        int age = scanner.nextInt();
        System.out.println("핸드폰 번호를 입력하세요.");
        String phone = scanner.next();
        System.out.println("주소를 입력하세요.");
        String address = scanner.next();

        MemberDTO memberDTO = new MemberDTO(name, age, phone, address);
        list.add(memberDTO);

        System.out.println("회원 등록이 완료되었습니다.");
    }
}