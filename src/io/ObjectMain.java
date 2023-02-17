package src.io;

import java.io.Serializable;
import java.io.*;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectMain {
    public static void main(String[] args) throws IOException, NotSerializableException {
        PersonDTO dto = new PersonDTO("홍길동", 25, 185.3);

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("result2.txt"));
        oos.writeObject(dto);
        oos.close();

        // result2.txt 파일을 utf-8 형식으로 readObject로 불러와서 한줄씩 출력해줘 주석은 한글어로 자세하게 달아줘
        try (FileInputStream fis = new FileInputStream("result2.txt");
                ObjectInputStream ois = new ObjectInputStream(fis)) {

            // UTF-8 형식으로 객체를 변환합니다.
            // Object object = ois.readObject();
            // 오브젝트가 보이면 항상 해야하는것이 캐스팅 작업입니다.
            // 자식 = (자식)부모 로 캐스팅
            PersonDTO dto2 = (PersonDTO) ois.readObject();
            System.out.println("==================");
            System.out.println("이름 : " + dto2.getName());
            System.out.println("나이 : " + dto2.getAge());
            System.out.println("키 : " + dto2.getHeight());

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

}
