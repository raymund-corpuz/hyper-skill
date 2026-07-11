package org.fleet.vehicle.car;

import org.fleet.vehicle.Vehicle;

public class Car extends Vehicle {
    protected int seats;
    protected String fuelType;

    public Car(String brand, String model, boolean available, int seats, String fuelType){
        super(brand, model, available);
        this.seats = seats;
        this.fuelType = fuelType;
    }

    @Override
    public String displayInfo(){
        return "Brand: " + brand +
                "\nModel: " + model +
                "\nAvailability: " + (available ? "Available" : "Rented") +
                "\nSeats: " + seats +
                "\nFuel Type: " + fuelType;
    }

    public String startEngine(){
        return brand + " - " + model + " the engine is started 🚗 ....";
    }
}
