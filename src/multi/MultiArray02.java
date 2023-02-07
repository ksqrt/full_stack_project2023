package src.multi;
import java.util.Arrays;

public class MultiArray02 {
    public static void main(String[] args) {

        int[][] ar = new int[10][10];
        int count = 1;
        for(int i =0 ;i <ar.length; i++){
            for(int j =0 ; j <ar[i].length; j++){
                ar[i][j] = count;
                count ++;
            }
        }
        // 1. 2차원 배열의 값을 문자열로 출력하는 메소드
        System.out.println(Arrays.deepToString(ar));

    }

}
