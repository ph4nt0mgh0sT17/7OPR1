package cz.osu;

public class Person {
    private String name;
    private int ageYear;

    public Person(String name, int ageYear) {
        this.name = name;
        this.ageYear = ageYear;
    }

    //<editor-fold desc="Getters and Setters">

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAgeYear() {
        return ageYear;
    }

    public void setAgeYear(int ageYear) {
        this.ageYear = ageYear;
    }

    //</editor-fold>


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", ageYear=" + ageYear +
                '}';
    }

    public void print() {
        System.out.println(toString());
    }
}
