import java.util.Scanner;

public class InvoiceArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("How many invoices do you want to enter? ");
        int n = sc.nextInt();
        sc.nextLine(); // consume leftover newline

        // Array to store invoices
        Invoice[] invoices = new Invoice[n];

        // Take input for each invoice
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for invoice " + (i + 1));

            System.out.print("Part number: ");
            String partNumber = sc.nextLine();

            System.out.print("Part description: ");
            String partDescription = sc.nextLine();

            System.out.print("Quantity: ");
            int quantity = sc.nextInt();

            System.out.print("Price per item: ");
            double price = sc.nextDouble();
            sc.nextLine(); // consume newline

            // Create an invoice object
            invoices[i] = new Invoice(partNumber, partDescription, quantity, price);
        }

        // Display invoice totals
        System.out.println("\nInvoice Totals:");
        for (Invoice inv : invoices) {
            System.out.println("Invoice for " + inv.getPartDescription() +
                               " (Part #" + inv.getPartNumber() + "): " +
                               "Total = $" + inv.getInvoiceAmount());
        }

        sc.close();
    }
}
