package lab8.problem4;

public class Ticket {
    private String id ;
    private String description;
    public Ticket(String id , String description){
        this.id = id;
        this.description = description;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    @Override
    public String toString(){
        return STR."\{getId()} :\{getDescription()}";
    }
}
