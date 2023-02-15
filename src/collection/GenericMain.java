package src.collection;

class GenericTest<T> {
    private T a;

    public T getA() {
        return a;
    }

    public void setA(T a) {
        this.a = a;
    }

}

public class GenericMain {

    public static void main(String[] args) {
        GenericTest aa = new GenericTest();
    }
}
