package cz.osu.models;

/**
 * The interface of all objects that can be paid by the {@link Company}.
 */
public interface Payable {

    /**
     * Gets the amound of money to be paid.
     * @return The {@link Crowns} object.
     */
    Crowns getPayableAmount();
}
