package cz.osu;

import cz.osu.structures.Vector;
import cz.osu.utils.IntroductionDisplayer;
import lombok.extern.slf4j.Slf4j;

import java.util.Random;

@Slf4j
public class OsuApp {

    public static void main(String[] args) {
        log.info("The application has started!");

        System.out.println(IntroductionDisplayer.renderIntroduction());

        Vector v1 = new Vector(10);
        Random rnd = new Random();
        for (int i = 0; i < v1.getSize(); i++) {
            v1.setVectorItem(i, rnd.nextInt(20));
        }

        System.out.println(v1);

        log.info("The application has exited!");
    }
}
