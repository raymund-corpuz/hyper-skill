package org.taxi.app;

import org.taxi.interfaces.FareCalculator;
import org.taxi.people.Customer;
import org.taxi.record.BookingRecord;
import org.taxi.vehicle.MotorcycleTaxi;
import org.taxi.vehicle.PremiumTaxi;
import org.taxi.vehicle.StandardTaxi;
import org.taxi.vehicle.Taxi;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Customer> customers = new ArrayList<>();
        ArrayList<Taxi> taxis = new ArrayList<>();
        ArrayList<BookingRecord> records = new ArrayList<>();

        //customers
        ArrayList<Customer> customers = new ArrayList<>();

        customers.add(new Customer(
                "CUS-001",
                "Raymund Corpuz",
                31,
                "09171234567",
                "Dagupan City",
                "Pangasinan"
        ));

        customers.add(new Customer(
                "CUS-002",
                "Alice Santos",
                26,
                "09281234567",
                "Urdaneta City",
                "Pangasinan"
        ));

        customers.add(new Customer(
                "CUS-003",
                "Michael Cruz",
                42,
                "09391234567",
                "San Fernando City",
                "La Union"
        ));

        customers.add(new Customer(
                "CUS-004",
                "Sophia Reyes",
                29,
                "09451234567",
                "Baguio City",
                "Benguet"
        ));

        customers.add(new Customer(
                "CUS-005",
                "John Garcia",
                19,
                "09561234567",
                "Pozorrubio",
                "Pangasinan"
        ));
        //standard taxi
        taxis.add(new StandardTaxi(
                "TX-001",
                "Juan Dela Cruz",
                "ABC-1234",
                100,
                true
        ));

        taxis.add(new StandardTaxi(
                "TX-002",
                "Pedro Santos",
                "DEF-5678",
                100,
                true
        ));

        //premium taxi
        taxis.add(new PremiumTaxi(
                "TX-003",
                "Carlos Reyes",
                "GHI-9012",
                200,
                true
        ));

        taxis.add(new PremiumTaxi(
                "TX-004",
                "Mark Johnson",
                "JKL-3456",
                200,
                false
        ));

        //motorcycletaxi
        taxis.add(new MotorcycleTaxi(
                "TX-005",
                "Ramon Garcia",
                "MOT-1122",
                60,
                true
        ));

        taxis.add(new MotorcycleTaxi(
                "TX-006",
                "Kevin Tan",
                "MOT-3344",
                60,
                false
        ));

        FareCalculator specialFare = new FareCalculator() {
            @Override
            public double calculate(double distance) {
                return distance * 30;
            }
        };

//        displayAllTaxi(taxis);
//        addTaxi(taxis, scanner);
//        displayAllTaxi(taxis);
//        updateTaxi(taxis, scanner);
        displayAllTaxi(taxis);
        deleteTaxi(taxis, scanner);
        displayAllTaxi(taxis);
    }

    //display all Customer
    public static void displayCustomers(List<Customer> customers) {
        System.out.println("==== Customers ====");
        System.out.println();
        for (int i = 0; i < customers.size(); i++) {
            System.out.println((i + 1) + ".");
            customers.get(i).displayProfile();
        }
    }

    //select Taxi
    public static int select(List<Taxi> taxis, Scanner scanner) {
        System.out.println("Choose Taxi");
        int selected = scanner.nextInt() - 1;
        scanner.nextLine();

        if (selected < 0 || selected >= taxis.size()) {
            System.out.println("Taxi Not Found.❌");
            return -1;
        }
        return selected;
    }

    //add taxi
    public static void addTaxi(List<Taxi> taxis, Scanner scanner) {
        System.out.println("==== Add Taxi ====");
        System.out.println();
        System.out.println("Enter Taxi Id: ");
        String addTaxiId = scanner.nextLine();
        System.out.println("Enter Driver's Name: ");
        String addDriverName = scanner.nextLine();
        System.out.println("Enter Plate Number: ");
        String addPlateNumber = scanner.nextLine();
        System.out.println("Enter Base Fare: ");
        double addBaseFare = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Enter Vehicle Type: (Standard, Premium, Motorcycle");
        String addVehicleType = scanner.nextLine();

        switch (addVehicleType) {
            case "Standard":
                taxis.add(new StandardTaxi(addTaxiId, addDriverName, addPlateNumber, addBaseFare, true));
                break;
            case "Premium":
                taxis.add(new PremiumTaxi(addTaxiId, addDriverName, addPlateNumber, addBaseFare, true));
                break;
            case "Motorcycle":
                taxis.add(new MotorcycleTaxi(addTaxiId, addDriverName, addPlateNumber, addBaseFare, true));
            default:
                System.out.println("Invalid Vehicle Type.❌");
                break;
        }
        System.out.println("Successfully Added New Taxi.✅");

    }

    //read taxi
    public static void displayAllTaxi(List<Taxi> taxis) {
        System.out.println("==== All Taxis ====");
        System.out.println();
        for (int i = 0; i < taxis.size(); i++) {
            System.out.println((i + 1) + ". ");
            taxis.get(i).displayTaxiInfo();
            System.out.println();
        }
    }

    //update
    public static void updateTaxi(List<Taxi> taxis, Scanner scanner) {
        System.out.println("==== Update Taxi ====");
        int chosenTaxi = select(taxis, scanner);
        System.out.println();
        for (int i = 0; i < taxis.size(); i++) {
            if (i == chosenTaxi) {
                System.out.println("Update Taxi Id: ");
                String updateTaxiId = scanner.nextLine();
                System.out.println("Update Driver's Name: ");
                String updateDriverName = scanner.nextLine();
                System.out.println("Update Plate Number: ");
                String updatePlateNumber = scanner.nextLine();
                System.out.println("Update Base Fare: ");
                double updateBaseFare = scanner.nextDouble();
                scanner.nextLine();
                System.out.println("update Vehicle Type: (Standard, Premium, Motorcycle");
                String updateVehicleType = scanner.nextLine();

                switch (updateVehicleType) {
                    case "Standard":
                        taxis.set(i, new StandardTaxi(updateTaxiId, updateDriverName, updatePlateNumber, updateBaseFare, true));
                        break;
                    case "Premium":
                        taxis.set(i, new PremiumTaxi(updateTaxiId, updateDriverName, updatePlateNumber, updateBaseFare, true));
                        break;
                    case "Motorcycle":
                        taxis.set(i, new MotorcycleTaxi(updateTaxiId, updateDriverName, updatePlateNumber, updateBaseFare, true));
                    default:
                        System.out.println("Invalid Vehicle Type.❌");
                        break;
                }
                System.out.println("Successfully Updated Taxi.✅");
            }
        }

    }

    //delete
    public static void deleteTaxi(List<Taxi> taxis, Scanner scanner) {
        System.out.println("==== Delete Taxi ====");
        int chosenTaxi = select(taxis, scanner);
        System.out.println();
        for (int i = 0; i < taxis.size(); i++) {
            if (i == chosenTaxi) {
                System.out.println(taxis.get(i).getTaxiId() + " has been deleted.✅");
                taxis.remove(i);
            }
        }
        System.out.println("Successfully deleted.✅ ");
    }

    //book taxi
    public static BookingRecord bookTaxi(Customer customer, List<Taxi> taxis, Scanner scanner, String destination, double distance) {
        LocalDate today = LocalDate.now();
        System.out.println("==== Book Taxi ====");
        System.out.println();
        int chosenTaxi = select(taxis, scanner);
        scanner.nextLine();

        for (int i = 0; i < taxis.size(); i++) {
            if (i == chosenTaxi) {
                taxis.get(i).book();
            }
        }

        return new BookingRecord(customer.getName(), taxis.get(chosenTaxi).getTaxiId(),
                taxis.get(chosenTaxi).getDriverName(), customer.getAddress().getCity(),
                destination, distance, taxis.get(chosenTaxi).getBaseFare(), today, taxis.get(chosenTaxi).isAvailable());
    }


}
