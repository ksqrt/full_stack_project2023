package src.HW;

import java.util.Calendar;
import java.util.Scanner;

public class CalendarProgram {
    // 년도와 월을 저장하는 변수
    private int year;
    private int month;

    // 기본 생성자, 사용자로부터 년도와 월을 입력받는다
    public CalendarProgram() {
        Scanner scan = new Scanner(System.in);
        System.out.print("년도 입력: ");
        this.year = scan.nextInt();
        System.out.print("월 입력: ");
        this.month = scan.nextInt() - 1;
    }

    // 1일의 요일과 해당 월의 마지막 날짜를 계산한다
    public void calc() {
        Calendar cal = Calendar.getInstance();
        cal.set(year, month, 1);
        int startDay = cal.get(Calendar.DAY_OF_WEEK) - 1;
        int lastDay = cal.getActualMaximum(Calendar.DATE);
        System.out.println("일\t월\t화\t수\t목\t금\t토");
        for (int i = 0; i < startDay; i++) {
            System.out.print("\t");
        }
        for (int i = 1; i <= lastDay; i++) {
            System.out.print(i + "\t");
            if ((i + startDay) % 7 == 0) {
                System.out.println();
            }
        }
        System.out.println();
    }

    // 년도와 월, 달력을 출력한다
    public void display() {
        System.out.println();
        System.out.println("년도: " + year);
        System.out.println("월: " + (month + 1));
        System.out.println();
        calc();
    }

    public static void main(String[] args) {
        CalendarProgram program = new CalendarProgram();
        program.display();
    }
}