public class InvoiceTest {

    public static void main(String[] args) {

        Invoice invoice1 = new Invoice("1", "Mouse Logitech MX Master 2S", 3,
                438.56);
        Invoice invoice2 = new Invoice("2", "Combo Teclado e Mouse Logitech MX 3200", 5,
                320.00);
        Invoice invoice3 = new Invoice("3", "Monitor Samsung 2233, 3D, 120Hz", 1,
                1850.00);
        Invoice invoice4 = new Invoice("4", "Samsung EVO 970 PRO 240GB, NVMe M.2", 2,
                435.00);

        /** Verificação de preço. Se o preço unitário for menor que zero, altera o preço unitário para zero. */
        if (invoice1.getUnitPrice() < 0)
            invoice1.setUnitPrice(0.0);
        if (invoice2.getUnitPrice() < 0)
            invoice2.setUnitPrice(0.0);
        if (invoice3.getUnitPrice() < 0)
            invoice3.setUnitPrice(0.0);
        if (invoice4.getUnitPrice() < 0)
            invoice4.setUnitPrice(0.0);

        /** Verificação de quantidade. Se a quantidade for menor que zero, altera a quantiade para zero. */
        if (invoice1.getQuantity() < 0)
            invoice1.setQuantity(0);
        if (invoice2.getQuantity() < 0)
            invoice2.setQuantity(0);
        if (invoice3.getQuantity() < 0)
            invoice3.setQuantity(0);
        if (invoice4.getQuantity() < 0)
            invoice4.setQuantity(0);

        System.out.printf("%n%n******  Invoice System 3.0.2  ******%n%n");
        System.out.printf("Invoice: %s, Description: %s, Quantity: %d, Unit Price: R$%.2f, Total: R$%.2f%n",
                invoice1.getNumber(), invoice1.getDescription(), invoice1.getQuantity(), invoice1.getUnitPrice(),
                invoice1.getInvoiceAmount(invoice1.getUnitPrice(), invoice1.getQuantity()));
        System.out.printf("Invoice: %s, Description: %s, Quantity: %d, Unit Price: R$%.2f, Total: R$%.2f%n",
                invoice2.getNumber(), invoice2.getDescription(), invoice2.getQuantity(), invoice2.getUnitPrice(),
                invoice2.getInvoiceAmount(invoice2.getUnitPrice(), invoice2.getQuantity()));
        System.out.printf("Invoice: %s, Description: %s, Quantity: %d, Unit Price: R$%.2f, Total: R$%.2f%n",
                invoice3.getNumber(), invoice3.getDescription(), invoice3.getQuantity(), invoice3.getUnitPrice(),
                invoice3.getInvoiceAmount(invoice3.getUnitPrice(), invoice3.getQuantity()));
        System.out.printf("Invoice: %s, Description: %s, Quantity: %d, Unit Price: R$%.2f, Total: R$%.2f%n%n",
                invoice4.getNumber(), invoice4.getDescription(), invoice4.getQuantity(), invoice4.getUnitPrice(),
                invoice4.getInvoiceAmount(invoice4.getUnitPrice(), invoice4.getQuantity()));
        Double totalAmount = invoice1.getInvoiceAmount(invoice1.getUnitPrice(), invoice1.getQuantity()) +
                invoice2.getInvoiceAmount(invoice2.getUnitPrice(), invoice2.getQuantity()) +
                invoice3.getInvoiceAmount(invoice3.getUnitPrice(), invoice3.getQuantity()) +
                invoice4.getInvoiceAmount(invoice4.getUnitPrice(), invoice4.getQuantity());
        System.out.printf("%nTotal amount: %.2f%n", totalAmount);

        if (totalAmount > 3000.00)
            System.out.println("Ótima venda! Continue assim....");

    }
}
