package orgEx1;

import orgEx1.school.Student;

public class Main {
    public static void main(String[] args) {
        Student ray = new Student();
        ray.name = "Raymund";
        ray.age = 24;
        ray.course = "Computer Science";

        System.out.println("Project Name: School Management Package");
        System.out.println();
        System.out.println("Name: " + ray.name);
        System.out.println("Age: " + ray.age);
        System.out.println("Course: " + ray.course);
        System.out.println();
        System.out.println("End Of Program...");
    }


}
