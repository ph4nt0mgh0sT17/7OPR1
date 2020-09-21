package cz.osu;

public class DayCounter extends Counter {

    private final String[] days = {
            "Monday", "Tuesday", "Wednesday",
            "Thursday", "Friday", "Saturday", "Sunday"
    };

    public DayCounter(int state, String name) {
        super(state, name);
    }

    /**
     * Simulates day of week according to the state field.
     * @return The string representation of the day of week.
     */
    public String dayOfWeek() {

        // We use Math.abs method because state can be a negative number
        int dayIndex = Math.abs(state) % days.length;

        return days[dayIndex];
    }

}
