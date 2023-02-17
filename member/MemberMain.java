package member;

import java.util.Scanner;

public class MemberMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MemberService memberService = new MemberService();

        while (true) {
            System.out.println("********************");
            System.out.println("  1. 등록");
            System.out.println("  2. 출력");
            System.out.println("  3. 핸드폰 검색");
            System.out.println("  4. 이름으로 오름차순");
            System.out.println("  5. 파일 저장");
            System.out.println("  6. 파일 읽기");
            System.out.println("  7. 종료");
            System.out.println("********************");
            System.out.print("번호 : ");

            int menuNum = scanner.nextInt();
            scanner.nextLine();

            if (menuNum == 7) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            memberService.menu(menuNum);
        }

        scanner.close();
    }

}
