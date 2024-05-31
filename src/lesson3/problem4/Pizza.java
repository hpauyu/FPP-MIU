package lesson3.problem4;

public class Pizza {
    private PizzaSize pizzaSize;
    private PizzaType pizzaType;
    private int quantity;
    private double price;

    //Constructor
    public Pizza(PizzaSize pizzaSize, PizzaType pizzaType, int quantity) {
        this.pizzaSize = pizzaSize;
        this.pizzaType = pizzaType;
        this.quantity = quantity;
    }

    private void calculatePrice() {
        double sizePrice = switch (this.pizzaSize) {
            case SMALL -> 8;
            case MEDIUM -> 10;
            case LARGE -> 12;
        };
        double typePrice = switch (this.pizzaType) {
            case VEGGIE -> 1;
            case PEPPERONI -> 2;
            case CHEEZE -> 1.5;
            case BBQ_CHICKEN -> 2;
        };
        this.price = (sizePrice + typePrice) * this.quantity;
    }

    public String printOrderSummary() {
        calculatePrice();
        double tax = price * 0.03;
        String summary = String.format("Pizza Order:\n" +
                "Size: %s\n" +
                "Type: %s\n" +
                "Qty: %d\n" +
                "Price:$%.2f\n" +
                "Tax: $%.2f\n" +
                "Total Price: $%.2f", pizzaSize, pizzaType, quantity, price, tax, tax + price);
        return summary;
    }
}
