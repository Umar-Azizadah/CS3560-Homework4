package part2Interface;

public class VendorInvoice implements Payable {
    // Instantiate vars
    private String vendorName;
    private String invoiceNumber;
    private double amountDue;

    // Constructor
    public VendorInvoice(String vendorName, String invoiceNumber, double amountDue) {
        this.vendorName = vendorName;
        this.invoiceNumber = invoiceNumber;
        setAmountDue(amountDue);
    }

    // Getters
    public String getVendorName() {
        return vendorName;
    }

    public String getInvoiceNumber() {
        return invoiceNumber;
    }

    public double getAmountDue() {
        return amountDue;
    }

    // Setters
    public void setVendorName(String vendorName) {
        this.vendorName = vendorName;
    }

    public void setInvoiceNumber(String invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    public void setAmountDue(double amountDue) {
        if (amountDue >= 0) {
            this.amountDue = amountDue;
        }
    }

    @Override
    public double calculatePayment() {
        return amountDue;
    }

    @Override
    public String getPayeeName() {
        return vendorName;
    }

    // Print method
    public void print() {
        System.out.println("Vendor Name: " + vendorName);
        System.out.println("Invoice Number: " + invoiceNumber);
        System.out.println("Payment: $" + calculatePayment());
    }

}
