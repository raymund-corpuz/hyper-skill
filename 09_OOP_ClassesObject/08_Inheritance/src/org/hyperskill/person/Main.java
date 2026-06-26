package org.hyperskill.person;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Client[] clients = new Client[3];
        Employee[] employees = new Employee[5];


        clients[0] = new Client("George", 45, "ABS-CBN Corporation", 50000);
        clients[1] = new Client("Romeo", 34, "SNPW Manufacturing", 45000);
        clients[2] = new Client("Alice", 44, "GMA Network", 35000);

        employees[0] = new Manager("Fujioka", 45, "Production Control", 120_000, 10);
        employees[1] = new Manager("Manabu", 51, "Production", 150_000, 20);

        employees[2] = new Programmer("Raymund", 31, "IT", 40_000, "Java");
        employees[3] = new Programmer("Kim", 28, "IT", 35_000, "Python");
        employees[4] = new Programmer("Karl", 33, "IT", 32_000, "Python");

        System.out.println("Project Name: Company Management System: Summary Lesson");
        displayClients(clients);
        System.out.println("==== Employees ====");
        System.out.println();
        displayEmployees(employees);
        Employee selectedEmployee = selectEmployee(scanner, employees);
        if (selectedEmployee == null) {
            scanner.close(); // Refactor
            return;
        }
        System.out.println();
        displayMenu();
        processEmployeeAction(scanner, selectedEmployee);
        scanner.close(); // Refactor
    }

    public static void displayClients(Client[] clients) {
        System.out.println("==== Clients ====");
        System.out.println();
        for (int i = 0; i < clients.length; i++) {
            System.out.println((i + 1) + ". " + clients[i].displayInfo());
        }
        System.out.println();
    }

    public static void displayEmployees(Employee[] employees) {
        for (int i = 0; i < employees.length; i++) {
            System.out.println((i + 1) + ". " + employees[i].displayInfo());
        }
    }

    public static Employee selectEmployee(Scanner scanner, Employee[] employees) {
        System.out.println();
        System.out.print("Choose Employee: ");
        int selectedEmployee = scanner.nextInt();
        selectedEmployee--;
        if (selectedEmployee < 0 || selectedEmployee >= employees.length) {
            System.out.println("Invalid Selection of Employee ❌");
            return null;
        } else {
            return employees[selectedEmployee];
        }
    }

    public static void displayMenu() {
        System.out.println("==== Employee Actions ====");
        System.out.println();
        System.out.println("1 - Display Employee Info");
        System.out.println("2 - Approve Project");
        System.out.println("3 - Write Code");
        System.out.println("4 - Exit");
    }

    public static void processEmployeeAction(Scanner scanner, Employee employee) {
        System.out.println();
        System.out.print("Choose Employee Action: ");
        int action = scanner.nextInt();

        switch (action) {
            case 1:
                System.out.println(employee.displayInfo());
                break;
            case 2:
                if (employee instanceof Manager manager) {
                    manager.approveProject();
                }
                break;
            case 3:
                if (employee instanceof Programmer programmer) {
                    programmer.writeCode();
                } else {
                    System.out.println("Only Programmers can write code ❌");
                }
                break;
            case 4:
                System.out.println("Exiting the Program....");
                break;
            default:
                System.out.println("Invalid Action ❌");
        }
    }
}

