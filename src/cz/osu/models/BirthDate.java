package cz.osu.models;

import java.util.Arrays;

public class BirthDate {
    private int day;
    private int month;
    private int year;

    /**
     * An array displaying the number of days for each month.
     */
    private final int[] daysInMonths = {
            31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31
    };

    /**
     * The basic constructor of {@link BirthDate} that validates the day, month and year.
     * @param day The day of the month.
     * @param month The month in the year.
     * @param year The year.
     */
    public BirthDate(int day, int month, int year) {
        this.year = year;
        this.month = month;
        this.day = day;

        if (!isYearValid(year))
            throw new IllegalArgumentException("The year has to be 4 characters long.");

        if (!isMonthValid(month)) {
            throw new IllegalArgumentException("The month has to be in range 1 - 12. Instead is: " + month);
        }

        if (!isDayInMonthValid(day, month)) {
            throw new IllegalArgumentException("The day has to be in range 1 - " + daysInMonths[month - 1] + ". Instead is: " + day);
        }
    }

    /**
     * A basic copy constructor that constructs the {@link BirthDate} from another {@link BirthDate}.
     * @param birthDate Already created {@link BirthDate} object.
     */
    public BirthDate(BirthDate birthDate) {
        this(birthDate.getDay(), birthDate.getMonth(), birthDate.getYear());
    }

    /**
     * Checks if the year is valid. There is rule that year has to have 4 numbers. (XXXX)
     * @param year The integer value of the year.
     * @return The boolean state of validation.
     */
    private boolean isYearValid(int year) {
        return String.valueOf(year).length() == 4;
    }

    /**
     * Checks if the month is valid. Checks if month is within the range -> 1 - 12.
     * @param month The month of the year.
     * @return The boolean state of validation.
     */
    private boolean isMonthValid(int month) {
        return month >= 1 && month <= 12;
    }

    /**
     * Checks if the day is valid. Checks if day is within the range of days in current month.
     *
     * @param dayInMonth The day in the month.
     * @param month The month of the year.
     * @return The boolean state of validation.
     */
    private boolean isDayInMonthValid(int dayInMonth, int month) {
        return dayInMonth <= daysInMonths[month - 1] && dayInMonth > 0;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "BirthDate{" +
                "day=" + getDay() +
                ", month=" + getMonth() +
                ", year=" + getYear() +
                '}';
    }
}