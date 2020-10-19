package cz.osu.banking;

import java.util.Random;

public class BankAccountSingleton {
    private int accountNumber;
    private Crowns balance;

    private static BankAccountSingleton instance;

    private BankAccountSingleton() {
        Random rnd = new Random();
        this.accountNumber = rnd.nextInt(Integer.MAX_VALUE);
        this.balance = new Crowns(0);
    }

    public static BankAccountSingleton getInstance() {
        if (instance == null) {
            instance = new BankAccountSingleton();
        }

        return instance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public Crowns getBalance() {
        return balance;
    }

    public void deposit(Crowns amount) {
        this.balance = this.getBalance().plus(amount);
    }

    public void deposit(double amount) {
        this.deposit(new Crowns(amount));
    }

    public Crowns withdraw(Crowns amount) {
        this.balance = this.getBalance().minus(amount);
        return this.getBalance();
    }

    public Crowns withdraw(double amount) {
        return this.withdraw(new Crowns(amount));
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "accountNumber=" + accountNumber +
                ", balance=" + balance +
                '}';
    }
}
