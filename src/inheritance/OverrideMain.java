package src.inheritance;

class AA{
    public int a =3;
    public void disp(){
        a += 5;
        System.out.println("AA : "+a+" ");
    }
}

class BB extends AA{
    // 필드는 오버라이드 x
    public int a= 8;
    @Override
    public void disp(){
        this.a +=5;
        System.out.println("BB : "+a+" ");
    }
}

public class OverrideMain {
    public static void main(String[] args) {
        
    }
}
