package org.rental.vehicle;

import org.rental.interfaces.Rentable;

public abstract class Vehicle implements Rentable {
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

    public String getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(String vehicleId) {
        this.vehicleId = vehicleId;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getDailyRate() {
        return dailyRate;
    }

    public void setDailyRate(double dailyRate) {
        this.dailyRate = dailyRate;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    //    @Override
//    public void rent() {
//
//    }
//
//    @Override
//    public void returnVehicle() {
//
//    }


    abstract double calculateRentalCost(int days);
}
