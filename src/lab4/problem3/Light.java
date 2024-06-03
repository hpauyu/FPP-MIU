package lab4.problem3;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Light implements Sensor{
    private double lightLevel;
    private String location;
    private LocalDateTime lastUpdated =  getLastUpdated();

    public Light(double lightLevel, String location){
        this.lightLevel = lightLevel;
        this.location = location;
    }

    @Override
    public String getSensorType() {
        return Light.class.getSimpleName();
    }

    @Override
    public double getReading() {
        return this.lightLevel;
    }

    @Override
    public String getLocation() {
        return this.location;
    }

    @Override
    public String performAction() {
        if (this.lightLevel < 100)
            return "Light is too low. Turning on the light";
        else
            return "Light is sufficient";
    }

    public String getStatusOfTheObject(){
        return STR."""
                Sensor Type: \{getSensorType()}
                Reading : \{getReading()}
                Location: \{getLocation()}
                Last Updated: \{getLastUpdated().format(DateTimeFormatter.ofPattern("hh:mm a"))}
                Action: \{performAction()}""";
    }
}
