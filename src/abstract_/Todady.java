package src.abstract_;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Calendar;
import java.util.zip.ZipException;

public class Todady {
    public static void main(String[] args) throws ParseException {
        // 시스템의 시간과 날짜를 가지고옴
        Date date = new Date();
        System.out.println(date);
        SimpleDateFormat sdf = new SimpleDateFormat("y년 M월 d 일 h:m:s");
        System.out.println(sdf.format(date));

        // String to Date 형변환 필요
        SimpleDateFormat input = new SimpleDateFormat("yyyyMMDDHHmm");
        // String -> date 형 변환
        Date birth = input.parse("19910716091415");

        System.out.println("내 생일 : " + birth);
        System.out.println("내 생일 : " + sdf.format(birth));

        System.out.println();
        // 기준은 시스템 날짜와 시간
        Calendar cal = Calendar.getInstance();

        int year = cal.get(Calendar.YEAR);
        int month = cal.get(cal.MONTH) + 1;
        int day = cal.get(cal.DATE);
        int week = cal.get(cal.DAY_OF_WEEK);

        String dayOfWeek = "";
        switch (week) {
            case 1:
                dayOfWeek = "일";
                break;
            case 2:
                dayOfWeek = "월";
                break;
            case 3:
                dayOfWeek = "화";
                break;
            case 4:
                dayOfWeek = "수";
                break;
            case 5:
                dayOfWeek = "목";
                break;
            case 6:
                dayOfWeek = "금";
                break;
            case 7:
                dayOfWeek = "토";
                break;
        }

        int hour = cal.get(Calendar.HOUR_OF_DAY);
        int minute = cal.get(Calendar.MINUTE);
        int second = cal.get(Calendar.SECOND);
        System.out.println(year + "년 " + month + "월 " + day + "일 " + dayOfWeek + "요일 "
                + hour + "시 " + minute + "분 " + second + "초");

    }
}
