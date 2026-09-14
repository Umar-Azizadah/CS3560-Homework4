package part2Interface;

import java.util.ArrayList;

public class InterfaceDriver {

    public static void main(String[] args) {

        ArrayList<Payable> payables = new ArrayList<>();

        // Populate
        Freelancer freelancer1 = new Freelancer("Symere", "Woods", 25.00, 35);

        Freelancer freelancer2 = new Freelancer("Umar", "Azizadah", 30.00, 45);

        VendorInvoice invoice1 = new VendorInvoice("Office Depot", "INV001", 500.00);

        VendorInvoice invoice2 = new VendorInvoice("Tech Supply", "INV002", 1200.00);

        // Add to array
        payables.add(freelancer1);
        payables.add(freelancer2);
        payables.add(invoice1);
        payables.add(invoice2);

        double totalPayout = 0;
        for (Payable payable : payables) {
            if (payable instanceof Freelancer) {
                ((Freelancer) payable).print();
            } else if (payable instanceof VendorInvoice) {
                ((VendorInvoice) payable).print();
            }

            totalPayout += payable.calculatePayment();
            System.out.println();
        }
        // Display total payout
        System.out.println("Total Payout: $" + totalPayout);
    }
}