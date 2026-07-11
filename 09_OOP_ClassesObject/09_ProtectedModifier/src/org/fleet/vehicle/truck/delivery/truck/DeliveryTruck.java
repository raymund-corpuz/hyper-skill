package org.fleet.vehicle.truck.delivery.truck;

import org.fleet.vehicle.truck.Truck;

public class DeliveryTruck extends Truck {
    protected String assignedRoutes;

    public DeliveryTruck(String brand, String model, boolean available, double maxLoad, int wheels, String assignedRoutes) {
        super(brand, model, available, maxLoad, wheels);
        this.assignedRoutes = assignedRoutes;

    }

    @Override
    public String displayInfo() {
        return "Brand: " + brand +
                "\nModel: " + model +
                "\nAvailability: " + (available ? "Available" : "Rented") +
                "\nMax Load: " + maxLoad +
                "\nWheels: " + wheels +
                "\nAssign Route: " + assignedRoutes;
    }

    public String deliveryPackage() {
        return "The delivery truck is now delivering the package 📦...";
    }
}
