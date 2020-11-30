package cz.osu.models;

import java.util.Random;

public class Invoice implements Payable {
    private String partNumber;
    private String partDescription;
    private int quantity;
    private Crowns pricePerItem;

    /**
     * Constructs the invoice.
     * @param partNumber The part number of the invoice. This number is not generated.
     * @param partDescription The description of the invoice.
     * @param quantity The quantity of the items in the invoice.
     * @param pricePerItem The price as {@link Crowns} per 1 item.
     */
    public Invoice(String partNumber, String partDescription, int quantity, Crowns pricePerItem) {
        validatePartNumber(partNumber);
        validateQuantity(quantity);

        this.partNumber = partNumber;
        this.partDescription = partDescription;
        this.quantity = quantity;
        this.pricePerItem = pricePerItem;
    }

    /**
     * Constructs the invoice.
     * @param partDescription The description of the invoice.
     * @param quantity The quantity of the items in the invoice.
     * @param pricePerItem The price as {@link Crowns} per 1 item.
     */
    public Invoice(String partDescription, int quantity, Crowns pricePerItem) {
        validateQuantity(quantity);

        this.partNumber = generatePartNumber();
        this.partDescription = partDescription;
        this.quantity = quantity;
        this.pricePerItem = pricePerItem;
    }


    //<editor-fold desc="Getters and Setters">

    public String getPartNumber() {
        return partNumber;
    }

    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }

    public String getPartDescription() {
        return partDescription;
    }

    public void setPartDescription(String partDescription) {
        this.partDescription = partDescription;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Crowns getPricePerItem() {
        return pricePerItem;
    }

    public void setPricePerItem(Crowns pricePerItem) {
        this.pricePerItem = pricePerItem;
    }

    //</editor-fold>

    /**
     * Validates the part number of the {@link Invoice}.
     * @param partNumber The part number in string representation.
     */
    private void validatePartNumber(String partNumber) {
        if (partNumber == null || partNumber.isBlank()) {
            throw new IllegalArgumentException("The part number of the invoice cannot be null or blank.");
        }
    }

    /**
     * Validates the quantity of item in the {@link Invoice}.
     * @param quantity The integer number of items in the {@link Invoice}.
     */
    private void validateQuantity(int quantity) {
        if (quantity < 0) {
            throw new IllegalArgumentException("The quantity of items in the invoice cannot be negative.");
        }
    }

    /**
     * Generates random part number of the {@link Invoice}.
     * @return The generated part number.
     */
    private String generatePartNumber() {
        Random numberGenerator = new Random();

        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            stringBuilder.append(numberGenerator.nextInt(10));
        }

        return stringBuilder.toString();
    }

    @Override
    public String toString() {
        return "Invoice{" +
                "partNumber='" + partNumber + '\'' +
                ", partDescription='" + partDescription + '\'' +
                ", quantity=" + quantity +
                ", pricePerItem=" + pricePerItem +
                '}';
    }

    /**
     * Gets the amount of money to be paid for the {@link Invoice}.
     * @return The money represented in {@link Crowns} object.
     */
    @Override
    public Crowns getPayableAmount() {
        return pricePerItem.multiply(quantity);
    }
}
