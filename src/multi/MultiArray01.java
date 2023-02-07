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
        
        // 1. 2차원 배열의 값을 문자열로 출력하는 메소드
        System.out.println(Arrays.deepToString(ar));

        // 2. 반복문으로 문자열을 출력하기 
        for(int i =0 ;i <ar.length; i++){
            for(int j =0 ; j <ar[i].length; j++){
                System.out.printf("ar[%d][%d] : "+ar[i][j]+"\n",i,j);
            }
            System.out.println();
        }

    }

}
