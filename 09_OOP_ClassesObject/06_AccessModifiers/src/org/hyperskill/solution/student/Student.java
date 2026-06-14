package org.hyperskill.solution.student;

public class Student {
    private String studentName;
    private double gpa;
    private double tuitionBalance;
    private String course;

    public Student(String studentName, double gpa, double tuitionBalance, String course) {
        this.studentName = studentName;
        this.gpa = gpa;
        this.tuitionBalance = tuitionBalance;
        this.course = course;
    }

    void displayStudentInfo() {
        System.out.println("==== STUDENT INFORMATION ====");
        System.out.println();
        System.out.println("Student Name: " + this.studentName);
        System.out.println("Course: " + this.course);
        System.out.println("Current GPA: " + this.gpa);
        System.out.println("Remaining Tuition Balance: " + this.tuitionBalance);
        System.out.println();
    }

    void payTuition(double payment) {
        if (payment <= 0) {
            System.out.println("Invalid Payment❌");
        } else if (payment > this.tuitionBalance) {
            System.out.println("Payment Exceeds Balance❌");
        } else {
            this.tuitionBalance -= payment;
            System.out.println("Payment Successful");
            System.out.println("Remaining Tuition Balance: " + this.getTuitionBalance());
        }
    }

    void updateGPA(double newGPA) {
        if (newGPA < 1.0 || newGPA > 5.0) {
            System.out.println("Invalid GPA❌");
        } else {
            this.gpa = newGPA;
            System.out.println("GPA Updated");
            System.out.println();
            System.out.println("Updated GPA: " + this.getGpa());
        }
    }

    String getStudentName() {
        return this.studentName;
    }

    double getGpa() {
        return this.gpa;
    }

    String getCourse() {
        return this.course;
    }

    double getTuitionBalance() {
        return this.tuitionBalance;
    }
}
