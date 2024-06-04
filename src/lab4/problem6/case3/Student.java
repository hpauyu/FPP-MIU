package lab4.problem6.case3;

public class Student {
    private ComproStudent comproStudent;
    private String entryMonth;
    private int entryYear;

    public Student(ComproStudent comproStudent, String entryMonth, int entryYear) {
        this.comproStudent = comproStudent;
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
                \{comproStudent.toString()}
                from \{entryMonth} of \{entryYear}""";
    }

    @Override
    public boolean equals(Object other) {
        if (other == null) return false;
        if (other.getClass() != getClass()) return false;
        Student student = (Student) other;
        return student.comproStudent.equals(comproStudent) &&
                student.entryMonth.equals(entryMonth) &&
                student.entryYear == entryYear;
    }
}
