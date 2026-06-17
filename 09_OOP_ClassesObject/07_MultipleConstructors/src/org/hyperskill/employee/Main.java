package org.hyperskill.employee;

public class Main {
    public static void main(String[] args) {
        Employee[] employee = new Employee[5];

        employee[0] = new Employee("Raymund", "IT", 500, 20, true);
        employee[1] = new Employee("Alice", "HR", 750, 23, true);
        employee[2] = new Employee("John", "Finance", 650, 21, true);
        employee[3] = new Employee("Mark", "Sales", 500, 23, true);
        employee[4] = new Employee("Sarah");

        System.out.println("Project Name: Employee Attendance & Payroll System");
        displayAllEmployees(employee);
    }

    public static void displayAllEmployees(Employee[] employees) {
        System.out.println("==== EMPLOYEE LIST ====");
        System.out.println();
        for (int i = 0; i < employees.length; i++) {
            System.out.println((i + 1) + ". " + employees[i].displayEmployee());
        }
        System.out.println();
    }
}
