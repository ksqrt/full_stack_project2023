package member;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class MemberFileOutput implements Member {

    @Override
    public void execute(List<MemberDTO> list) {
        try {
            File file = new File("members.txt");
            BufferedWriter writer = new BufferedWriter(new FileWriter(file));
            for (MemberDTO member : list) {
                String data = member.getName() + "," + member.getAge() + "," + member.getPhone() + ","
                        + member.getAddress();
                writer.write(data);
                writer.newLine();
            }
            writer.close();
            System.out.println("파일 출력이 완료되었습니다.");
        } catch (IOException e) {
            System.out.println("파일 출력 중 오류가 발생하였습니다.");
            e.printStackTrace();
        }
    }
}