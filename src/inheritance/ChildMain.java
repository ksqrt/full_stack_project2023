package src.inheritance;

public class ChildMain extends Super{
    private String name;
    private int age;

    ChildMain(){
     System.out.println("childmain 기본생성자");
    }
    ChildMain(String name,int age,double weight,double height){
        // super() 는 부모클래스의 생성자를 호출 할 수있다. 반드시 첫줄에 써야함.
        super(weight,height);
        // super.  == 부모클래스의참조값
        // super.weight =weight;
        // this.height =height;
        this.name =name;
        this.age = age;
    }

    public void output() {
        System.out.println("이름 :"+name);
        System.out.println("나이:"+age);
        this.disp();
    }
    // override 오버라이드 : 부모
    public static void main(String[] args) {
        Super aa = new SubMain("홍길동",25,73.5,182.6);
        aa.disp();
    }
}
