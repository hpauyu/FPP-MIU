package lab4.problem3;

public class Main {
    public static void main(String[] args) {
        Sensor sensor1 = new Temperature(23.5, "Living Room");
        Sensor sensor2 = new Light(80,"Garden");
        Sensor sensor3 = new Sound(65,"Bedroom");
        Sensor sensor4 = new Light(40,"Basement");
        Sensor sensor5 = new Temperature(35, "Kitchen");
        Sensor[] col = {sensor1,sensor2,sensor3,sensor4,sensor5};
        for (Sensor s : col){
            s.getLastUpdated();
            System.out.println(s.getStatusOfTheObject());
        }
    }
}
