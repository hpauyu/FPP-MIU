package lab4.problem2;

import java.time.LocalDate;

public class Secretary extends DeptEmployee {
    private double overtimeHour;

    public double getOvertimeHour() {
        return overtimeHour;
    }

    public Secretary(String name, double salary, LocalDate hireDate, double overtimeHour) {
        super(name, salary, hireDate);
        this.overtimeHour = overtimeHour;
    }

    public void setOvertimeHour(double overtimeHour) {
        this.overtimeHour = overtimeHour;
    }

    @Override
    public double computeSalary() {
        return super.computeSalary() + (12 * overtimeHour);
    }
}
