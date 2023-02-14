package src.class2_;

import static java.lang.Math.random;
import static java.lang.Math.pow;
import static java.lang.String.format;
import static java.lang.System.out;

public class ImportStatic {
    public static void main(String[] args) {
        System.out.println(Math.random());
        // static import 하면 이렇게 사용할수있음.
        System.out.println(random());
        out.println(pow(2, 5));
        out.println(format("%.2f", 45.5678));
    }
}
