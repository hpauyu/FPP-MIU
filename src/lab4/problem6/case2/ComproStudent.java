package lab4.problem6.case2;

public class ComproStudent {
    private String name;
    private int id;

    public ComproStudent(String name, int id){
        this.name = name;
        this.id = id;
    }
    public String getName(){
        return this.name;
    }
    public int getId(){
        return this.id;
    }
    @Override
    public String toString(){
        return STR."""
                Student name is \{name} and Student ID is \{id}""";
    }

    @Override
    public boolean equals(Object other) {
        if (other == null) return false;
        if (other.getClass() != this.getClass()) return false;
        ComproStudent otherComproStuduent = (ComproStudent) other;
        return this.name.equals(otherComproStuduent.name) && this.id == otherComproStuduent.id;
    }
}
