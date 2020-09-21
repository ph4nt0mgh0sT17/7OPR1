package cz.osu;

import cz.osu.utils.IntroductionDisplayer;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class OsuApp {

    public static void main(String[] args) {

        printIntroductionText();

        // 7OPR1 - 1st lecture
        Counter counter = new Counter(0,"OSU COUNTER");

        System.out.println(counter);
        counter.add(52);
        System.out.println(counter);
        counter.remove(14);
        System.out.println(counter);

        DayCounter dayCounter = new DayCounter(15,"neco");
        System.out.println(dayCounter.dayOfWeek());
    }

    private static void printIntroductionText() {
        System.out.println("" +
                "====================================\n" +
                "               ffs                  \n" +
                "====================================\n");
    }


}
