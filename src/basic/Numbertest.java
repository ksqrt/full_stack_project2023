package src.basic;

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
        // int 형 변환                
        System.out.println(Integer.parseInt("2")+Integer.parseInt("3")); //5
        System.out.println("25/6 = " + (25.0/6));
        // float 형 변환
        System.out.println("25/6 = " + 
        (Float.parseFloat("25.0")/Integer.parseInt("6")));
        // float 형 변환 후 stringformat 으로 출력
        System.out.println("25/6 = " + String.format("%.2f",Float.parseFloat("25.0")/Integer.parseInt("6")));
        // ctrl + space 바는 설명이 뜬다
    }
}
