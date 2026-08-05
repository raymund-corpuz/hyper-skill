package org.rental.vehicle;

import org.rental.interfaces.Rentable;

public class Van extends Vehicle implements Rentable {
    private int days;
    private double insurance = 10_000;

    public Van(String vehicleId, String brand, String model, double dailyRate, boolean available, int days) {
        super(vehicleId, brand, model, dailyRate, available);
        this.days = days;

    }


    @Override
    double calculateRentalCost(int days) {
        return dailyRate * days + insurance;
    }

    @Override
    public void rent() {
        if (!available) {
            System.out.println("Van is not available. ❌");
            return;
        }

        available = false;
        System.out.println("Successfully Rented the Van. ✅");
    }

    @Override
    public void returnVehicle() {
        if (available) {
            System.out.println("Van Already Returned. ❌");
            return;
        }
        available = true;
        System.out.println("Van Successfully Returned. ✅");
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public double getInsurance() {
        return insurance;
    }

    public void setInsurance(double insurance) {
        this.insurance = insurance;
    }
}
