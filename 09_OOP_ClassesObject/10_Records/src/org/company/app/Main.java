package org.company.app;

import org.company.person.employee.Designer;
import org.company.person.employee.Employee;
import org.company.person.employee.Manager;
import org.company.person.employee.Programmer;
import org.company.person.record.PayrollRecord;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Employee[] employees = new Employee[3];
        PayrollRecord record = null;

        employees[0] = new Manager("Raymund", 30, "Production Control", 50_000, 10);
        employees[1] = new Programmer("John Doe", 24, "IT", 25_000, "Java");
        employees[2] = new Designer("Jane", 22, "Design", 25_000, "Figma");

        displayEmployeeProfile(employees);
        displayMenu();
        Employee selectedEmployee = chooseEmployee(scanner, employees);
        if (selectedEmployee == null) {
            scanner.close();
            return;
        }

        boolean running = true;
        while (running) {
            displayMenu();

            System.out.print("Choose Action: ");
            int action = scanner.nextInt();

            switch (action) {
                case 1:
                    System.out.println();
                    System.out.println(selectedEmployee.displayProfile());
                    System.out.println();
                    break;
                case 2:
                    if (selectedEmployee == null) {
                        break;
                    }
                    record = processPayroll(scanner, selectedEmployee);
                    break;
                case 3:
                    System.out.println("==== PERFORM A JOB ====");
                    System.out.println();
                    performTheJob(selectedEmployee);
                    System.out.println();
                    break;
                case 4:
                    if (record == null) {
                        System.out.println();
                        System.out.println("No Payroll Record Found ❌");
                        System.out.println();
                        break;
                    }
                    viewPayrollRecord(record);
                    break;
                case 5:
                    System.out.println("Exiting Program... ✅");
                    running = false;
                    break;
                default:
                    System.out.println("Invalid Action ❌");
                    break;
            }
        }
        scanner.close();
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

    public static Employee chooseEmployee(Scanner scanner, Employee[] employees) {
        System.out.print("Choose Employee: ");
        int choice = scanner.nextInt() - 1;
        if (choice < 0 || choice >= employees.length) {
            System.out.println("Employee Not Found ❌");
            return null;
        }
        return employees[choice];
    }

    //Process Payroll
    public static PayrollRecord processPayroll(Scanner scanner, Employee employee) {
        System.out.print("Enter Pay Date (MM/DD/YYYY): ");
        String paydate = scanner.next();
        PayrollRecord record = new PayrollRecord(employee.getName(), employee.getDepartment(), employee.getClass().getSimpleName(), employee.getSalary(), paydate);
        System.out.println();
        System.out.println("Payroll processed successfully! ✅");
        System.out.println();
        System.out.println("Net Salary: $" + employee.getSalary());
        System.out.println();
        return record;

    }

    //Perform Job
    public static void performTheJob(Employee employee) {
        if (employee instanceof Manager) {
            employee.performJob();
        } else if (employee instanceof Programmer) {
            employee.performJob();

        } else if (employee instanceof Designer) {
            employee.performJob();
        }
    }

    //View Payroll Record
    public static void viewPayrollRecord(PayrollRecord payrollRecord) {
        System.out.println("==== PAYROLL RECORD ====");
        System.out.println();
        System.out.println("Employee: " + payrollRecord.employeeName());
        System.out.println("Department: " + payrollRecord.department());
        System.out.println("Position: " + payrollRecord.getClass().getSimpleName());
        System.out.println("Salary: " + payrollRecord.salary());
        System.out.println("Pay Date: " + payrollRecord.payDate());
        System.out.println();

    }

    public static void displayMenu() {
        System.out.println("==== EMPLOYEE MENU ====");
        System.out.println();
        System.out.println("1 - Display Employee Profile");
        System.out.println("2 - Process Payroll");
        System.out.println("3 - Perform Job");
        System.out.println("4 - View Payroll Record");
        System.out.println("5 - Exit");
    }

}
