package src.io;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ByteStram2 {
    public static void main(String[] args) {
        try {
            File file = new File("data.txt");
            BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file));
            int size = (int) file.length();
            byte[] b = new byte[size];

            bis.read(b, 0, size);

            System.out.println(new String(b));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
