package org.hyperskill.student;

public class Student {
    private final double gpa;
    private final double tuitionBalance;
    public String studentName;
    protected String course;


    public Student(String studentName, double gpa, double tuitionBalance, String course) {
        this.studentName = studentName;
        this.gpa = gpa;
        this.tuitionBalance = tuitionBalance;
        this.course = course;

    }

    public double getTuitionBalance() {
        return this.tuitionBalance;
    }

    public double getGpa() {
        return this.gpa;
    }

}
