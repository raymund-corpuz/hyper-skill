package org.fleet.vehicle.truck;

import org.fleet.vehicle.Vehicle;

public class Truck extends Vehicle {
    protected double maxLoad;
    protected int wheels;

    public Truck(String brand, String model, boolean available, double maxLoad, int wheels) {
        super(brand, model, available);
        this.maxLoad = maxLoad;
        this.wheels = wheels;
    }

    @Override
    public String displayInfo() {
        return "Brand: " + brand +
                "\nModel: " + model +
                "\nAvailability: " + (available ? "Available" : "Rented") +
                "\nMax Load: " + maxLoad +
                "\nWheels: " + wheels;
    }

    public String loadCargo() {
        return brand + " - " + model + " is Loaded 🚚...";
    }
}
