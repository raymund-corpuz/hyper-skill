package org.company.app;

import org.company.person.employee.Designer;
import org.company.person.employee.Employee;
import org.company.person.employee.Manager;
import org.company.person.employee.Programmer;

public class Main {
    public static void main(String[] args) {

        Employee[] employees = new Employee[3];

        employees[0] = new Manager("Raymund", 30, "Production Control", 50_000, 10);
        employees[1] = new Programmer("John Doe", 24, "IT", 25_000, "Java");
        employees[2] = new Designer("Jane", 22, "Design", 25_000, "Figma");

        displayEmployeeProfile(employees);

    }

    //Display Employee Profile
    public static void displayEmployeeProfile(Employee[] employees) {
        System.out.println("==== Employees ====");
        System.out.println();
        for (int i = 0; i < employees.length; i++) {
            System.out.println((i + 1) + ".");
            System.out.println(employees[i].displayProfile());
            System.out.println();
        }
    }

    //Process Payroll
    public static void processPayroll(Employee employee) {


    }
    //Perform Job
    //View Payroll Record

}
