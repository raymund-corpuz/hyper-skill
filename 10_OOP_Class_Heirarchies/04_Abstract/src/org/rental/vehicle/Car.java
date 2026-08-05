package org.rental.vehicle;

import org.rental.interfaces.Rentable;

public class Car extends Vehicle implements Rentable {
    private int days;

    public Car(String vehicleId, String brand, String model, double dailyRate, boolean available, int days) {
        super(vehicleId, brand, model, dailyRate, available);
        this.days = days;
    }

    @Override
    public void rent() {
        if (!available) {
            System.out.println("This Car is not Available. ❌");
            return;
        }
        available = false;
        System.out.println("Successfully Rent the Car. ✅");
    }

    @Override
    public void returnVehicle() {
        if (available) {
            System.out.println("This Car is already Returned. ❌");
            return;
        }
        available = true;
        System.out.println("Car Successfully Returned. ✅");

    }

    @Override
    double calculateRentalCost(int days) {
        return dailyRate * days;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }
}
