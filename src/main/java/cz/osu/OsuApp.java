package cz.osu;

public class OsuApp {

    public static void main(String[] args) {
        Person p = new Person("David", 22);
        System.out.println(p);

        Student s = new Student("David",22, "Informatics");
        System.out.println(s);
    }
}
