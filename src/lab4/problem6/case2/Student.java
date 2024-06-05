package lab4.problem6.case2;

public final class  Student extends ComproStudent {
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

    @Override
    public boolean equals(Object other) {
        if (other == null) return false;
        if (other.getClass() != this.getClass()) return false;
        Student otherStudent = (Student) other;
        return getName() == otherStudent.getName() &&
                getId() == otherStudent.getId() &&
                getEntryMonth() == otherStudent.getEntryMonth() &&
                getEntryYear() == otherStudent.getEntryYear();
    }
}
