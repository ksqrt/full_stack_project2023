package src.constructor;
// 생성자는 객체를 초기화 하기위해 사용해줌
// 생성자는 강제호출 안됨 new 할때만 호출됨


public class ConstructorMain {
    private int age;
    private String name;

    // default 생성자 선언
    public ConstructorMain(){
        System.out.println("default 생성자");
        this.name = "이름없음";
        this.age = 1;
    }
    // 생성자 
    public ConstructorMain(String name){
        this();
        System.out.println("생성자");
        this.name = name;
    }
    public ConstructorMain(int age){
        this("코난");
        this.age = age;
        System.out.println("생성자");
    }
    // 오버로드된 다른생성자를 호출 할 수 있다.


    public static void main(String[] args) {
        ConstructorMain aa = new ConstructorMain();
        System.out.println(aa.age);
        System.out.println(aa.name);
        ConstructorMain bb = new ConstructorMain("홍길동");
        System.out.println(bb.age);
        System.out.println(bb.name);
        ConstructorMain cc = new ConstructorMain(12);
        System.out.println(cc.age);
        System.out.println(cc.name);

    }
}
