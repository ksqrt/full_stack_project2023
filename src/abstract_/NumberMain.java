package src.abstract_;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

/**
 * NumberMain
 */
public class NumberMain {
    public static void main(String[] args) {
        // 추상클래스라 생성이 안됨
        // NumberFormat nf = new NumberFormat(); -- ERROR!!!!
        // 1. 따라서 sub class 를 이용하여 생성
        NumberFormat nf = new DecimalFormat("#,###.##원");

        // 2. 클래스를 메소드를 이용하여 생성
        NumberFormat nf4 = NumberFormat.getInstance();
        // 소수 이하 2자리 까지 출력
        nf4.setMaximumFractionDigits(2);

        System.out.println(nf.format(123456));
        System.out.println(nf.format(123456.45678));
        System.out.println();
        System.out.println(nf4.format(123456));
        System.out.println(nf4.format(123456.45678));
        System.out.println();

        NumberFormat nf5 = NumberFormat.getCurrencyInstance(Locale.US);
        System.out.println(nf5.format(123456));
        System.out.println(nf5.format(123456.45678));
        System.out.println();

        NumberFormat nf6 = NumberFormat.getCurrencyInstance(Locale.KOREA);
        System.out.println(nf6.format(123456));
        System.out.println(nf6.format(123456.45678));
        System.out.println();

    }
}