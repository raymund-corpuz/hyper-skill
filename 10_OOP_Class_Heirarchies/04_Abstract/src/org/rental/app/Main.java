package org.rental.app;

import org.rental.customer.Customer;
import org.rental.record.RentalRecord;
import org.rental.vehicle.Car;
import org.rental.vehicle.Motorcycle;
import org.rental.vehicle.Van;
import org.rental.vehicle.Vehicle;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Customer> customers = new ArrayList<>();
        ArrayList<RentalRecord> record = new ArrayList<>();
        LocalDate today = LocalDate.now();

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
        displayCustomers(customers);
        displayVehicles(vehicles);
//        addVehicle(vehicles, scanner);
//        int selectedVehicle = selectVehicle(vehicles, scanner);
//        if (selectedVehicle == -1) {
//            System.out.println("Invalid Selection of Vehicle");
//            return;
//        }
//        updateVehicles(vehicles, selectedVehicle, scanner);
//        displayVehicles(vehicles);
//        deleteVehicle(vehicles, scanner);
//        displayVehicles(vehicles);
        RentalRecord myRecord = rentVehicle(vehicles, scanner);
        record.add(myRecord);
        if (myRecord == null) {
            System.out.println("==== View Record Rental is Empty.❌ ====");
            return;
        }
        viewRentalRecord(record);
        returnVehicle(vehicles, record, scanner);

        scanner.close();
    }

    //Display all Customers
    public static void displayCustomers(List<Customer> customers) {
        System.out.println("==== Customers ====");
        for (int i = 0; i < customers.size(); i++) {
            System.out.print((i + 1) + ". ");
            customers.get(i).displayProfile();
            System.out.println();
        }
    }

    //Display Vehicles
    public static void displayVehicles(List<Vehicle> vehicles) {
        System.out.println("==== List of Vehicles ====");
        System.out.println();
        for (int i = 0; i < vehicles.size(); i++) {
            System.out.println((i + 1) + ". ");
            vehicles.get(i).displayInfo();
            System.out.println();
        }
    }

    //Add Vehicles
    public static void addVehicle(List<Vehicle> vehicles, Scanner scanner) {
        System.out.println("==== Add Vehicle ====");
        System.out.println();
        System.out.print("Vehicle Id: ");
        String addVehicleId = scanner.nextLine();
        System.out.print("Brand: ");
        String addBrand = scanner.nextLine();
        System.out.print("Model: ");
        String addModel = scanner.nextLine();
        System.out.print("Daily Rate: ");
        double addDailyRate = scanner.nextDouble();
        System.out.print("Available: ");
        boolean addAvailable = scanner.nextBoolean();
        System.out.print("Days: ");
        int addDays = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Car / Van / Motorcycle: ");
        String addType = scanner.nextLine();

        switch (addType) {
            case "Car":
                vehicles.add(new Car(addVehicleId, addBrand, addModel, addDailyRate, addAvailable, addDays));
                System.out.println("Successfully Added Car. ✅");
                break;
            case "Van":
                vehicles.add(new Van(addVehicleId, addBrand, addModel, addDailyRate, addAvailable, addDays));
                System.out.println("Successfully Added Van. ✅");
                break;
            case "Motorcycle":
                vehicles.add(new Motorcycle(addVehicleId, addBrand, addModel, addDailyRate, addAvailable, addDays));
                System.out.println("Successfully Added Motorcycle. ✅");
                break;
            default:
                System.out.println("Invalid Vehicle Type. ❌");
                scanner.close();
                break;
        }
    }

    public static int selectVehicle(List<Vehicle> vehicles, Scanner scanner) {
        System.out.print("Select Vehicle: ");
        int selectedUnit = scanner.nextInt() - 1;
        scanner.nextLine();

        if (selectedUnit < 0 || selectedUnit >= vehicles.size()) {
            System.out.println("Vehicle Not Found. ❌");
            return -1;
        }
        System.out.println("You have selected: " + (selectedUnit + 1));
        return selectedUnit;
    }

    //Update Vehicles
    public static void updateVehicles(List<Vehicle> vehicles, int selectedUnit, Scanner scanner) {
        System.out.println("==== Update Vehicle ====");
        System.out.println();
        System.out.print("Vehicle Id: ");
        String updateVehicleId = scanner.nextLine();
        System.out.print("Brand: ");
        String updateBrand = scanner.nextLine();
        System.out.print("Model: ");
        String updateModel = scanner.nextLine();
        System.out.print("Daily Rate: ");
        double updateDailyRate = scanner.nextDouble();
        System.out.print("Available: ");
        boolean updateAvailable = scanner.nextBoolean();
        System.out.print("Days: ");
        int updateDays = scanner.nextInt();
        scanner.nextLine();

        String dataType = vehicles.get(selectedUnit).getClass().getSimpleName();

        switch (dataType) {
            case "Car":
                vehicles.set(selectedUnit, new Car(updateVehicleId, updateBrand, updateModel, updateDailyRate, updateAvailable, updateDays));
                System.out.println("Successfully Updated Car. ✅");
                break;
            case "Van":
                vehicles.set(selectedUnit, new Van(updateVehicleId, updateBrand, updateModel, updateDailyRate, updateAvailable, updateDays));
                System.out.println("Successfully Updated Van. ✅");
                break;
            case "Motorcycle":
                vehicles.set(selectedUnit, new Motorcycle(updateVehicleId, updateBrand, updateModel, updateDailyRate, updateAvailable, updateDays));
                System.out.println("Successfully Updated Motorcycle. ✅");
                break;
            default:
                System.out.println("Invalid Vehicle Type. ❌");
                scanner.close();
                break;
        }


    }

    //Delete Vehicles
    public static void deleteVehicle(List<Vehicle> vehicles, Scanner scanner) {
        System.out.println("==== Delete Vehicle ====");
        System.out.println();
        int deleteSelection = selectVehicle(vehicles, scanner);

        for (int i = 0; i < vehicles.size(); i++) {
            if (i == deleteSelection) {
                vehicles.remove(i);
            }
        }
        System.out.println("Successfully Deleted Vehicle.✅");

    }

    //Rent Vehicles
    public static RentalRecord rentVehicle(List<Vehicle> vehicles, Scanner scanner) {
        System.out.println("==== Rent Vehicle ====");
        System.out.println();
        int choice = selectVehicle(vehicles, scanner);
        Vehicle chosenVehicle = vehicles.get(choice);

        if (!chosenVehicle.isAvailable()) {
            System.out.println("Vehicle is Not Available");
            return null;
        }
        chosenVehicle.rent();

        LocalDate today = LocalDate.now();
        return new RentalRecord(chosenVehicle.getVehicleId(), chosenVehicle.getBrand(), chosenVehicle.getModel(), today);
    }

    //Return Vehicles
    public static void returnVehicle(List<Vehicle> vehicles, List<RentalRecord> record, Scanner scanner) {
        System.out.println("==== Return Vehicle ====");
        System.out.println();
        System.out.print("Enter Vehicle Id: ");
        String myVehicleId = scanner.nextLine();
        boolean found = false;

        for (int i = 0; i < record.size(); i++) {
            if (Objects.equals(myVehicleId, record.get(i).vehicleId())) {
                found = true;
                for (Vehicle v : vehicles) {
                    if (Objects.equals(v.getVehicleId(), myVehicleId)) {
                        v.returnVehicle();
                        break;
                    }
                }
                record.remove(i);
                System.out.println("SuccessfullY Returned Vehicle.✅");
                break;
            }

        }
        if (!found) {
            System.out.println("Vehicle Not Found! ❌");
        }

    }

    //View Rental Record
    public static void viewRentalRecord(List<RentalRecord> record) {
        System.out.println("==== View Rental Record ====");
        System.out.println();
        for (int i = 0; i < record.size(); i++) {
            System.out.println("Vehicle Id: " + record.get(i).vehicleId());
            System.out.println("Brand: " + record.get(i).brand());
            System.out.println("Model: " + record.get(i).model());
            System.out.println("Date Rented: " + record.get(i).today());
        }
    }

}
