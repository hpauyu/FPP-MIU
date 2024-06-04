package lab4.problem5.oo;

public class Refrigerator implements Appliance{
    private int temperature;
    public Refrigerator(int temperature) {
        this.temperature = temperature;
    }
    public int getTemperature() {
        return temperature;
    }
    public void performFunction() {
        System.out.println(STR."Cooling items at temperature: \{temperature}°C.");
    }
}
