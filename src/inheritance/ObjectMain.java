package src.inheritance;

class Test extends Object{

}
class Sample{
    @Override
    public String toString(){
        return "개바부";
    }
}

class Exam{
    private String name = "홍길동";
    private int age = 24;
    @Override
    public String toString() {
        return name +"\t" + age;
    }
}

public class ObjectMain{
    public static void main(String[] args) {
        Test t = new Test();
        System.out.println("객체 t = "+ t); 
        System.out.println("객체 t = "+ t.toString());
        System.out.println("객체 t = "+ t.hashCode()); 
        // 객체 t = src.inheritance.Test@251a69d7

        Sample s = new Sample();
        // 이러면 Object.toString() 이아니라
        // 자식클래스에 먼저 오버라이딩된 Sample.toString()을 먼저사용
        System.out.println("객체 s = "+s.toString());
        Exam e = new Exam();
        System.out.println("객체 e = "+e.toString());

        String bb = "apple";
        String cc = new String("apple"); 
        // 주소비교 = false
        System.out.println("bb == cc  : "+(bb==cc));
        // equals 는 문자열 비교 = True
        System.out.println("bb.equals(cc) : "+bb.equals(cc));

        Object bb1 = new Object();
        Object cc1 = new Object(); 
        // 주소비교 = false
        System.out.println("bb1 == cc1  : "+(bb1==cc1));
        // object 의 equals 는 주솟값 비교임
        System.out.println("bb1.equals(cc1) : "+bb1.equals(cc1));
        
        Object ff = new String("apple");
        Object gg = new String("apple"); 
        // 주소비교 = false
        System.out.println("ff == gg  : "+(ff==gg));
        // object 의 equals 는 주솟값 비교임
        System.out.println("ff.equals(gg) : "+ff.equals(gg));
        
    }
}
