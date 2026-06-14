package org.hyperskill.solution.student;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Student[] student = new Student[3];
        Scanner scanner = new Scanner(System.in);
        int chosenStudent;

        student[0] = new Student("Raymund", 1.2, 15_000, "Computer Science");
        student[1] = new Student("Alice", 1.5, 25_000, "Nursing");
        student[2] = new Student("George", 2.3, 20_000, "Criminology");

        displayAllStudents(student);
        System.out.println();
        chosenStudent = selectStudent(scanner, student);
        if (chosenStudent == -1) {
            return;
        }
        student[chosenStudent].displayStudentInfo();
        System.out.println();
        System.out.println("1 - Pay Tuition");
        System.out.println("2 - Update GPA");
        System.out.println("3 - Exit");
        System.out.println();
        processTransaction(scanner, chosenStudent, student);

        System.out.println("End Of Program...");
        scanner.close();
    }

    public static void displayAllStudents(Student[] student) {
        for (int i = 0; i < student.length; i++) {
            System.out.println((i + 1) + ". " + student[i].getStudentName() + " - " + student[i].getCourse());
        }
    }

    public static int selectStudent(Scanner scanner, Student[] student) {
        System.out.print("Choose Student: ");
        int chosenStudent = scanner.nextInt();
        chosenStudent--;

        if (chosenStudent < 0 || chosenStudent >= student.length) {
            System.out.println("Student Not Found");
            return -1;
        }
        return chosenStudent;
    }

    public static void processTransaction(Scanner scanner, int chosenStudent, Student[] student) {
        System.out.print("Choose Transaction: ");
        int transaction = scanner.nextInt();

        switch (transaction) {
            case 1:
                System.out.print("Enter Payment Amount: ");
                double amount = scanner.nextDouble();
                student[chosenStudent].payTuition(amount);
                break;
            case 2:
                System.out.print("Enter New GPA: ");
                double newGPA = scanner.nextDouble();
                student[chosenStudent].updateGPA(newGPA);
                break;
            case 3:
                System.out.println("Exiting Program...");
                break;
            default:
                System.out.println("Invalid Transaction");
                break;

        }
    }
}
