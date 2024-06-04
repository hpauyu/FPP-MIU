package lab4.problem5.oo;

public class Main {
    public static void main(String[] args) {
        Appliance[] appliances = {
                new WashingMachine(7),
                new Refrigerator(4),
                new Microwave(800),
        };
        for (Appliance appliance: appliances){
            System.out.println(appliance.getClass().getSimpleName());
            appliance.performFunction();
        }
    }
}
