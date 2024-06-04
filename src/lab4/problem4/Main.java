package lab4.problem4;

public class Main {
    public static void main(String[] args) {
        Employee e1 = new CommissionEmployee("Nan Shawng", "Hpauyu", "123456", 40000, 10);
        Employee e2 = new BasePlusCommissionEmployee("Sai", "Janan", "123456", 40000, 10, 2000);
        Employee e3 = new HourlyEmployee("Jumwu", "Awng", "123456", 20, 40);
        Employee e4 = new SalariedEmployee("Hkawn", "Bu", "123456", 50000);
        Employee e5 = new SalariedEmployee("Gam", "Maw", "123456", 55000);
        Employee e6 = new CommissionEmployee("Nan", "Hpauyu", "123456", 60000, 15);
        Employee[] col = new Employee[]{e1, e2, e3, e4, e5, e6};
        System.out.println(findMaxSalary(col));
    }

    public static Employee findMaxSalary(Employee[] col) {
        Employee result = null;
        for (Employee e : col) {
            if (e != null) {
                if (result == null || e.getPayment() > result.getPayment()) result = e;
            }
        }
        return result;
    }
}
