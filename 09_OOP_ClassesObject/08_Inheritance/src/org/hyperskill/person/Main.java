package org.hyperskill.person;

public class Main {
    public static void main(String[] args) {
        Client[] clients = new Client[3];
        Manager[] managers = new Manager[2];
        Programmer[] programmers = new Programmer[3];

        clients[0] = new Client("George", 45, "ABS-CBN Corporation", 50000);
        clients[1] = new Client("Romeo", 34, "SNPW Manufacturing", 45000);
        clients[2] = new Client("Alice", 44, "GMA Network", 35000);

        managers[0] = new Manager("Fujioka", 45, "Production Control", 120_000, 10);
        managers[1] = new Manager("Manabu", 51, "Production", 150_000, 20);

        programmers[0] = new Programmer("Raymund", 31, "IT", 40_000, "Java");
        programmers[1] = new Programmer("Kim", 28, "IT", 35_000, "Python");
        programmers[2] = new Programmer("Karl", 33, "IT", 32_000, "Python");


        displayClients(clients);
        displayEmployees(managers);
        displayEmployees(programmers);

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
        System.out.println("==== Employees ====");
        System.out.println();
        for (int i = 0; i < employees.length; i++) {
            System.out.println((i + 1) + ". " + employees[i].displayInfo());
        }
        System.out.println();

    }
}
