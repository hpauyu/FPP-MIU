package lab5.taskc;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        DeptEmployee[] staff = DeptEmployeeData.getDeptData();
        System.out.println(Arrays.toString(staff));
        Main main = new Main();
        main.sort(staff);
        System.out.println(Arrays.toString(staff));
    }

    private void sort(DeptEmployee[] staff) {
        class StaffComparator implements Comparator<DeptEmployee> {
            //Task C: Sort the DeptEmployee array using Local Inner class using salary field by
            //reversed order ( Descending order).
            @Override
            public int compare(DeptEmployee e1, DeptEmployee e2) {
                return Double.compare(e2.getSalary(), e1.getSalary());
            }
        }
        Arrays.sort(staff, new StaffComparator());
    }
}
