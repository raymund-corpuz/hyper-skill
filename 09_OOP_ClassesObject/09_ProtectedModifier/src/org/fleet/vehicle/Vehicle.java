package org.fleet.vehicle;

public class Vehicle {
    protected String brand;
    protected String model;
    protected boolean available;

    public Vehicle(String brand, String model, boolean available) {
        this.brand = brand;
        this.model = model;
        this.available = available;
    }

    public String displayInfo() {
        return "Brand: " + brand +
                "\nModel: " + model +
                "\nAvailability: " + (available ? "Available" : "Rented");
    }

    public String rentVehicle() {
        this.available = false;
        return brand + " - " + model + " Rent Successfully ✅";
    }

    public String returnVehicle() {
        this.available = true;
        return brand + " - " + model + " is Returned ✅";
    }
}
