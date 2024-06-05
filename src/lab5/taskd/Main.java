package lab5.taskd;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        DeptEmployee[] staff = DeptEmployeeData.getDeptData();
        System.out.println(Arrays.toString(staff));
        Arrays.sort(staff, new Comparator<DeptEmployee>() {
            //: Sort the DeptEmployee array using Anonymous Inner class using name field by
            //reversed order.
            @Override
            public int compare(DeptEmployee e1, DeptEmployee e2) {
                return e2.getName().compareTo(e1.getName());
            }
        });
        System.out.println(Arrays.toString(staff));
    }
}
