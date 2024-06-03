package lab1;

import java.util.random.RandomGenerator;

public class problem1 {
    public static void main(String[] args) {
        int x = RandomGenerator.getDefault().nextInt(1, 9);
        System.out.printf("%.2f", Math.pow(Math.PI, x));
        System.out.println();
        int y = RandomGenerator.getDefault().nextInt(3, 14);
        System.out.printf("%.2f", Math.pow(y, Math.PI));
    }
}
