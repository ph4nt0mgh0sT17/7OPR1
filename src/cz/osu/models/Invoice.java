package cz.osu.models;

public class Invoice implements Payable {
    private String partNumber;
    private String partDescription;
    private int quantity;
    private Crowns pricePerItem;

    public Invoice(String partNumber, String partDescription, int quantity, Crowns pricePerItem) {
        this.partNumber = partNumber;
        this.partDescription = partDescription;
        this.quantity = quantity;
        this.pricePerItem = pricePerItem;
    }

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

    @Override
    public String toString() {
        return "Invoice{" +
                "partNumber='" + partNumber + '\'' +
                ", partDescription='" + partDescription + '\'' +
                ", quantity=" + quantity +
                ", pricePerItem=" + pricePerItem +
                '}';
    }

    @Override
    public Crowns getPayableAmount() {
        return pricePerItem.multiply(quantity);
    }
}
