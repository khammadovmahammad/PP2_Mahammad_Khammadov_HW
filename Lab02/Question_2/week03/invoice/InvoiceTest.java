package week03.invoice;

public class InvoiceTest {
    public static void main(String[] args) {
        Invoice inv1 = new Invoice("H-1001", "Çəkic", 3, 12.50);
        Invoice inv2 = new Invoice("B-2040", "Burğu dəsti", -5, 20.00);
        Invoice inv3 = new Invoice("M-0007", "Mismar qutusu", 10, -4.75);

        System.out.println("===== Created invoices =====");
        System.out.println(inv1);
        System.out.println(inv2);
        System.out.println(inv3);

        System.out.println();
        System.out.println("===== Getters for invoice 1 =====");
        System.out.println("Part number:      " + inv1.getPartNumber());
        System.out.println("Part description: " + inv1.getPartDescription());
        System.out.println("Quantity:         " + inv1.getQuantity());
        System.out.println("Price per item:   " + inv1.getPricePerItem());
        System.out.println("Invoice amount:   " + inv1.getInvoiceAmount());

        System.out.println();
        System.out.println("===== Setters on invoice 2 =====");
        inv2.setQuantity(4);
        inv2.setPartDescription("Burğu dəsti (6 ədəd)");
        System.out.println(inv2);

        System.out.println();
        System.out.println("===== Setters on invoice 3 =====");
        inv3.setPricePerItem(4.75);
        inv3.setPartNumber("M-0008");
        System.out.println(inv3);

        System.out.println();
        System.out.println("===== Invalid values through setters =====");
        inv1.setQuantity(0);
        inv1.setPricePerItem(-1);
        System.out.println(inv1);
    }
}
