package cz.osu.banking;

import java.util.Random;

public class BankAccount {
    private int accountNumber;

    private Crowns balance;

    public BankAccount() {
        accountNumber = generateAccountNumber();
        balance = new Crowns(0);
    }

    public Crowns getBalance() {
        return balance;
    }

    private int generateAccountNumber() {
        return new Random().nextInt(Integer.MAX_VALUE);
    }

    public void deposit(Crowns amount) {
        balance = balance.plus(amount);
    }

    public void deposit(double amount) {
        deposit(new Crowns(amount));
    }

    public Crowns withdraw(Crowns amount) {
        return balance = balance.minus(amount);
    }

    public Crowns withdraw(double amount) {
        return withdraw(new Crowns(amount));
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("BankAccount {\n\t\t");
        sb.append("accountNumber = ").append(accountNumber).append(",\n\t\t");
        sb.append("balance = ").append(balance).append("\n\t");
        sb.append('}');
        return sb.toString();
    }
}
