package src.operator;

public class Operater03 {
    public static void main(String[] args) {
        int a = 5;
        a *=2;
        a +=2;
        a /=3;
        a ++;
        int b = a++;
        int c = ++a * b--;
        System.out.println("a = "+a);
        System.out.println("b = "+b);
        
        System.out.println("a = "+a+" ,b = "+b+" ,c = "+c);
    }
}
