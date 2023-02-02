package src.operator;
import java.util.Random;;

public class Dice {
    public static void main(String[] args) {
        Random random = new Random();
        int dice1,dice2;
        dice1 = random.nextInt(6)+1;
        dice2 = random.nextInt(6)+1;
        System.out.println("[실행결과]");
        System.out.printf("주사위 1 : %d\n주사위 2 : %d\n",dice1,dice2);
        System.out.printf("주사위 값의 합 : %d\n",dice1+dice2);
        if (dice1> dice2){
            System.out.println("주사위 1 승");
        }
        else if(dice1 == dice2){
            System.out.println("무승부");
        }
        else{
            System.out.println("주사위 2 승");
        }
    }   
}

// [실행결과]
// 주사위1 : 3   주사위2 : 1
// 주사위1 승
// -----------------------------
// 주사위1 : 4   주사위2 : 6
// 주사위2 승
// -----------------------------
// 주사위1 : 3   주사위2 :3
// 무승부