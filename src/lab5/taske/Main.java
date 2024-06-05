package lab5.taske;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        DeptEmployee[] staff = DeptEmployeeData.getDeptData();
        System.out.println(Arrays.toString(staff));
        //Sort the DeptEmployee array using Lambda using hire date field by natural
        //order.
        Arrays.sort(staff, (e1, e2) -> e1.getHireDate().compareTo(e2.getHireDate()));
        System.out.println(Arrays.toString(staff));
    }
}
