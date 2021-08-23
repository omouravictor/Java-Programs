package Level2_01;

public class Invoice {

    private int itemNumber;
    private String itemDescription;
    private int boughtQtd;
    private double price;

    public Invoice(int itemNumber, String itemDescription, int boughtQtd, double price) {
        this.itemNumber = itemNumber;
        this.itemDescription = itemDescription;
        setBoughtQtd(boughtQtd);
        setPrice(price);
    }

    public double getInvoiceAmount() {
        return boughtQtd * price;
    }

    public int getItemNumber() {
        return itemNumber;
    }

    public void setItemNumber(int itemNumber) {
        this.itemNumber = itemNumber;
    }

    public String getItemDescription() {
        return itemDescription;
    }

    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }

    public int getBoughtQtd() {
        return boughtQtd;
    }

    public final void setBoughtQtd(int boughtQtd) {
        if (boughtQtd < 0) {
            this.boughtQtd = 0;
        } else {
            this.boughtQtd = boughtQtd;
        }
    }

    public double getPrice() {
        return price;
    }

    public final void setPrice(double price) {
        if (price < 0) {
            this.price = 0;
        } else {
            this.price = price;
        }
    }

}
