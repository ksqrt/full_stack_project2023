package src.array;

public class SelectionSort {
    public static void main(String[] args) {
        int[] ar = {25,40,32,78,56};
        // for(int i=0; i<ar.length; i++){
        //     System.out.println(ar[i]+"\t");    
        // }   
        // System.out.println();
        int temp;
        for(int i=0; i <ar.length-1 ;i++){
            for(int j = i+1 ; j < ar.length ; j++){
                System.out.println("i : "+i+" j : "+j);
                if(ar[i]<ar[j]){
                    temp = ar[i];
                    ar[i] = ar[j];
                    ar[j] = temp;}
        
            }
        }
        for(int i=0; i<ar.length; i++){
        System.out.println(ar[i]+"\t");    
        }
   }
}
