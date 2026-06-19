package org.hyperskill.employee;

public class Employee {
    private String employeeName;
    private String department;
    private double dailyRate;
    private int daysWorked;
    private boolean isActive;

    public Employee(String employeeName, String department) {
        this.employeeName = employeeName;
        this.department = department;
        this.dailyRate = 500;
        this.daysWorked = 0;
        this.isActive = true;
    }

    public Employee(String employeeName, String department, double dailyRate, int daysWorked, boolean isActive) {
        this.employeeName = employeeName;
        this.department = department;
        this.dailyRate = dailyRate;
        this.daysWorked = daysWorked;
        this.isActive = isActive;
    }

    String displayEmployee() {
        return this.employeeName + " - " + this.department + " - " + (this.isActive ? "Active" : "Terminated");
    }

    int recordAttendance(int days) {
        return this.daysWorked = days;
    }

    double calculateSalary() {
        return this.daysWorked * this.dailyRate;
    }

    String terminateEmployee() {
        this.isActive = false;
        return "Employee Terminated Successfully! ✅";
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public int getDaysWorked() {
        return daysWorked;
    }

    public void setDaysWorked(int daysWorked) {
        this.daysWorked = daysWorked;
    }

    public double getDailyRate() {
        return dailyRate;
    }

    public void setDailyRate(double dailyRate) {
        this.dailyRate = dailyRate;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
