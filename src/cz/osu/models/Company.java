package cz.osu.models;

public class Company {
    private String name;
    private Address address;

    private Register register;

    public Company(String name, Address address) {
        this.name = name;
        this.address = address;

        register = new Register();
    }

    public void addPayable(Payable payable) {
        register.add(payable);
    }

    public void printRegister() {
        register.forEach(payable -> {
            System.out.println(payable);
            System.out.println(payable.getPayableAmount());
        });
    }
}
