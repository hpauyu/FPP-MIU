package lab5.taska;

import java.util.Comparator;

public class DeptEmployeeComparator implements Comparator<DeptEmployee> {
    @Override
    public int compare(DeptEmployee e1, DeptEmployee e2){
        //Sort the collection using the name field(Natural order)
        return e1.getName().compareTo(e2.getName());
    }
}
