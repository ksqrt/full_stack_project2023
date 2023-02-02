package src.operator;
import java.util.Scanner;
// [문제] 월급 계산 프로그램 - 조건 연산자
// 이름, 직급, 기본급, 수당을 입력하여 합계, 세금, 월급을 출력하시오
// 단 합계가 5,000,000원 이상이면 3%
//        3,000,000원 이상이면 2%
//        아니면 1%

// 합계 = 기본급 + 수당
// 세금 = 합계 * 세율
// 월급 = 합계 - 세금

// [실행결과]
// 이름 입력 : 홍길동
// 직급 입력 : 부장
// 기본급 입력 : 4900000
// 수당 입력 : 200000

// *** 홍길동 부장 월급 ***
// 기본급 : 4,900,000원
// 수당 : 200,000원
// 합계 : 5,100,000원
// 세금 : 153,000원
// 월급 : 4,947,000원


public class Salary {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("이름입력 : ");
        String name = scan.nextLine();
        System.out.print("직급입력 : ");
        String rank = scan.nextLine();
        System.out.print("기본급 입력 : ");
        int pay1 = scan.nextInt();
        System.out.print("수당 입력 : ");
        int pay2 = scan.nextInt();
        
        System.out.println();
        System.out.println("***"+name+" "+rank+" 월급 ***");
        System.out.println("기본급 : "+Integer.toString(pay1).replaceAll("\\B(?=(\\d{3})+(?!\\d))", ","));
        System.out.println("수당 : "+Integer.toString(pay2).replaceAll("\\B(?=(\\d{3})+(?!\\d))", ","));
        System.out.println("합계 : "+Integer.toString(pay1+pay2).replaceAll("\\B(?=(\\d{3})+(?!\\d))", ","));
        if(pay1+pay2 >=5000000){
            System.out.println("세금 : "+Integer.toString(pay1+pay2-(int)((float)(pay1+pay2)*0.97)).replaceAll("\\B(?=(\\d{3})+(?!\\d))", ","));
            System.out.println("월금 : "+Integer.toString((int)((float)(pay1+pay2)*0.97)).replaceAll("\\B(?=(\\d{3})+(?!\\d))", ","));
        }
        else if(pay1+pay2 >=3000000){
            System.out.println("세금 : "+Integer.toString(pay1+pay2-(int)((float)(pay1+pay2)*0.98)).replaceAll("\\B(?=(\\d{3})+(?!\\d))", ","));
            System.out.println("월급 : "+Integer.toString((int)((float)(pay1+pay2)*0.98)).replaceAll("\\B(?=(\\d{3})+(?!\\d))", ","));
        }
        else{
            System.out.println("세금 : "+Integer.toString(pay1+pay2-(int)((float)(pay1+pay2)*0.99)).replaceAll("\\B(?=(\\d{3})+(?!\\d))", ","));
            System.out.println("월급 : "+Integer.toString((int)((float)(pay1+pay2)*0.99)).replaceAll("\\B(?=(\\d{3})+(?!\\d))", ","));
        }

        scan.close();

    }   
}
