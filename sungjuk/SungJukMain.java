package sungjuk;

public class SungJukMain {
    public static void main(String[] args) {

        SungJukService sungJukService = new SungJukService();
        sungJukService.menu();
        System.out.println("프로그램을 종료합니다");
    }
}
