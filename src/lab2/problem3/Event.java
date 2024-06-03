package lab2.problem3;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

public class Event {
    private final String eventName ;
    private final ZonedDateTime dateTime;

    public Event(String eventName,ZonedDateTime dateTime){
        this.eventName = eventName;
        this.dateTime = dateTime;
    }
    //1.b. display the day of the week
    public String getDayOfWeek(){
        return dateTime.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.ENGLISH).toString();
    }
    //1.b. check leap year
    public boolean isLeapYear(){
        return dateTime.toLocalDate().isLeapYear();
    }

    //1.c. number of days
    public String numberOfDays(){
        return STR."\{ChronoUnit.DAYS.between(ZonedDateTime.now(), dateTime)} Days";
    }
    //2.
    public String formatDisplay(){
        return formatDisplay(this.dateTime);
                // Sunday, October 20, 2024 @ 10:30 [America/Chicago]
    }
    private String formatDisplay(ZonedDateTime dateTime){
        return STR."\{dateTime.format(DateTimeFormatter.ofPattern("EEEE, MMMM d, yyyy @ H:mm '['VV']'"))}";
        // Sunday, October 20, 2024 @ 10:30 [America/Chicago]
    }
    //3
    public String zoneConversion(String zoneId){
        ZonedDateTime dateTimeAccordingToZone = this.dateTime.withZoneSameInstant(ZoneId.of(zoneId));
        return  formatDisplay(dateTimeAccordingToZone);
    }

}
