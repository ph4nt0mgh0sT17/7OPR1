package cz.osu.utils;

import cz.osu.OsuApp;

import java.util.Optional;

/**
 * The introduction displayer class responsible for displaying the introduction text.
 */
public class IntroductionDisplayer {

    /**
     * Renders introduction string that displays the name of the app and its version.
     */
    public static String renderIntroduction() {
        StringBuilder introduction = new StringBuilder();

        introduction
                .append("#################################\n")
                .append(getImplementationTitle())
                .append(getImplementationVersion())
                .append(getImplementationVendor())
                .append("#################################\n");

        return introduction.toString();
    }

    private static String getImplementationTitle() {
        String implementationTitle = Optional.ofNullable(OsuApp.class.getPackage().getImplementationTitle()).orElse(OsuApp.class.getName());

        return "\tTitle: " + implementationTitle + "\n";
    }

    private static String getImplementationVersion() {
        String implementationVersion = Optional.ofNullable(OsuApp.class.getPackage().getImplementationVersion()).orElse("Unknown");

        return "\tVersion: " + implementationVersion + "\n";
    }

    private static String getImplementationVendor() {
        String implementationVendor = Optional.ofNullable(OsuApp.class.getPackage().getImplementationVendor()).orElse("Unknown author");

        return "\tAuthor: " + implementationVendor + "\n";
    }
}
