
package src.array;

// import java.util.Scanner;
// import java.util.Arrays;

public class Array05 {
    public static void main(String[] args) {
        char[] ar = new char[50];
        // int[] count = new int[26];
        // System.out.println("hello");

        for(int i =0; i<ar.length; i++){
            ar[i] = (char)(Math.random()*26 +65);
        }
        for(int i =0; i<ar.length; i ++){
            System.out.print(ar[i]+" ");
        }

    }
}
