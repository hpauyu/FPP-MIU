package lab4.problem5.oo;

public class WashingMachine implements Appliance{
    private int loadCapacity;

    public WashingMachine(int loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    public int getLoadCapacity() {
        return loadCapacity;
    }

    public void performFunction() {
        System.out.println(STR."Starting wash cycle with load capacity: \{loadCapacity} kg.");
    }
}
