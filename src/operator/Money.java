package src.operator;

public class Money {
    public static void main(String[] args) {
        // [문제] 현금 5378원 이 있습니다
        // 현금 : 5378원
        // 천원 : 5장
        // 백원 : 3개
        // 십원 : 7개
        // 일원 : 8개

        int money = 5378;
        String str1 = String.valueOf(money);
        char[] arr = str1.toCharArray();
        
        System.out.println("현금 "+ money +"개");
        System.out.println("천원 "+ arr[0]+"개");
        System.out.println("백원 "+ arr[1]+"개");
        System.out.println("십원 "+ arr[2]+"개");
        System.out.println("일원 "+ arr[3]+"개");

    }
}

