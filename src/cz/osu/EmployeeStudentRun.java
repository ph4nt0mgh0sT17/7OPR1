package cz.osu;

import cz.osu.models.*;

public class EmployeeStudentRun {
    public static void main(String[] args) {
        Employee employee = new Employee(
                "David Miko",
                'M',
                new BirthDate(28,5,1999),
                new Address("Czech Republic","Olomouc","Olomoucka 56",73932),
                Position.ADMINISTRATION,
                new Crowns(2500));

        System.out.println(employee);

        System.out.println();

        Student student = new Student(
                "David Miko",
                'M',
                new BirthDate(28,5,1999),
                new Address("Czech Republic","Olomouc","Olomoucka 56",73932),
                "Ostravska Univerzita",
                "Prirodovedecka fakulta");

        System.out.println(student);
    }



}
