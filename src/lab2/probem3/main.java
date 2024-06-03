package lab2.probem3;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please, enter the event name:");
        String name = scanner.nextLine();
        LocalDate localDate;
        LocalTime localTime;
        while (true) {
            System.out.print("Enter date, month, year in 1994-02-20: ");
            String date = scanner.nextLine();
            localDate = LocalDate.parse(date, DateTimeFormatter.ofPattern("yyyy-M-d"));
            System.out.print("Enter time in the format (h:mm) eg; 10:10: ");
            String time = scanner.nextLine();
            localTime = LocalTime.parse(time, DateTimeFormatter.ofPattern("H:mm"));
            Event event = new Event(name, ZonedDateTime.of(localDate,localTime, ZoneId.systemDefault()));
            System.out.println(event.numberOfDays());
            System.out.println(event.formatDisplay());
            System.out.println(event.isLeapYear());
            System.out.println(event.zoneConversion("Asia/Rangoon"));
        }
    }
}
