package src.inheritance;

import java.lang.String;

// enum 은 상수 집합체임 
enum Color {
    RED, GREEN, BLUE
}

class Final {
    public final String FRUIT = "사과";
    public final String FRUIT2;

    // static 은 new 없으면 초기화가 되지않음
    // 따라서 static 초기화 영약을 만들어야합나다.
    public static final String ANIMAL = "기린";
    public static final String ANIMAL2;
    public static final int RED = 0;
    public static final int GREEN = 1;
    public static final int BLUE = 2;

    static {
        System.out.println("스태틱 초기화 영역");
        ANIMAL2 = "코끼리";
    }

    public Final() {
        System.out.println("디폴트 생성자");
        FRUIT2 = "딸기";
    }
}

public class FinalMain {
    public static void main(String[] args) {
        int a = 10;
        a = 20;
        System.out.println("a : " + a);

        final int A = 10;
        // ERROR final 은 반드시 초기값을 가지고 이는 변경이 불가능
        // A = 20;
        System.out.println("A : " + A);

        Final f = new Final();
        System.out.println("FRUIT : " + f.FRUIT);
        System.out.println("FRUIT : " + f.FRUIT);
        System.out.println("FRUIT : " + f.FRUIT2);
        System.out.println("FRUIT : " + Final.ANIMAL);
        System.out.println("FRUIT : " + Final.ANIMAL2);

        System.out.println("빨강 : " + Color.RED);

        // for (Color data : Color.values()) {
        // System.out.println(data + "\t" =data.ordinal());
        // }

    }
}
