package lab5.problem4;

public abstract class Employee {
    private String firstName;
    private String lastName;
    private String socialSecurityNumber;

    public Employee(String firstName, String lastName, String socialSecurityNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public abstract double getPayment();

    public String toString() {
        return STR."""
        Name is \{firstName} \{lastName}
        Social Security Number is \{socialSecurityNumber}
        Salary is \{getPayment()}""";
    }
}
