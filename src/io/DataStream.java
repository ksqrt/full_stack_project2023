package io;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class DataStream {

    public static void main(String[] args) {
        try {
            // DataOutputStream dos = new DataOutputStream(new
            // FileOutputStream("result.txt"));

            FileOutputStream fos = new FileOutputStream("result.txt");
            DataOutputStream dos = new DataOutputStream(fos);

            dos.writeUTF("홍길동");
            dos.writeInt(25);
            dos.writeDouble(25.3);
            dos.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        // 파일 읽기
        // ./result.txt 파일을 읽어서 한줄씩 출력해줘 근데 한국어로 주석 자세하게 달아줘

        try {
            // 파일 객체 생성
            FileInputStream fis = new FileInputStream("result.txt");

            // 입력 스트림 생성 - 바이트 단위로 읽기 때문에 변환해줘야함
            InputStreamReader isr = new InputStreamReader(fis, "utf-8");

            // 입력 버퍼 생성
            BufferedReader br = new BufferedReader(isr);

            // 한 줄 씩 읽기
            String line = "";

            while ((line = br.readLine()) != null) { // null이 아닐 때까지 반복하겠다
                System.out.println(line); // 한 줄 출력
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
