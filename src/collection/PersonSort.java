package src.collection;

import java.util.Collections;
import java.util.Arrays;

public class PersonSort {

    public static void main(String[] args) {
        String[] ar = { "orange", "apple", "banana", "pear", "peach", "applemango" };

        String[] ar1 = { "orange", "apple", "banana", "pear", "peach", "applemango" };

        Arrays.sort(ar1);
        Arrays.sort(ar, Collections.reverseOrder());

        // Arrays.sort(ar, Collections.reverseOrder());

        System.out.println(Arrays.toString(ar1));
        System.out.println(Arrays.toString(ar));
    }

}