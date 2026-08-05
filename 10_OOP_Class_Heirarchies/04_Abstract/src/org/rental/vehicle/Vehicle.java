package org.rental.vehicle;

public abstract class Vehicle {
    protected String vehicleId;
    protected String brand;
    protected String model;
    protected double dailyRate;
    protected boolean available;

    public Vehicle(String vehicleId, String brand, String model, double dailyRate, boolean available) {
        this.vehicleId = vehicleId;
        this.brand = brand;
        this.model = model;
        this.dailyRate = dailyRate;
        this.available = available;
    }

    abstract double calculateRentalCost(int days);
}
