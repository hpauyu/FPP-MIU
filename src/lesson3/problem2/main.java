package lesson3.problem2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter your first Name");
        String firstName = scanner.nextLine();
        System.out.println("Please, enter your last name:");
        String lastName = scanner.nextLine();
        System.out.println("Please, enter your birth date in the format-(yyyy-mm-dd)-Example 1989-4-14");
        String inputDop = scanner.nextLine();
        LocalDate dob = LocalDate.parse(inputDop,DateTimeFormatter.ofPattern("yyyy-M-d"));
        scanner.close();
        HeartRates heartRates = new HeartRates(firstName,lastName,dob);
        System.out.println(heartRates);
    }
}
