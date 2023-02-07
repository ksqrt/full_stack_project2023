package src.multi;
import java.util.Arrays;

public class MultiArray01 {
    public static void main(String[] args) {
        int[][] ar = new int[3][2];
        ar[0][0] = 10;
        ar[0][1] = 20;
        ar[1][0] = 30;
        ar[1][1] = 40;
        ar[2][0] = 50;
        ar[2][1] = 60;
        
        // 2차원 배열의 값을 문자열로 출력하는 메소드
        System.out.println(Arrays.deepToString(ar));
    }

}
