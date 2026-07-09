package org.hyperskill.school.app;

import org.hyperskill.school.people.Adviser;
import org.hyperskill.school.people.Student;
import org.hyperskill.school.people.Teacher;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Student[] students = new Student[5];
        Scanner scanner = new Scanner(System.in);

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
        Teacher selectedTeacher = selectTeacher(scanner, teachers);
        if (selectedTeacher == null) {
            return;
        }
        displayMenu();
        selectAction(scanner, selectedTeacher, students);
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

    public static Teacher selectTeacher(Scanner scanner, Teacher[] teacher) {
        System.out.print("Choose Teacher: ");
        int selectedTeacher = scanner.nextInt() - 1;
        if (selectedTeacher < 0 || selectedTeacher >= teacher.length) {
            System.out.println("Selected Teacher Not Found ❌");
            return null;
        }
        return teacher[selectedTeacher];
    }

    public static void displayMenu() {
        System.out.println("==== TEACHER MENU ====");
        System.out.println();
        System.out.println("1 - Display Teacher Info");
        System.out.println("2 - Teach Lesson");
        System.out.println("3 - Assign Section");
        System.out.println("4 - Exit");
        System.out.println();
    }

    public static void selectAction(Scanner scanner, Teacher selectedTeacher, Student[] students) {
        System.out.print("Choose Action: ");
        int action = scanner.nextInt();

        switch (action) {
            case 1:
                System.out.println(selectedTeacher.displayInfo());
                break;
            case 2:
                System.out.println(selectedTeacher.teachLesson());
                break;
            case 3:
                System.out.print("Enter Student Number: ");
                int selectedStudent = scanner.nextInt() - 1;
                scanner.nextLine();
                if (selectedStudent < 0 || selectedStudent >= students.length) {
                    System.out.println("Student Not Found ❌");
                    return;
                }
                System.out.print("Enter New Section: ");
                String newSection = scanner.nextLine();
                students[selectedStudent].updateSection(newSection);
                System.out.println();
                System.out.println("Section assigned successfully ✅");
                System.out.println();
                System.out.println("Updated Student:");
                System.out.println(students[selectedStudent].displayInfo());
                break;
            case 4:
                System.out.println("Exiting Program....");
                System.out.println();
            default:
                System.out.println("Invalid Action ❌");
                break;
        }
    }
}
