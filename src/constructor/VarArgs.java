package src.constructor;

public class VarArgs {

    public VarArgs() {
        System.out.println("디폴트 생성자");
    }
    public int sum(int...ar) {
        int sum = 0;
        for(int i = 0; i < ar.length;i++){
            sum += i;
        }
        return sum;
    }
    public static void main(String[] args) {
        VarArgs va = new VarArgs();

        System.out.println("합 = "+va.sum(10,20));
        System.out.println("합 = "+va.sum(10,20,30));
        System.out.println("합 = "+va.sum(10,20,30,40));

    }
}
