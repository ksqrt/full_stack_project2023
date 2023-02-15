package src.collection;

import java.util.ArrayList;
import java.util.Scanner;

public class CollectionMain2 {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("호랑이");
        list.add("사자");
        list.add("호랑이");
        list.add("기린");
        list.add("코끼리");
        // coll.add("43.6");
        // coll.add("25");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println();

        for (String index : list) {
            System.out.println(index);
        }
    }
}
