package member;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MemberNameAsc implements Member {

    @Override
    public void execute(List<MemberDTO> list) {
        Comparator<MemberDTO> asc = new Comparator<MemberDTO>() {
            @Override
            public int compare(MemberDTO o1, MemberDTO o2) {
                return o1.getName().compareTo(o2.getName());
            }
        };
        Collections.sort(list, asc);
        for (MemberDTO member : list) {
            System.out.println(member.getName().toString());
        }
    }
}