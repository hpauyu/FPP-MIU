package lab5.problem1;

public class Clothing extends Product {
    private String brand;
    private double discountPercentage;

    public Clothing(String productName, double price, String brand, double discountPercentage) {
        super(productName, price);
        this.brand = brand;
        this.discountPercentage = discountPercentage;
    }

    @Override
    public double getPrice() {
        return super.getPrice() - (discountPercentage / 100) * super.getPrice();
    }
}
