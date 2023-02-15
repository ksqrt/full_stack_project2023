package src.collection;

import java.util.ArrayList;

public class PersonMain {
    //
    public ArrayList<PersonDTO> init() {
        PersonDTO aa = new PersonDTO("홍길동", 25);
        PersonDTO bb = new PersonDTO("프로도", 30);
        PersonDTO cc = new PersonDTO("라이언", 40);

        //
        ArrayList<PersonDTO> ar = new ArrayList<PersonDTO>();
        ar.add(aa);
        ar.add(bb);
        ar.add(cc);

        return ar;
    }

    public static void main(String[] args) {

        PersonMain pm = new PersonMain();
        ArrayList<PersonDTO> ar = pm.init();

        for (PersonDTO i : ar) {
            System.out.println(i.getName() + "\t" + i.getAge());
        }
        System.out.println();
        for (PersonDTO i : ar) {
            System.out.println(i.toString());
        }

    }
}
