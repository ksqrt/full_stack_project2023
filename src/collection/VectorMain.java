package src.collection;

import java.util.Iterator;
import java.util.Vector;

public class VectorMain {
    public static void main(String[] args) {
        Vector<String> v = new Vector<String>();
        System.out.println("벡터 크기 = " + v.size());
        System.out.println("벡터 용량 = " + v.capacity());
        System.out.println();

        System.out.println("항목 추가");
        for (int i = 0; i < 10; i++) {
            v.add((i + 1) + "");
            System.out.print(v.get(i) + " ");
        }
        System.out.println();
        System.out.println("벡터 크기 = " + v.size());
        System.out.println("벡터 용량 = " + v.capacity());
        System.out.println();

        System.out.println("항목 1개 추가");
        v.addElement(5 + "");
        System.out.println();
        System.out.println("벡터 크기 = " + v.size());
        System.out.println("벡터 용량 = " + v.capacity());
        System.out.println();

        for (int i = 0; i < v.size(); i++) {
            System.out.print(v.get(i) + " ");
        }

        System.out.println();
        System.out.println("마지막항목 1개 삭제");
        v.remove(10);

        // v 를 이터레이터로
        Iterator<String> it = v.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();
    }
}
