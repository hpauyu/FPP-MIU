package lab5.problem4;

public class SalariedEmployee extends Employee{
    private double weeklysalary;

    public SalariedEmployee(String firstName, String lastName, String socialSecurityNumber, double weeklysalary) {
        super(firstName, lastName, socialSecurityNumber);
        this.weeklysalary = weeklysalary;
    }

    @Override
    public double getPayment() {
        return this.weeklysalary;
    }
}
