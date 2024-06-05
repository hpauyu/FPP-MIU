package lab5.taskb;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        DeptEmployee[] staff = DeptEmployeeData.getDeptData();
        System.out.println(Arrays.toString(staff));
        Arrays.sort(staff, new DeptEmployee().getDeptEmployeeComparator());
        System.out.println(Arrays.toString(staff));
    }
}
