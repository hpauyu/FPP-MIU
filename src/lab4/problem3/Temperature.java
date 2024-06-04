package lab4.problem3;

import java.time.LocalDateTime;

public class Temperature implements Sensor{
    private double temperature;
    private String location;
    private LocalDateTime lastUpdated = getLastUpdated();

    public Temperature(double temperature, String location){
        this.temperature = temperature;
        this.location = location;
    }

    @Override
    public String getSensorType() {
        return Temperature.class.getSimpleName();
    }

    @Override
    public double getReading() {
        return this.temperature;
    }

    @Override
    public String getLocation() {
        return this.location;
    }

    @Override
    public String performAction() {
        if (this.temperature > 30)
            return "Too Hot! Turn on the AC";
        else if (this.temperature < 18)
            return "Too Cold! Turn on the Heater";
        else
            return "Temperature is in normal range";
    }
}
