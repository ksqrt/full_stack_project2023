package src.basic;

import java.util.Random;;

public class MethodTest02 {
    public static void main(String[] args) {
 
        // 난수 = 랜덤
        
        Random r = new Random();
        double b = r.nextDouble();

        System.out.println("난수 = " +b);
    }   
}
