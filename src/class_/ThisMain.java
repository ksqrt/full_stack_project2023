package src.class_;

class This {
    // 필드
    private int b;
    private static int c;
    // 메소드
    public void setB(int b){
        // this 는 자기자신클래스의 정보(참조)를 가지고있음
        // 반스시 생정자(set) 첫줄에 사용
        System.out.println("this = "+this);
        this.b  = b;
    }
    public void setC(int c){
        this.c  = c;
    }
    public int getB(){
        return this.b; 
    }
    public int getC(){
        return this.c; 
    }
}

public class ThisMain {
    //필드
    private int a; 
    
    
    public static void main(String[] args) {
        // 
        ThisMain tm = new ThisMain();    
        tm.a =10;
        System.out.println("a : "+tm.a);
        
        This ts = new This();
        // ts.b = 20 <-- 이건 접근이 안됨 private 걸려있음 !
        ts.setB(20); 
        // 호출한 메소드는 반드시 돌아온다!
        System.out.println("b : "+ts.getB());
        ts.setC(30); 
        // 호출한 메소드는 반드시 돌아온다!
        System.out.println("c : "+ts.getC());
        
        
        // 새로운클래스만들기
        This w = new This();
        w.setB(40);
        w.setC(40);
        System.out.println("b : "+w.getB());
        System.out.println("c : "+w.getC());
        
    }
}
