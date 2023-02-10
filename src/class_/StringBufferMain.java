package src.class_;

public class StringBufferMain {
    public static void main(String[] args) {
        StringBuffer buffer = new StringBuffer();

        buffer.append("hello");
        buffer.append(" world");
        System.out.println(buffer.toString());

        buffer.delete(0,buffer.length());
        
    }
}
