
public class Invoice {

    /** Variáveis de instância */
    private String number;
    private String description;
    private Integer quantity;
    private Double unitPrice;

    /** Construtor que inicializa as quatro variáveis de instância */
    public Invoice(String number, String description, Integer quantity, Double unitPrice) {
        this.number = number;
        this.description = description;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
    }

    public String getNumber() {
        return number;
    }

    public String getDescription() {
        return description;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public Double getUnitPrice() {
        return unitPrice;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public void setUnitPrice(Double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public double getInvoiceAmount(Double unitPrice, Integer quantity) {
        if (quantity < 0)
            quantity = 0;
        if (unitPrice < 0.0)
            unitPrice = 0.0;
        Double invoiceAmount = unitPrice * quantity;
        return invoiceAmount;
    }
}
