package cz.osu;

import cz.osu.models.*;

public class CompanyRun {
    public static void main(String[] args) {
        Company company = new Company("Mikrite", new Address("Czech Republic","Ostrava","Ostravska 56",73932));

        company.addPayable(new Invoice("12648","It's a pen!",5,new Crowns(50)));
        company.addPayable(new Invoice("12648","It's a pen!",15,new Crowns(5)));
        company.addPayable(new Invoice("12648","It's a pen!",20,new Crowns(250)));
        company.addPayable(new Employee(
                "David Miko",
                'M',
                new BirthDate(28,5,1999),
                new Address("Czech Republic","Olomouc","Olomoucka 56",73932),
                Position.ADMINISTRATION,
                new Crowns(2500)));
        company.addPayable(new Employee(
                "David Miko",
                'M',
                new BirthDate(28,5,1999),
                new Address("Czech Republic","Olomouc","Olomoucka 56",73932),
                Position.ADMINISTRATION,
                new Crowns(50000)));
        company.printRegister();
    }
}
