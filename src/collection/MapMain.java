package src.collection;

import java.util.HashMap;
import java.util.Map;

public class MapMain {

    public static void main(String[] args) {
        Map<String, String> map = new HashMap<String, String>();

        // map 은 중복가능
        map.put("book1", "백설공주");
        map.put("book2", "인어공주");

        // value 중복허용
        map.put("book3", "백설공주");
        // key 중복허용
        map.put("book1", "엄지공주");

        System.out.println(map.get("book1"));
        System.out.println(map.get("book2"));
        // null
        System.out.println(map.get("book501"));
    }
}
