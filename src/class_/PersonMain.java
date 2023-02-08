package src.class_;


class Person{
    String name;
    int age;
}

public class PersonMain {
    public static void main(String[] args) {
        Person ps1 = new Person();
        ps1.name = "성욱";
        ps1.age =25;

        System.out.println("객체 ps1 = "+ ps1);
        
        System.out.println("이름 : "+ps1.name+ "\t나이 : "+ps1.age );
    }
}
