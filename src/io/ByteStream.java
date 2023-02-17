// public class 명은 ByteSteam 이고 main 에 data.txt 라는 파일을 만들고 여기에 "안녕하세요"를 utf-8
// 형식으로 작성하고
// 저장해줘

// 다음에 이 파일을 한줄씩 출력해줘 한국어로 주석,
package src.io;

import java.io.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ByteStream {
    public static void main(String[] args) {
        try {
            FileOutputStream fos = new FileOutputStream("data.txt");

            String str = "ABCD\n안녕하세요";

            byte[] bytes = str.getBytes("utf-8");

            fos.write(bytes);

            fos.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

        File file = new File("data.txt"); // 파일 이름 변경 필요
        try {
            Scanner scanner = new Scanner(file); // 파일 스캐너 생성
            while (scanner.hasNextLine()) { // 다음 라인이 있는 동안 반복하기
                String line = scanner.nextLine(); // 한 줄 읽기
                System.out.println(line); // 한 줄 출력하기
            }

            scanner.close(); // 스캐너 닫기

        } catch (FileNotFoundException e) { // 파일이 없다면..
            e.printStackTrace(); // 에러 메시지 출력하기

        }
    }
}
