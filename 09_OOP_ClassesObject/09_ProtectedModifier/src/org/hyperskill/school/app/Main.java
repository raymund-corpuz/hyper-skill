package org.hyperskill.school.app;

import org.hyperskill.school.people.Adviser;
import org.hyperskill.school.people.Student;
import org.hyperskill.school.people.Teacher;

public class Main {
    public static void main(String[] args) {
        Student[] students = new Student[5];

        students[0] = new Student(
                "Raymund",
                31,
                "Computer Science",
                "CS-1A");

        students[1] = new Student(
                "Alice",
                20,
                "Information Technology",
                "IT-2B");

        students[2] = new Student(
                "John",
                22,
                "Engineering",
                "ENG-3A");

        students[3] = new Student(
                "Sophia",
                19,
                "Nursing",
                "NUR-1C");

        students[4] = new Student(
                "Michael",
                21,
                "Architecture",
                "ARC-2A");

        Teacher[] teachers = new Teacher[3];

        teachers[0] = new Teacher(
                "Mrs. Santos",
                45,
                "Mathematics",
                45000);

        teachers[1] = new Teacher(
                "Mr. Cruz",
                40,
                "Programming",
                50000);

        teachers[2] = new Adviser(
                "Ms. Garcia",
                38,
                "Database",
                55000,
                "CS-1A");

        displayStudents(students);
        displayTeachers(teachers);
    }

    public static void displayStudents(Student[] students) {
        System.out.println("==== STUDENTS ====");
        System.out.println();
        for (int i = 0; i < students.length; i++) {
            System.out.println((i + 1) + ". " + students[i].displayInfo());
            System.out.println();
        }
    }

    public static void displayTeachers(Teacher[] teachers) {
        System.out.println("==== TEACHERS ====");
        System.out.println();
        for (int i = 0; i < teachers.length; i++) {
            System.out.println((i + 1) + ". " + teachers[i].displayInfo());
            System.out.println();
        }
    }
}
