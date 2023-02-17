package member;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MemberFileInput implements Member {

    @Override
    public void execute(List<MemberDTO> list) {
        try {
            File file = new File("members.txt");
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                String name = data[0];
                int age = Integer.parseInt(data[1]);
                String phone = data[2];
                String address = data[3];
                MemberDTO member = new MemberDTO(name, age, phone, address);
                list.add(member);
            }
            reader.close();
            System.out.println("파일 입력이 완료되었습니다.");
        } catch (IOException e) {
            System.out.println("파일 입력 중 오류가 발생하였습니다.");
            e.printStackTrace();
        }
    }
}
