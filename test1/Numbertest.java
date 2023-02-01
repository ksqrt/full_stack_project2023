package test1;

public class Numbertest {
    public static void main(String[] args){
        System.out.println("hello");
        System.out.println(2+3); // 5
        System.out.println('2'+'3'); // 101
        System.out.println("2"+"3"); //23
        // Cast연산 강제 형 변환
        System.out.println((char)('A'+32)); //a
        // 숫자로 변경항려면 -48 을 해주자
        System.out.println(Integer.toString('2'-48+'3'-48)); //5
        // 문자를 숫자로 변경 하려면 parseInt 써주기        
        System.out.println(Integer.parseInt("2")+Integer.parseInt("3")); //5

    }
}
