package lab4.problem1;

public class Main {
    public static void main(String[] args) {
        Product p1 = new Electronics("Speaker", 100, 10, 24);
        Product p2 = new Clothing("TShirt", 400, "H&M", 10);
        Product p3 = new Furniture("Chair", 430, "Wood", 20);
        Product p4 = new Clothing("Pant", 30, "Nike", 5);
        Product p5 = new Electronics("Dryer", 33, 2, 12);
        Product[] col = new Product[]{p1, p2, p3, p4, p5, null};
        for (Product p : col) {
            System.out.println(p);
        }
        System.out.println(sumProduct(col));
    }

    public static double sumProduct(Product[] col) {
        double sum = 0;
        for (Product p : col) {
            if (p != null)
                sum += p.getPrice();
        }
        return sum;
    }

}
