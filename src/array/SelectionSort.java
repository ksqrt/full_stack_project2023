package src.array;

public class SelectionSort {
    public static void main(String[] args) {
        // for(int i=0; i<ar.length; i++){
        //     System.out.println(ar[i]+"\t");    
        // }   
        // System.out.println();
        int[] lotto = new int[6];
        for(int i =0; i<lotto.length; i++){
            lotto[i] = (int)(Math.random()*45 +1);
        }


        int temp;
        for(int i=0; i <lotto.length-1 ;i++){
            for(int j = i+1 ; j < lotto.length ; j++){
                // System.out.println("i : "+i+" j : "+j +" lotto :"+lotto[java.awt]);
                if(lotto[i]>lotto[j]){
                    temp = lotto[i];
                    lotto[i] = lotto[j];
                    lotto[j] = temp;}
        
            }
        }
        for(int i=0; i<lotto.length; i++){
        System.out.println(lotto[i]+"\t");    
        }
   }
}
