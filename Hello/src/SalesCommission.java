public class SalesCommission {

    private double fixed = 200.0;
    private double salesItem;

    public SalesCommission(double salesItem) {
        this.salesItem = salesItem;
    }

    public double getFixed() {
        return fixed;
    }

    public double getSalesItem() {
        return salesItem;
    }

    public void setSalesItem(double salesItem) {
        this.salesItem = salesItem;
    }

    public static double commissionAmount(Double commission){
        return (commission * 9) / 100;
    }
}
