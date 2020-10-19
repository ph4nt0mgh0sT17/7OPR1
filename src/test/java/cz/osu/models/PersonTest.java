package cz.osu.models;

import cz.osu.banking.Crowns;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {
    private Person person;

    @BeforeEach
    void setUp() {
        Address address = new Address(new State("Czech Republic", "CZE"),"Vratimov", "Nejaka ulice", 1099);
        person = new Person("David Miko",
                LocalDate.of(1999, 5,28),
                address);
    }

    @Test
    void depositWithDouble() {
        person.deposit(200.0);
        assertEquals(new Crowns(200.0),person.getBankAccount().getBalance());
    }

    @Test
    void depositWithCrowns() {
        person.deposit(new Crowns(400.0));
        assertEquals(new Crowns(400.0), person.getBankAccount().getBalance());
    }

    @Test
    void withdrawWithDouble() {
        person.withdraw(200.0);
        assertEquals(new Crowns(-200.0), person.getBankAccount().getBalance());
    }

    @Test
    void withdrawWithCrowns() {
        person.deposit(5000);
        person.withdraw(new Crowns(500));
        assertEquals(new Crowns(4500), person.getBankAccount().getBalance());
    }
}