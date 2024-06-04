package lab4.problem5.oo;

public class Microwave implements Appliance{
    private int powerLevel;

    public Microwave(int powerLevel) {
        this.powerLevel = powerLevel;
    }

    public int getPowerLevel() {
        return powerLevel;
    }

    public String heatFood() {
        return STR."Heating food at power level: \{powerLevel}.";
    }
    public void performFunction() {
        System.out.println(STR."Heating food at power level: \{powerLevel}.");
    }
}
