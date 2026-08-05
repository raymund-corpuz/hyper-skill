package org.rental.app;

import org.rental.customer.Customer;
import org.rental.vehicle.Car;
import org.rental.vehicle.Motorcycle;
import org.rental.vehicle.Van;
import org.rental.vehicle.Vehicle;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Customer> customers = new ArrayList<>();

        customers.add(new Customer("Raymund", 31, true));
        customers.add(new Customer("Alice", 27, true));
        customers.add(new Customer("George", 25, false));

        ArrayList<Vehicle> vehicles = new ArrayList<>();

        vehicles.add(new Car(
                "CAR-001",
                "Toyota",
                "Corolla",
                1800,
                true,
                5
        ));

        vehicles.add(new Car(
                "CAR-002",
                "Honda",
                "Civic",
                2200,
                true,
                5
        ));

        vehicles.add(new Car(
                "CAR-003",
                "Ford",
                "Ranger",
                3000,
                false,
                5
        ));

        vehicles.add(new Van(
                "VAN-001",
                "Toyota",
                "HiAce",
                3500,
                true,
                12
        ));

        vehicles.add(new Van(
                "VAN-002",
                "Nissan",
                "Urvan",
                4000,
                true,
                15
        ));

        vehicles.add(new Motorcycle(
                "MOTO-001",
                "Honda",
                "Click 160",
                800,
                true,
                160
        ));

        vehicles.add(new Motorcycle(
                "MOTO-002",
                "Yamaha",
                "NMAX",
                1000,
                false,
                155
        ));
    }
}
