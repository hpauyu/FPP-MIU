package lab5.taskb;

import java.time.LocalDate;
import java.util.Comparator;

public class DeptEmployee {
    private String name;
    private double salary;
    private LocalDate hireDate;

    public DeptEmployee() {

    }

    public DeptEmployee(String name, double salary, LocalDate hireDate) {
        this.name = name;
        this.salary = salary;
        this.hireDate = hireDate;
    }

    //default implementation
    public double getSalary() {
        return salary;
    }

    public LocalDate getHireDate() {
        return hireDate;
    }

    @Override
    public String toString() {
        return "name=" + name + ", salary=" + salary + ", hireDate=" + hireDate;
    }

    public void setHireDate(LocalDate hireDate) {
        this.hireDate = hireDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private class DeptEmployeeComparator implements Comparator<DeptEmployee> {
        @Override
        public int compare(DeptEmployee e1, DeptEmployee e2) {
            //: Sort the DeptEmployee array using the Inner class(Member Inner class) by the
            //name field.
            return e1.getName().compareTo(e2.getName());
        }
    }

    public Comparator getDeptEmployeeComparator() {
        return new DeptEmployeeComparator();
    }
}
