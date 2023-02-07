package src.array;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Set;
import java.util.HashSet;

// [문제] 로또 - 자동
// - 크기가 6개인 배열 생성
// - 1 ~ 45 사이의 난수 발생
// - 숫자는 오름차순하여 출력 (Selection Sort)
// - 출력시 자리수는 5자리로 지정
// - 중복 숫자가 나오면 안된다
// - 1000원당 1줄이 나온다 
// - 5줄마다 줄바꿈

// [실행결과]
// 현금 입력 : 7000
//     2    4   19   39   43   44
//    22   26   33   38   39   42
//     5    6    8   25   35   45
//     3   14   23   30   34   35
//    18   20   25   27   32   37
   
//     1   16   32   34   41   42
//     5    6   18   30   33   44


public class Lotto {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("현금 입력 : ");
        int money = scan.nextInt();

        for(int i =0; i<(money/1000)+1; i++){
            Integer[] lotto = new Integer[6];
            for(int j =0; j<lotto.length; j++){
                lotto[j] = (int)((Math.random()*45));
            }

            Set<Integer> set = new HashSet<Integer>(Arrays.asList(lotto));
            Integer[] arr = set.toArray(new Integer[0]);
            if(arr.length == 6){
                for(int j =0; j<lotto.length; j++){
                    System.out.printf("%5d",lotto[j]);
                }
                System.out.println("");
                if(i!= 0  && i%5 == 0){
                    System.out.println();
                }
            }
            else{
                i--;
            }

        }
        

    }   
}
