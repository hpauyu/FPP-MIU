package lab4.problem3;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public interface Sensor {
    public String getSensorType();
    public double getReading();
    public String getLocation();
    public String performAction();
    default LocalDateTime getLastUpdated(){
        return LocalDateTime.now();
    }
    default String getStatusOfTheObject(){
        return STR."""
                Sensor Type: \{getSensorType()}
                Reading : \{getReading()}
                Location: \{getLocation()}
                Last Updated: \{getLastUpdated().format(DateTimeFormatter.ofPattern("hh:mm a"))}
                Action: \{performAction()}""";
    }
}
