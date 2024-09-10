public class Invoice implements Payable {
    private final String partNumber;
    private final String partDescription;
    private int quantity;
    private double pricePerItem;

    // Constructor
    public Invoice(String partNumber, String partDescription, int quantity, double pricePerItem) {
        if (quantity < 0) { // validate
            throw new IllegalArgumentException("Quantity must be >= 0");
        }
        if (pricePerItem < 0.0) { // validate
            throw new IllegalArgumentException("Price per item must be >= 0.0");
        }
        this.partNumber = partNumber;
        this.partDescription = partDescription;
        this.quantity = quantity;
        this.pricePerItem = pricePerItem;
    }

    // Getters and setters
    public String getPartNumber() { return partNumber; }
    public String getPartDescription() { return partDescription; }
    public int getQuantity() { return quantity; }
    public void setQuantity(int quantity) {
        if (quantity < 0) {
            throw new IllegalArgumentException("Quantity must be >= 0");
        }
        this.quantity = quantity;
    }

    public double getPricePerItem() { return pricePerItem; }
    public void setPricePerItem(double pricePerItem) {
        if (pricePerItem < 0.0) {
            throw new IllegalArgumentException("Price per item must be >= 0.0");
        }
        this.pricePerItem = pricePerItem;
    }

    // Implement the Payable interface method
    @Override
    public double getPaymentAmount() {
        return getQuantity() * getPricePerItem(); // calculate total cost
    }

    @Override
    public String toString() {
        return String.format("Invoice:%nPart number: %s (%s)%nQuantity: %d%nPrice per item: $%,.2f",
                getPartNumber(), getPartDescription(), getQuantity(), getPricePerItem());
    }
}
