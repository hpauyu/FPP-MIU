package lab5.problem1;

public class Electronics extends Product {
    private double warrantyCost;
    private int warrantyDuration;

    public Electronics(String productName, double price, double warrantyCost, int warrantyDuration) {
        super(productName, price);
        this.warrantyCost = warrantyCost;
        this.warrantyDuration = warrantyDuration;
    }

    @Override
    public double getPrice() {
        return warrantyCost + super.getPrice();
    }
}
