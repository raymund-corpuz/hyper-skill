package org.rental.vehicle;

import org.rental.interfaces.Rentable;

public class Motorcycle extends Vehicle implements Rentable {
    private int days;
    private double discount = 0.10;


    public Motorcycle(String vehicleId, String brand, String model, double dailyRate, boolean available, int days) {
        super(vehicleId, brand, model, dailyRate, available);
        this.days = days;

    }


    @Override
    double calculateRentalCost(int days) {
        return dailyRate * days - discount;
    }


    @Override
    public void rent() {
        if (!available) {
            System.out.println("Motorcycle is not available. ❌");
            return;
        }

        available = false;
        System.out.println("Successfully Rented Motorcycle. ✅");
    }

    @Override
    public void returnVehicle() {
        if (available) {
            System.out.println("This Motorcycle is already Returned. ❌");
            return;
        }
        available = true;
        System.out.println("Motorcycle Successfully Returned. ✅");
    }
}
