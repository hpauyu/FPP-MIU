package lesson3.problem2;

import java.time.LocalDate;
import java.time.Period;


public class HeartRates {
    private String firstName;
    private String lastName;
    private LocalDate dob;
    public HeartRates(String firstName,String lastName,LocalDate dob){
        this.firstName = firstName;
        this.lastName = lastName;
        this.dob = dob;
    }
    public int age(){
        return Period.between(dob,LocalDate.now()).getYears();
    }
    public int maxHeartRate(){
        return 220-age();
    }
    public double[] targetHeartRateRange(){
        double RHR = 70;
        double MHR = maxHeartRate();
        double AHR = MHR - RHR;
        double LB = 0.5;
        double UB = 0.85;
        double LBHTR = (AHR*LB)+RHR;
        double UBTHR = (AHR*UB)+RHR;
        return new double[]{LBHTR,UBTHR};
    }
    public String toString(){
        double[] targetHeartRateRange = targetHeartRateRange();
        return STR."""
               The Target Hear Rate Range is between \{targetHeartRateRange[0]} and \{targetHeartRateRange[1]}
               First Name : \{firstName}
               Last Name : \{lastName}
               Age :\{age()}
               Date of Birth : \{dob}
               Maxium Heart Rate = \{maxHeartRate()}""";
    }
}
