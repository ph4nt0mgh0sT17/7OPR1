package cz.osu.utils.console;

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
                .append("###################################################\n")
                .append(getImplementationTitle())
                .append(getImplementationVersion())
                .append(getImplementationVendor())
                .append("###################################################\n");

        return introduction.toString();
    }

    private static String getImplementationTitle() {
        String implementationTitle = PackageInformation.getImplementationTitle();

        return "\tTitle: " + implementationTitle + "\n";
    }

    private static String getImplementationVersion() {
        String implementationVersion = PackageInformation.getImplementationVersion();

        return "\tVersion: " + implementationVersion + "\n";
    }

    private static String getImplementationVendor() {
        String implementationVendor = PackageInformation.getImplementationVendor();

        return "\tAuthor: " + implementationVendor + "\n";
    }
}
