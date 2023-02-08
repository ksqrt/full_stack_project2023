package src.class_;


class Person{
    String name;
    int age;
    public void setName(String n) {
        name = n;
    }
    public void setAge(int a) {
        age = a;
    }
    
}



public class PersonMain {
    public static void main(String[] args) {
        Person ps1 = new Person();
        ps1.setAge(0);
        ps1.setName("성욱");

        System.out.println("객체 ps1 = "+ ps1);
        
        System.out.println("이름 : "+ps1.name+ "\t나이 : "+ps1.age );
    }
}
