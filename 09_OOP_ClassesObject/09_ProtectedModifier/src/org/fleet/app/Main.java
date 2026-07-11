package org.fleet.app;

import org.fleet.vehicle.Vehicle;
import org.fleet.vehicle.car.Car;
import org.fleet.vehicle.truck.Truck;
import org.fleet.vehicle.truck.delivery.truck.DeliveryTruck;

public class Main {
    public static void main(String[] args) {
        Vehicle[] vehicles = new Vehicle[6];

        vehicles[0] = new Car("Toyota", "Corolla", true, 5, "Gasoline");
        vehicles[1] = new Car("Honda", "Civic", false, 5, "Gasoline");
        vehicles[2] = new Truck("Ford", "Ranger", true, 1200, 4);
        vehicles[3] = new Truck("Isuzu", "Elf", true, 3500, 6);
        vehicles[4] = new DeliveryTruck("Volvo", "FH", false, 18000, 18, "North Luzon Route");
        vehicles[5] = new DeliveryTruck("Mercedes", "Actros", true, 20000, 18, "Metro Manila Route");

        displayAllVehicles(vehicles);
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
}
