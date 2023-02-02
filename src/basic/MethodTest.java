package src.basic;

public class MethodTest {
    public static void main(String[] args) {
        
        int big = Math.max(25,36);

        System.out.println(Math.max(25,16));
        // double small = Math.min(25.8,78.6);
        // System.out.println("최솟값="+small);
        System.out.println(Math.min(25.8,78.6));

        // 250 을 2진수로 출력하세요
        int num = 250;
        String binaryString = Integer.toBinaryString(num);
        String octal = Integer.toOctalString(num); // 10진수 -> 8진수
        String hexaDecimal = Integer.toHexString(num);
        System.out.println("2진수 : "+binaryString+"\n8진수 : "+octal+"\n16진수 : "+hexaDecimal);
    
    }
}
