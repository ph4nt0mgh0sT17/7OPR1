package cz.osu;

public class Person {
    private String name;
    private int birthYear;
    private double weight;

    public Person(String name, int birthYear, double weight) {
        this.name = name;
        this.birthYear = birthYear;
        this.weight = weight;
    }

    public Person(String name) {
        this(name, 1900, 0);
    }

    public Person(Person person) {
        this.name = person.getName();
        this.birthYear = person.getBirthYear();
        this.weight = person.getWeight();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", birthYear=" + birthYear +
                ", weight=" + weight +
                '}';
    }
}
