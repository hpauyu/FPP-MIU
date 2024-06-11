package lab7.prob1;

class Person {
    private String firstName;
    private String lastName;
    private int age;

    // --------------------------------------------------------------
    public Person(String first, String last, int a) {
        // constructor
        lastName = last;
        firstName = first;
        age = a;
    }

    // --------------------------------------------------------------
    public String getLast() {
        // get last name
        return lastName;
    }

    @Override
    public String toString() {
        return STR."\{firstName} \{lastName} \{age}";
    }
    // end class Person
}
