package cz.osu;

import cz.osu.models.Address;
import cz.osu.models.BirthDate;
import cz.osu.models.Person;

public class OsuApp {

    public static void main(String[] args) {
        BirthDate date1 = new BirthDate(14,6,1926);
        BirthDate date2 = new BirthDate(25,5,1968);
        BirthDate date3 = new BirthDate(28,5,1999);

        Person person1 = new Person("Michal Malý",'M', date1, new Address("dd","dd","",32));
        Person person2 = new Person("Ondřej Liborka",'M', date2, new Address("dd","dd","",32));
        Person person3 = new Person("David Miko",'M', date3, new Address("dd","dd","",32));

        System.out.println(person1 + "\n");
        System.out.println(person2 + "\n");
        System.out.println(person3);
    }
}
