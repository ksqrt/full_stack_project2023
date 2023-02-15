package src.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionMain {

    // @SuppressWarnings("all")
    public static void main(String[] args) {
        // 인터패이스를 대신 override!!!
        // collection == 객체를 담아주는 저장창고임
        // 객체 타입에 상관없이 저장 가능하고 크기까지 조절가능
        Collection<Object> coll = new ArrayList<Object>();

        coll.add("호랑이");
        coll.add("사자");
        coll.add("호랑이");
        coll.add("기린");
        coll.add("코끼리");
        coll.add("43.6");
        coll.add("25");

        Iterator it = coll.iterator();

        // 항목이 있냐 ? (true) : (false)
        System.out.println(it.hasNext());
        // 항목을 pop
        System.out.println(it.next());
        // 이러면 collcetion 을 전부 출력
        while (it.hasNext()) {
            System.out.println(it.next());
        }

    }
}
