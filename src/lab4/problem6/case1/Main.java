package lab4.problem6.case1;

public class Main {
    public static void main(String[] args) {
        ComproStudent comproStudent = new ComproStudent("Nan Shawng", 123456);
        ComproStudent comproStudent1 = new ComproStudent("Nan Shawng", 123456);
        System.out.println(comproStudent.equals(comproStudent1));
        Student student = new Student("Nan Shawng", 123456, "April", 2024);
        Student student1 = new Student("Nan Shawng", 123456, "October", 2023);
        Student student2 = new Student("Nan Shawng", 123456, "October", 2023);
        System.out.println(student1.equals(student2));
        System.out.println(comproStudent.equals(student));
        System.out.println(student1.equals(student));

    }


}
