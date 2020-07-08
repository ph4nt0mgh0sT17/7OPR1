package cz.osu.utils;

import java.util.Optional;

/**
 * The util class that obtains information about the package.
 * Implementation title, version and vendor.
 *
 * Basically a wrapper for Package.
 */
public class PackageInformation {

    /**
     * Gets the package implementation title.
     * @return The Implementation Title.
     */
    public static String getImplementationTitle() {
        return Optional.ofNullable(PackageInformation.class.getPackage().getImplementationTitle()).orElse(PackageInformation.class.getName());
    }

    /**
     * Gets the package implementation version.
     * @return The Implementation Version.
     */
    public static String getImplementationVersion() {
        return Optional.ofNullable(PackageInformation.class.getPackage().getImplementationVersion()).orElse(PackageInformation.class.getName());
    }

    /**
     * Gets the package implementation vendor.
     * @return The Implementation Vendor.
     */
    public static String getImplementationVendor() {
        return Optional.ofNullable(PackageInformation.class.getPackage().getImplementationVendor()).orElse(PackageInformation.class.getName());
    }
}
