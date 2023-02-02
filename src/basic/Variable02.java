package src.basic;

public class Variable02 {
    // 전역변수 
    int a ;
    float b;
    // 스태탁의 단검
    // 스태틱은 미리 메모리를 잡고 들어와서 그냥 가져다 써도 문제 없다애요
    static int c;
    public static void main(String[] args) {
        // 지역변수
        int a = 5;
        System.out.println("지역변수 a" + a);
        
        Variable02 v = new Variable02();
        System.out.println("객체 : " + v);
        System.out.println("필드 a :" + v.a);
        System.out.println("필드 b :" + v.b);
        System.out.println("필드 b :" + c);

    }
}
