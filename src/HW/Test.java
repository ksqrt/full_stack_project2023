package src.HW;

class AA{
    protected int a = 3;
    protected void sub(int a){

    }
}

class BB extends AA{
    protected int a = 5; 
    @Override
    // 부모는 protected 지만 자식은 public 따라서 자식의 범위가 더큼 
    // 이는 오버라이드시 상관없음
    public void sub(int a){

    }
}

public class Test {
    public static void main(String[] args) {
        String aa = "apple";
        String bb = aa;
        System.out.println(bb);

    }
}
