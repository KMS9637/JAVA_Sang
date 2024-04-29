package LHJ;

import KMS.KMS;
//import LHJ.Person;
import LSJ.LEESOOJIN;
import LeeYeonsu.Leeyeonsu_ExtendsPerson;
import NGY.NamGwiYeon;

public class PersonTest {

    public static void main(String[] args) {
        Person[] personTest = new Person[5];
        
        personTest[0] = new Person("i");
        personTest[1] = new KMS("KMS");
        personTest[2] = new NamGwiYeon("NGY");
        personTest[3] = new LEESOOJIN("LSJ");
        personTest[4] = new Leeyeonsu_ExtendsPerson("LYS");
        
        for (Person person : personTest) {
            if (person != null) {
                System.out.println(person.getName() + "님이 ");
                if (person instanceof KMS) {
                    ((KMS) person).sleep();
                } else if (person instanceof NamGwiYeon) {
                    ((NamGwiYeon) person).walk();
                } else if (person instanceof LEESOOJIN) {
                    ((LEESOOJIN) person).walk();
                } else if (person instanceof Leeyeonsu_ExtendsPerson) {
                    ((Leeyeonsu_ExtendsPerson) person).speak();
                }
                System.out.println();
            }
        }
    }
}