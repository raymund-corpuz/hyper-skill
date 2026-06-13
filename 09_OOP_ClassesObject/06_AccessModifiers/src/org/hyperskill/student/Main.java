package org.hyperskill.student;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Student[] student = new Student[3];
        Scanner scanner = new Scanner(System.in);

        int chooseStudent, transaction;
        double payment, gpa;

        student[0] = new Student("Raymund", 1.5, 15000, "Computer Science");
        student[1] = new Student("Alice", 1.2, 25000, "Nurse");
        student[2] = new Student("George", 2.5, 12000, "Criminology");

        System.out.println("Project Name: University Student Portal System");
        System.out.println();
        System.out.println("==== STUDENT PORTAL ====");
        System.out.println();

        //ALL STUDENT
        displayAllStudentInfo(student);
        System.out.println();
        System.out.print("Choose Student: ");
        chooseStudent = scanner.nextInt();

        //SINGLE STUDENT
        System.out.println("==== STUDENT INFORMATION ====");
        System.out.println();
        displayStudentInfo(student, chooseStudent);
        System.out.println();

        //TRANSACTION
        System.out.println("==== TRANSACTIONS ====");
        System.out.println();
        System.out.println("1 - Pay Tuition");
        System.out.println("2 - Update GPA");
        System.out.println("3 - Exit");
        System.out.println();
        System.out.print("Choose Transaction: ");
        transaction = scanner.nextInt();


        switch (transaction) {
            case 1:
                System.out.print("Enter Payment Amount: ");
                payment = scanner.nextDouble();
                payTuition(student, payment, chooseStudent);
                break;
            case 2:
                System.out.print("Enter New GPA: ");
                gpa = scanner.nextDouble();
                updateGPA(student, gpa, chooseStudent);
                break;
            case 3:
                System.out.println("Exiting Program...");
                break;
            default:
                System.out.println("Invalid Input🚀");
                break;
        }


        System.out.println();
        System.out.println("End Of Program...");
        scanner.close();

    }

    public static void displayAllStudentInfo(Student[] student) {
        for (int i = 0; i < student.length; i++) {
            System.out.println((i + 1) + ". " + student[i].studentName + " - " + student[i].course + " - " + student[i].getGpa());
        }
    }

    public static void displayStudentInfo(Student[] student, int chooseStudent) {
        System.out.println("Student Name: " + student[chooseStudent - 1].studentName);
        System.out.println("Course: " + student[chooseStudent - 1].course);
        System.out.println("Current GPA: " + student[chooseStudent - 1].getGpa());
        System.out.println("Remaining Tuition Balance: " + student[chooseStudent - 1].getTuitionBalance());
    }

    public static void payTuition(Student[] student, double payment, int chooseStudent) {
        double balance;
        double tuition = student[chooseStudent - 1].getTuitionBalance();
        System.out.println("Payment Successful! ✅");
        System.out.println();
        balance = tuition - payment;
        System.out.println("Update Tuition Balance: " + balance);
    }

    public static void updateGPA(Student[] student, double gpa, int chooseStudent) {
        double myGPA = student[chooseStudent - 1].getGpa();
        myGPA = gpa;
        System.out.println("GPA Successfully Updated! ✅");
        System.out.println();
        System.out.println("Updated GPA: " + myGPA);
    }

}
