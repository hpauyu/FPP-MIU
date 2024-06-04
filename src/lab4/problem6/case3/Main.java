package lab4.problem6.case3;

public class Main {
    public static void main(String[] args) {
        ComproStudent comproStudent = new ComproStudent("Nan Shawng", 123456);
        ComproStudent comproStudent1 = new ComproStudent("Nan Shawng", 123456);
        System.out.println(comproStudent1.equals(comproStudent));
        Student student = new Student(comproStudent, "January", 2024);
        Student student1 = new Student(comproStudent1, "April", 2024);
        Student student2 = new Student(comproStudent1, "April", 2024);
        System.out.println(student2.equals(student1));
        System.out.println(student1.equals(student));
    }
}
