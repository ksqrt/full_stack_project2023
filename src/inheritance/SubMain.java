package src.inheritance;

public class SubMain extends Super {
    private String name;
    private int age;

    SubMain(){
        System.out.println("submain 기본생성자");
    }
    SubMain(String name,int age,double weight,double height){
        this.name =name;
        this.age = age;
        // super.  == 부모클래스의참조값
        super.weight =weight;
        this.height =height;
    }
    public void output() {
        System.out.println("이름 :"+name);
        System.out.println("나이:"+age);
        this.disp();
    }
    public static void main(String[] args) {
        SubMain aa = new SubMain("홍길동",25,73.5,182.6);

        aa.output();
        System.out.println("=========================");
        aa.disp();
        System.out.println("=========================");
        Super bb = new SubMain("홍길동",25,73.5,182.6);
        bb.disp();
    }
}

// 자식클래스 메모리 생성시 
// -부모클래스 생성
// -자식클래스 생성