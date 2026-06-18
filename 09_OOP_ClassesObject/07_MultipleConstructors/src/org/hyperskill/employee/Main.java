package org.hyperskill.employee;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Employee[] employee = new Employee[5];
        Scanner scanner = new Scanner(System.in);
        int transaction;

        employee[0] = new Employee("Raymund", "IT", 800, 22, true);
        employee[1] = new Employee("Alice", "HR", 750, 22, true);
        employee[2] = new Employee("John", "Finance", 720, 24, true);
        employee[3] = new Employee("Mark", "Sales", 650, 19, true);
        employee[4] = new Employee("Sarah", "General");

        System.out.println("Project Name: Employee Attendance & Payroll System");
        System.out.println();
        displayAllEmployees(employee);
        Employee selectedEmployee = selectEmployee(scanner, employee);
        if (selectedEmployee == null) {
            System.out.println();
            System.out.println("No Employee Found ❌");
            return;
        }
        displayMenu();
        System.out.print("Choose Transaction: ");
        transaction = scanner.nextInt();


        switch (transaction) {
            case 1:
                processAttendance(scanner, selectedEmployee);
                break;
            case 2:
                viewSalary(selectedEmployee);
                break;
            default:
                System.out.println("Invalid Transaction ❌");
                break;
        }
        System.out.println("End Of Program...");

        scanner.close();
    }

    //DISPLAY ALL EMPLOYEES
    public static void displayAllEmployees(Employee[] employees) {
        System.out.println("==== EMPLOYEE LIST ====");
        System.out.println();
        for (int i = 0; i < employees.length; i++) {
            System.out.println((i + 1) + ". " + employees[i].displayEmployee());
        }
        System.out.println();
    }

    //SELECT EMPLOYEE
    public static Employee selectEmployee(Scanner scanner, Employee[] employee) {
        System.out.print("Choose Employee: ");
        int chosenEmployee = scanner.nextInt();
        chosenEmployee--;

        if (chosenEmployee == -1) {
            return null;
        }
        return employee[chosenEmployee];
    }

    public static void displayMenu() {
        System.out.println();
        System.out.println("==== TRANSACTIONS ====");
        System.out.println();
        System.out.println("1 - Record Attendance");
        System.out.println("2 - Terminate Employee");
        System.out.println("3 - View Salary");
        System.out.println("4 - Exit");
        System.out.println();
    }

    //PROCESS ATTENDANCE
    public static void processAttendance(Scanner scanner, Employee employee) {
        System.out.print("Enter Days Worked: ");
        int daysOfWork = scanner.nextInt();

        if (daysOfWork < 1 || daysOfWork > 26) {
            System.out.println();
            System.out.println("Exceeds 26 Working days🚫");
        } else {
            employee.setDaysWorked(daysOfWork);
            System.out.println();
            System.out.println("Attendance Recorded Successfully✅");
            System.out.println();
            System.out.println("Employee: " + employee.getEmployeeName());
            System.out.println("Department: " + employee.getDepartment());
            System.out.println("Days of Worked: " + employee.getDaysWorked());
            System.out.println("Daily Rate: " + employee.getDailyRate());
            System.out.println();
            System.out.println("Current Salary: " + employee.calculateSalary());
            System.out.println();
        }
    }

    //VIEW SALARY
    public static void viewSalary(Employee employee) {
        System.out.println("==== EMPLOYEE DETAILS ====");
        System.out.println();
        System.out.println("Employee: " + employee.getEmployeeName());
        System.out.println("Department: " + employee.getDepartment());
        System.out.println("Status: " + (employee.isActive() ? "Active" : "Terminated"));
        System.out.println();
        System.out.println("Daily Rate: " + employee.getDailyRate());
        System.out.println();
        System.out.println("Current Salary: " + employee.calculateSalary());
        System.out.println();
    }
    //PROCESS TERMINATION
    //FIND HIGHEST SALARY
}
