package src.inheritance;

public class FinalMain {
    public static void main(String[] args) {
        int a = 10;
        a = 20;
        System.out.println("a : " + a);

        final int A = 10;
        // ERROR final 은 반드시 초기값을 가지고 이는 변경이 불가능
        // A = 20;
        System.out.println("A : " + A);
    }
}
