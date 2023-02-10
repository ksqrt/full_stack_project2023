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
    // 오버라이드는 항상 메소드만 적용이 됨 
    @Override
    public void disp(){
        this.a +=5;
        System.out.println("BB : "+a+" ");
    }
}

public class OverrideMain {
    public static void main(String[] args) {
        AA aa = new AA();
        aa.disp();
        
        BB bb = new BB();
        bb.disp();
        BB cc = (BB)bb;
        cc.disp();

        AA dd = new AA();
        dd.disp();
    }
}
