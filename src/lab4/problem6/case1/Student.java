package lab4.problem6.case1;

public class Student extends ComproStudent {
    private String entryMonth;
    private int entryYear;

    public Student(String name, int id, String entryMonth, int entryYear) {
        super(name, id);
        this.entryMonth = entryMonth;
        this.entryYear = entryYear;
    }

    public String getEntryMonth() {
        return this.entryMonth;
    }

    public int getEntryYear() {
        return this.entryYear;
    }

    @Override
    public String toString() {
        return STR."""
                from \{entryMonth} of \{entryYear}""";
    }
}
