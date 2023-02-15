package src.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetMain {
    public static void main(String[] args) {

        // set은 중복허용 x
        Set<String> set = new HashSet<String>();

        set.add("호랑이");
        set.add("사자");
        set.add("호랑이");
        set.add("기린");
        set.add("코끼리");

        Iterator it = set.iterator();

    }

}
