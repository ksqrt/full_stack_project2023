package src.inheritance;

class Test extends Object{

}
class Sample{
    public String toString(){
        return "개바부";
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
    }
}
