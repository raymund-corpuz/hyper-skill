package org.fleet.app;

import org.fleet.vehicle.Vehicle;
import org.fleet.vehicle.car.Car;
import org.fleet.vehicle.truck.Truck;
import org.fleet.vehicle.truck.delivery.truck.DeliveryTruck;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Vehicle[] vehicles = new Vehicle[6];

        vehicles[0] = new Car("Toyota", "Corolla", true, 5, "Gasoline");
        vehicles[1] = new Car("Honda", "Civic", false, 5, "Gasoline");
        vehicles[2] = new Truck("Ford", "Ranger", true, 1200, 4);
        vehicles[3] = new Truck("Isuzu", "Elf", true, 3500, 6);
        vehicles[4] = new DeliveryTruck("Volvo", "FH", false, 18000, 18, "North Luzon Route");
        vehicles[5] = new DeliveryTruck("Mercedes", "Actros", true, 20000, 18, "Metro Manila Route");

        displayAllVehicles(vehicles);
        int choice = selectedVehicle(scanner, vehicles);
        if (choice == -1) {
            return;
        }
        displayMenu();
        System.out.println();
        processAction(scanner, vehicles, choice);
    }

    public static void displayAllVehicles(Vehicle[] vehicles) {
        System.out.println("==== ALL VEHICLES ====");
        System.out.println();
        for (int i = 0; i < vehicles.length; i++) {
            System.out.println((i + 1) + ". ");
            System.out.println(vehicles[i].displayInfo());
            System.out.println();
        }
    }

    public static void displayMenu() {
        System.out.println("==== MENU ====");
        System.out.println();
        System.out.println("1 - Display Vehicle");
        System.out.println("2 - Rent Vehicle");
        System.out.println("3 - Return Vehicle");
        System.out.println("4 - Vehicle Action");
        System.out.println("5 - Exit");
        System.out.println();
    }

    public static int selectedVehicle(Scanner scanner, Vehicle[] vehicles) {
        System.out.print("Choose Vehicle: ");
        int choice = scanner.nextInt() - 1;

        if (choice < 0 || choice >= vehicles.length) {
            System.out.println("Vehicle Not Found ❌");
            return -1;
        }
        return choice;
    }

    public static void rentVehicle(Vehicle selectedVehicle) {
        System.out.println(selectedVehicle.rentVehicle());
    }

    public static void returnVehicle(Vehicle selectedVehicle) {
        System.out.println(selectedVehicle.returnVehicle());
    }

    public static void vehicleAction(Vehicle selectedVehicle) {
        if (selectedVehicle instanceof DeliveryTruck) {
            System.out.println(((DeliveryTruck) selectedVehicle).deliveryPackage());
        }
    }

    public static void processAction(Scanner scanner, Vehicle[] vehicles, int choice) {
        System.out.print("Choose Action: ");
        int action = scanner.nextInt();
        Vehicle myVehicle = vehicles[choice];

        System.out.println();
        switch (action) {
            case 1:
                System.out.println(myVehicle.displayInfo());
                System.out.println();
                break;
            case 2:
                rentVehicle(myVehicle);
                break;
            case 3:
                returnVehicle(myVehicle);
                break;
            case 4:
                vehicleAction(myVehicle);
                break;
            case 5:
                System.out.println("Exiting Program...");
                break;
            default:
                System.out.println("Invalid Action ❌");
                break;
        }
    }
}
