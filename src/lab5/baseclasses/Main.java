package lab5.baseclasses;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        DeptEmployee[] staff = DeptEmployeeData.getDeptData();
        System.out.println(Arrays.toString(staff));
    }
}
