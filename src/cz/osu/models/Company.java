package cz.osu.models;

/**
 * The company that handles the paying the invoices and employees.
 */
public class Company {
    private final String name;
    private final Address address;
    private final Register register;

    /**
     * Constructs the object with a name, an address and empty {@link Register}.
     * @param name The name of the company.
     * @param address The address of the company.
     */
    public Company(String name, Address address) {
        this.name = name;
        this.address = address;
        register = new Register(20);
    }

    //<editor-fold desc="Getters">

    public String getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }

    //</editor-fold>

    /**
     * Adds a {@link Payable} object to the register.
     * @param payable The object that implements the {@link Payable} interface.
     */
    public void addPayable(Payable payable) {
        register.add(payable);
    }

    /**
     * Prints all {@link Payable} objects and how much money will be paid.
     */
    public void printRegister() {
        register.forEach(payable -> {

            if (payable instanceof Invoice) {
                Invoice invoice = (Invoice) payable;
                System.out.println(
                        "Invoice: Quantity - " + invoice.getQuantity() +
                        "; Price per item - " + invoice.getPricePerItem().toString()
                );
            }

            else if (payable instanceof Employee) {
                Employee employee = (Employee) payable;
                System.out.println("Employee: " + employee.getName() + "; Salary: " + employee.getSalary().toString());
            }

            System.out.println(payable.getPayableAmount());
        });
    }
}
