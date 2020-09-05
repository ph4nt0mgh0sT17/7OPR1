package cz.osu;

import cz.osu.utils.IntroductionDisplayer;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class OsuApp {

    public static void main(String[] args) {
        log.info("The application started.");

        System.out.println(IntroductionDisplayer.renderIntroduction());

        log.info("The application ended.");
    }


}
