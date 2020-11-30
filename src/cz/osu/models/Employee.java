package cz.osu.models;

/**
 * The employee that has some position and salary that is paid from the {@link Company}.
 */
public class Employee extends Person implements Payable {
    private Position position;
    private Crowns salary;

    /**
     * Constructs the {@link Employee} with all personal data.
     * @param name The name of the person.
     * @param sex The character value of its sex. (M / F)
     * @param birthDate The {@link BirthDate} object that defines the date of the person's birth.
     * @param address The address of the person.
     * @param position The position of the employee.
     * @param salary The salary of the employee.
     */
    public Employee(String name, char sex, BirthDate birthDate, Address address, Position position, Crowns salary) {
        super(name, sex, birthDate, address);
        this.position = position;
        this.salary = salary;
    }

    //<editor-fold desc="Getters">

    public Position getPosition() {
        return position;
    }

    public Crowns getSalary() {
        return salary;
    }

    //</editor-fold>

    /**
     * The amount of money paid to the {@link Employee} as the salary.
     * @return The money represented in {@link Crowns} object.
     */
    @Override
    public Crowns getPayableAmount() {
        return salary;
    }

    @Override
    public String toString() {
        return super.toString() + "\n\t" +
                "Employee{" +
                "position=" + position +
                ", salary=" + salary +
                '}';
    }
}
