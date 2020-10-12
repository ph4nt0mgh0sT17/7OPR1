package cz.osu;

import cz.osu.models.Address;
import cz.osu.models.BankAccount;
import cz.osu.models.Person;
import cz.osu.models.State;

import java.time.LocalDate;

public class PersonTest {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();

        bankAccount.deposit(150);

        System.out.println(bankAccount);

        bankAccount.withdraw(10);

        System.out.println(bankAccount);

        bankAccount.deposit(150);

        System.out.println(bankAccount);


        Person person = new Person(
                "David Miko", LocalDate.now(),
                new Address(
                        new State("Czech Republic", "CZE"), "Ostrava", "Vratimovska", 156)
        );

        person.deposit(16000);

        System.out.println(person);
    }
}
