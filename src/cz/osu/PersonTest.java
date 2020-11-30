package cz.osu;

import cz.osu.models.Address;
import cz.osu.models.BirthDate;
import cz.osu.models.Person;

public class PersonTest {

    public static void main(String[] args) {
        BirthDate date1 = new BirthDate(14,6,1926);
        BirthDate date2 = new BirthDate(25,5,1968);
        BirthDate date3 = new BirthDate(28,5,1999);

        Person person1 = new Person("Michal Malý",'M', date1, new Address("Czech Republic","Olomouc","Nová ulice",77900));
        Person person2 = new Person("Ondřej Liborka",'M', date2, new Address("Czech Republic","Ostrava","Budovatelská 468/4",70800));
        Person person3 = new Person("David Miko",'M', date3, new Address("Czech Republic","Liberec","Šafránová 15",46015));

        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person3);
    }
}