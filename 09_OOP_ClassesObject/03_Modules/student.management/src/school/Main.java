package school;

public class Main {
    public static void main(String[] args) {
        Student student = new Student();

        student.name = "Raymund";
        student.age = 24;
        student.course = "Computer Science";

        System.out.println("Project Name: Student Management Module");
        System.out.println();
        System.out.println("==== STUDENT INFO ====");
        System.out.println();
        System.out.println("Name: " + student.name);
        System.out.println("Age: " + student.age);
        System.out.println("Course: " + student.course);
        System.out.println();
        System.out.println("End Of Program....");
    }
}
