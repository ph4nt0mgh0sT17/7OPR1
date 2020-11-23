package cz.osu.models;

public class Employee extends Person implements Payable {
    private Position position;
    private Crowns salary;

    public Employee(String name, char sex, BirthDate birthDate, Address address, Position position, Crowns salary) {
        super(name, sex, birthDate, address);
        this.position = position;
        this.salary = salary;
    }

    public Position getPosition() {
        return position;
    }

    public Crowns getSalary() {
        return salary;
    }

    @Override
    public Crowns getPayableAmount() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "position=" + position +
                ", salary=" + salary +
                '}';
    }
}
