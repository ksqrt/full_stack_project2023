package src.basic;

public class Variable01 {
  
    public static void main(String[] args) {
        // Wrapper Class(포장시퀀)
        // 기본형은 int -> 객체형(클래스화) Integer
        // 기본형 double -> 객체형(클래스화) Double
        System.out.println("int range : "+Integer.MAX_VALUE + "," + Integer.MIN_VALUE);
        System.out.println("long range : "+Long.MAX_VALUE + "," + Long.MIN_VALUE);
        
        // 불린형
        boolean a ;    
        a = 25 > 35;
        System.out.println(a);
        System.out.println("a = "+ a);
        char b;
        b = 'A'; // 65 , (0100 0001)
        System.out.println("b = "+ b);
        
        char c;
        c = 65;
        System.out.println("c = "+ c);

        
        // 바이트형은 -128~ 127 까지의 범위를 가짐
        byte d = 0;
        // d = 128; <-- 범위 초과에러발생 stack over flow!!
        System.out.println("d = "+ d);
        
        int e ;
        e = 65;
        System.out.println("e = "+ e);
        
        int f ;
        f = 'A';
        System.out.println("e = "+ f);
    }

}