package cz.osu.models;

import java.time.LocalDate;
import java.time.Period;
import java.util.Calendar;
import java.util.Random;

public class Person {
    private String name;
    private char sex;
    private String birthId;
    private Address address;
    private final BirthDate birthDate;

    public Person(String name, char sex, BirthDate birthDate, Address address) {
        validateName(name);
        validateSex(sex);
        validateBirthDate(birthDate);
        validateAddress(address);

        this.name = name;
        this.sex = sex;
        this.birthDate = new BirthDate(birthDate);
        this.address = new Address(address);
        this.birthId = calculateBirthId(birthDate);
    }

    /**
     * Validates the name. If name is null or blank (empty) then {@link IllegalArgumentException} is thrown.
     * @param name The name of the person.
     */
    private void validateName(String name) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("The name cannot be null or empty.");
        }
    }

    /**
     * Validates the sex character. If sex is not 'F' or 'M', then {@link IllegalArgumentException} is thrown.
     * @param sex The sex of the person.
     */
    private void validateSex(char sex) {
        if (sex != 'M' && sex != 'F') {
            throw new IllegalArgumentException("The sex character can be only 'F' or 'M'.");
        }
    }

    /**
     * Validates the {@link BirthDate}. If birth date is null then {@link IllegalArgumentException} is thrown.
     * @param birthDate The birth date of the person.
     */
    private void validateBirthDate(BirthDate birthDate) {
        if (birthDate == null) {
            throw new IllegalArgumentException("The birth date cannot be null.");
        }
    }

    /**
     * Validates the {@link Address}. If address is null then {@link IllegalArgumentException} is thrown.
     * @param address The address of the person.
     */
    private void validateAddress(Address address) {
        if (address == null) {
            throw new IllegalArgumentException("The address cannot be null.");
        }
    }

    /**
     * Calculates the Birth ID from the {@link BirthDate} object.
     * @param birthDate The {@link BirthDate} object that contains the date of the birth.
     * @return The Birth id String.
     */
    private String calculateBirthId(BirthDate birthDate) {
        String birthId = "";

        String yearPart = String.valueOf(birthDate.getYear()).substring(2,4);

        String monthPart = String.valueOf(birthDate.getMonth());
        if (monthPart.length() == 1)
            monthPart = "0" + monthPart;

        String dayPart = String.valueOf(birthDate.getDay());
        if (dayPart.length() == 1)
            dayPart = "0" + dayPart;

        birthId += yearPart + monthPart + dayPart;

        int randomNumbers = new Random().nextInt(100);

        if (randomNumbers < 10)
            birthId += "0";

        birthId += String.valueOf(randomNumbers);

        birthId += "00";

        long birthIdNumber = Long.parseLong(birthId);

        if (birthIdNumber % 11 > 0)
            birthIdNumber += 11 - birthIdNumber % 11;
        return String.valueOf(birthIdNumber);
    }

    /**
     * Gets the age of Person based on {@link BirthDate} object.
     * @return The integer value of age.
     */
    public int getAge() {
        LocalDate now = LocalDate.now();
        LocalDate birthLocalDate = LocalDate.of(birthDate.getYear(), birthDate.getMonth(), birthDate.getDay());

        Period difference = Period.between(birthLocalDate, now);

        return difference.getYears();
    }

    public String getName() {
        return name;
    }

    public String getBirthId() {
        return birthId;
    }

    public char getSex() {
        return sex;
    }

    public Address getAddress() {
        return address;
    }

    public BirthDate getBirthDate() {
        return birthDate;
    }

    @Override
    public String toString() {
        return "Person{" + "\n" +
                "\t" + "name='" + name + '\'' + ",\n" +
                "\t" + "sex=" + sex + ",\n" +
                "\t" + "birthId='" + birthId + '\'' + ",\n" +
                "\t" + "address=" + address + ",\n" +
                "\t" + "birthDate=" + birthDate + ",\n" +
                "\t" + "age="+ getAge() + ",\n" +
                '}';
    }
}