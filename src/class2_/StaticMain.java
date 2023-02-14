package src.class2_;

class StaticTest {
    // 필드 인스턴스 변수
    private int a;
    // 핃드 클래스 변수
    private static int b;

    // static 초기화
    static {
        // this 는 없으니 안씁
        b = 5;
    }

    public StaticTest() {
        System.out.println("default 생성자");
        this.a = 5;
    }

    public void calc() {
        a++;
        b++;
    }

    public void disp() {
        System.out.println(" a : " + a);
        System.out.println(" b : " + b);
    }

    public static void output() {
        // static 메소드 안에서는 static 변수만 사용이 가능합니다.
        System.out.println("static method...");
        System.out.println(" b : " + StaticTest.b);
    }
}

public class StaticMain {
    public static void main(String[] args) {
        // new 는 힙영역 사용
        StaticTest t = new StaticTest();
        t.calc();
        t.disp();
        StaticTest bb = new StaticTest();
        // static 영역에 미리정의된 b 는 변경이 불가능합니다.
        // 따라서 미리 정의돈 b 의 값으 ㄹ따른다
        // 따라서 static b 는 "공유변수"
        bb.calc();
        bb.disp();
        StaticTest cc = new StaticTest();
        cc.calc();
        cc.disp();

        StaticTest.output();
        t.output();

    }
}
