package lab9.Prob2.prob2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class EmployeeAdmin {

    /**
     * Your method prepareReport should return a list of all Employees in the input table
     * whose social security number is in the input list socSecNums and whose salary is greater than $80,000.
     * In addition, this list of Employees must be sorted by social security number, in ascending order (from numerically smallest to numerically largest).
     */
    public static List<Employee> prepareReport(HashMap<String, Employee> table, List<String> socSecNums) {
        //IMPLEMENT
        List<Employee> result = new ArrayList<>();
        if (socSecNums == null || socSecNums.isEmpty()) return result;
/*		for (String ssn : socSecNums){
			if (table.containsKey(ssn)){
				if (table.get(ssn).getSalary() > 80000){
					result.add(table.get(ssn));
				}
			}
		}*/
        table.forEach((ssn, employee) -> {
            if (ssn != null
                    && employee != null
                    && socSecNums.contains(ssn)
                    && employee.getSalary() > 80000)
                result.add(employee);
        });


        Collections.sort(result, (employee1, employee2) -> {
            return employee1.getSsn().compareTo(employee2.getSsn());
        });
        return result;

    }

}
