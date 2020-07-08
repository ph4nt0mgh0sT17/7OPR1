package cz.osu;

import cz.osu.utils.IntroductionDisplayer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class OsuApp {
    private static final Logger logger = LoggerFactory.getLogger(OsuApp.class);

    public static void main(String[] args) {
        logger.info("The application started.");

        System.out.println(IntroductionDisplayer.renderIntroduction());

        logger.info("The application ended.");
    }


}
