package src.HW;
import java.util.Scanner;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;


public class Score {
    private static String[] Add(String[] originArray, String Val) {
        // 순서 1. 배열을 List로 변환
        List<String> newList = new ArrayList<>(Arrays.asList(originArray));
    
        // 순서 2. List의 Add() 메서드를 호출하여 새로운 값을 할당
        newList.add(Val);
    
        // 순서 3. List를 배열을 변환 후 반환
        return newList.toArray(new String[0]);
      }
    public static void main(String[] args) {
        // [실행결과]
        // 인원수 : 2 (cnt)

        // 이름입력 : 홍길동 (name)
        // 과목수 입력 : 2   (subjectCnt)
        // 과목명 입력 : 국어 (subject)
        // 과목명 입력 : 영어
        // 국어 점수 입력 : 95 (jumsu)
        // 영어 점수 입력 : 100
        // ---------------------

        // 이름     국어     영어   총점     평균
        // 홍길동    95     100   xxx     xx.xx

        Scanner scan = new Scanner(System.in);
        System.out.print("인원수 : ");
        String[] cnt = {};
        cnt = Add(cnt,scan.nextLine());
        System.out.println(Arrays.toString(cnt));
        
        // 인원수대로 반복
        for(int i = 0; i<Integer.parseInt(cnt[0]);i++){
            String[] scorespace = {};
            System.out.print("\n이름입력 : ");
            scorespace = Add(scorespace,scan.nextLine());
            System.out.print("과목 수 입력 : ");
            int subjectCnt = scan.nextInt();
            scan.nextLine();
            for(int j = 0; j<subjectCnt;j++){
                System.out.print("과목 명 입력 : ");
                scorespace = Add(scorespace,scan.nextLine());
            }
            for(int j = 0; j<subjectCnt;j++){
                System.out.print(scorespace[j+1]+" 점수 입력 : ");
                scorespace = Add(scorespace,scan.nextLine());
            }

            // 출력층

            System.out.println("================================");
            System.out.print("이름");
            for(int j = 0; j<subjectCnt;j++){
                System.out.print("   "+scorespace[j+1]);
            }
            System.out.print("  총점   평균");
            System.out.println();
            // 이름
            System.out.print(scorespace[0]);
            // 점수 
            for(int j = 0; j<subjectCnt;j++){
                System.out.printf("%5d",Integer.parseInt(scorespace[j+1+subjectCnt]));
            }
            // 총점
            int sum = 0 ;
            for(int j = 1+subjectCnt; j<1+subjectCnt*2;j++){
                sum =sum + Integer.parseInt(scorespace[j]);
            }
            System.out.printf("%5d",sum);
            // 평균
            System.out.printf("%5d",sum/subjectCnt);
            System.out.println("\n================================\n");

            scan.close();

        }


    }
    
}
