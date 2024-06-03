package lab4.problem2;

import java.time.LocalDate;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        DeptEmployee employee1 = new Professor("Renuka", 100000, LocalDate.of(2023, 02, 02), 10);
        DeptEmployee employee2 = new Professor("Payman", 90000, LocalDate.of(2022, 02, 22), 15);
        DeptEmployee employee3 = new Professor("Najeeb", 130000, LocalDate.of(2020, 12, 13), 10);
        DeptEmployee employee4 = new Secretary("Renee", 40000, LocalDate.of(2021, 02, 05), 5);
        DeptEmployee employee5 = new Secretary("Hyee", 45000, LocalDate.of(2021, 8, 05), 10);
        DeptEmployee[] department = new DeptEmployee[5];
        department[0] = employee1;
        department[1] = employee2;
        department[2] = employee3;
        department[3] = employee4;
        department[4] = employee5;
        Scanner scanner = new Scanner(System.in);
        String answer = "";
        do {
            System.out.println("Do you wish to see the sum of all Professor and Secretary salary in the department? y or n");
            answer = scanner.next();
            double sum = 0;
            for (DeptEmployee e : department) {
                if (e != null)
                    System.out.println(e.computeSalary());
                sum += e.computeSalary();
            }
            System.out.println(STR."The total salary is \{sum}");
            System.out.println(STR."The average salary of the department is \{sum / department.length}");
        } while (answer.equals("y"));
    }
}
