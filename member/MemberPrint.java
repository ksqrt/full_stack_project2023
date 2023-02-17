package member;

import java.util.List;

public class MemberPrint implements Member {

    @Override
    public void execute(List<MemberDTO> list) {
        System.out.println("등록된 회원 목록입니다.");
        System.out.println("이름\t나이\t핸드폰\t\t주소");
        System.out.println("---------------------------------------");
        for (MemberDTO memberDTO : list) {
            System.out.println(memberDTO.getName() + "\t" + memberDTO.getAge() + "\t" + memberDTO.getPhone() + "\t"
                    + memberDTO.getAddress());
        }
    }
}