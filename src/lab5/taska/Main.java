package lab5.taska;


import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        DeptEmployee[] staff = DeptEmployeeData.getDeptData();
        System.out.println(Arrays.toString(staff));
        DeptEmployeeComparator com = new DeptEmployeeComparator();
        Arrays.sort(staff, new DeptEmployeeComparator());
        System.out.println(Arrays.toString(staff));
    }
}
