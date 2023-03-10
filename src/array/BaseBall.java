package src.array;
import java.util.Arrays;
import java.util.Scanner;

public class BaseBall {
        // [문제] 야구게임
        // 크기가 3개인 정수형 배열을 잡고 1~9사이의 난수를 발생한다
        // 발생한 수를 맞추는 게임
        // 중복은 제거한다

        // [실행결과]
        // 게임을 실행하시겠습니까(Y/N) : w
        // 게임을 실행하시겠습니까(Y/N) : u
        // 게임을 실행하시겠습니까(Y/N) : y

        // 게임을 시작합니다

        // 숫자입력 : 123
        // 0스트라이크 0볼

        // 숫자입력 : 567
        // 0스트라이크 2볼

        // 숫자입력 : 758
        // 1스트라이크 2볼
        // ...

        // 숫자입력 : 785
        // 3스트라이크 0볼

        // 프로그램을 종료합니다.
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String answer ;
        boolean tmp = true;

        while (tmp) {
            System.out.print("게임을 실행하시겠습니까?(Y/N): ");
            answer = scan.nextLine();
            if(answer.charAt(0) == 'y' || answer.equals("Y")){
                // while 빠저 나오기 
                tmp = false;
                // 난수생성 후 배열에 담기
                
                // 중복없는 난수생성 후 배열에 담기
                // Integer[] rand = new Integer[3];
                // for(int i =0; i<3; i++){
                //     rand[i] = (int)((Math.random()*10))+1;
                // }
                    
                // Set<Integer> set = new HashSet<Integer>(Arrays.asList(rand));
                // Integer[] arr = set.toArray(new Integer[0]);
                
                // while (arr.length != 3){
                //     for(int i =0; i<3; i++){
                //         rand[i] = (int)((Math.random()*10))+1;
                //     }
                //     set = new HashSet<Integer>(Arrays.asList(rand));
                //     arr = set.toArray(new Integer[0]);
                // }



                int rand = (int)(Math.random()*900)+100;
                String to = Integer.toString(rand);
                char[] arr = to.toCharArray();

                System.out.println("\n게임을 시작합니다");
                System.out.println("\n난수"+rand);
                while(true){
                    System.out.print("\n숫자입력 : ");
                    // 숫자를 입력받은뒤 배열에 담음
                    String num1 = scan.nextLine();
                    // String to1 = Integer.toString(num);
                    char[] arr1 = num1.toCharArray();

                    int count = 0;
                    int ballcount = 0;
                    // 난수배열과 인풋 배열 인덱스를 반복문으로 비교하여 서로 같으면 count +1
                    for (int i=0 ; i<arr.length;i++){
                        if(arr[i]==arr1[i]){
                            count += 1;
                        }
                        else if ((Arrays.toString(arr)).contains(String.valueOf(arr1[i]))){
                            ballcount +=1;

                        }
                    }

                    if (count == 3){
                        System.out.printf("%d 스트라이크 %d볼\n",count,ballcount);
                        System.out.println();
                        scan.close();
                        // 강제종료코드
                        System.exit(0);
                    }
                    else {
                        System.out.printf("%d 스트라이크 %d볼\n",count,ballcount);
                        System.out.println();
                    }
                    

                }
                
                
        
            
            }
        }

        scan.close();
    }
}
