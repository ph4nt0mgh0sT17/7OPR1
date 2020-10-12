package cz.osu.models;

import java.time.LocalDate;

public class Person {

    private String name;
    private LocalDate birthDate;
    private Address address;
    private BankAccount bankAccount;

    public Person(String name, LocalDate birthDate, Address address) {
        this.name = name;
        this.birthDate = birthDate;
        this.address = address;
        bankAccount = new BankAccount();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public BankAccount getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    public void deposit(Crowns amount) {
        bankAccount.deposit(amount);
    }

    public void deposit(double amount) {
        bankAccount.deposit(amount);
    }

    public Crowns withdraw(Crowns amount) {
        return bankAccount.withdraw(amount);
    }

    public Crowns withdraw(double amount) {
        return bankAccount.withdraw(amount);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Person {\n\t");
        sb.append("name = '").append(name).append('\'').append(",\n\t");
        sb.append("birthDate = ").append(birthDate).append(",\n\t");
        sb.append("address = ").append(address).append(",\n\t");
        sb.append("bankAccount = ").append(bankAccount).append("\n");
        sb.append('}');
        return sb.toString();
    }
}
