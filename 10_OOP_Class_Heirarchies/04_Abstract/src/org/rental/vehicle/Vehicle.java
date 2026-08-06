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

    public void displayInfo() {
        System.out.println("Vehicle Id: " + vehicleId);
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Daily Rate: " + dailyRate);
        System.out.println("Available: " + (available ? "Available ✅" : "Not Available ❌"));
    }

    abstract double calculateRentalCost(int days);
}
