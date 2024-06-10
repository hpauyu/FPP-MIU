package lab2.problem5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String yesNo;
        do {
            System.out.println("Enter C for Circle\nEnter R for Rectangle\nEnter T for Triangle");
            String selection = scanner.next();
            switch (selection) {
                case "C" -> {
                    System.out.println("Enter the radius of the Circle");
                    String radiusString = scanner.next();
                    double radius = Double.parseDouble(radiusString);
                    Circle c = new Circle(radius);
                    System.out.println(String.format("The area of the Circle is :%.2f", c.computeArea()));
                }
                case "R" -> {
                    System.out.println("Enter the width of the Rectangle");
                    double widht = Double.parseDouble(scanner.next());
                    System.out.println("Enter the height of the Rectangle");
                    double height = Double.parseDouble(scanner.next());
                    System.out.println(String.format("The area of the Rectangle is :%.2f", new Rectangle(widht, height).computeArea()));
                }
                case "T" -> {
                    System.out.println("Enter the base of the Triangle");
                    double base = Double.parseDouble(scanner.next());
                    System.out.println("Enter the height of the Triangle");
                    double height = Double.parseDouble(scanner.next());
                    System.out.println(String.format("The area of the Triangle is :%.2f", new Triangle(base, height).computeArea()));
                }
                default -> {
                    System.out.println("ERROR");
                }
            }
            ;
            System.out.print("Do you want to continue(y/n) : ");
            yesNo = scanner.next();
        } while (yesNo == "y");
    }
}
