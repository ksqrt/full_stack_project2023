package src.operator;

public class Operater05 {
    public static void main(String[] args) {
        boolean a = 25>36;
        System.out.println("a = "+a);
        System.out.println("!a = "+!a);
        String b = "apple";
        String c = new String("apple");

        // 주소비교
        String result = b == c? "같다": "다르다";
        System.out.println("b == c : "+result);

        // equals 는 문자열을 비교합니다. 
        String result2 = b.equals(c) ? "같다":"다르다";
        String result3 = !b.equals(c) ? "같다":"다르다";
        System.out.println("b.equals(c) : "+result2);
        System.out.println("!b.equals(c) : "+result3);
    }
}
