package lab4.problem3;

import java.time.LocalDateTime;

public class Sound implements Sensor {
    private double soundLevel;
    private String location;
    private LocalDateTime lastUpdated = getLastUpdated();

    public Sound(double soundLevel, String location) {
        this.soundLevel = soundLevel;
        this.location = location;
    }

    @Override
    public String getSensorType() {
        return Light.class.getSimpleName();
    }

    @Override
    public double getReading() {
        return this.soundLevel;
    }

    @Override
    public String getLocation() {
        return this.location;
    }

    @Override
    public String performAction() {
        if (this.soundLevel > 70)
            return "Too noise! Turn on noise cancellation";
        else
            return "Sound is within normal range";
    }
}
