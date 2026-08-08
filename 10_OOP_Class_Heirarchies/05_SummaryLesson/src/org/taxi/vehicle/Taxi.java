package org.taxi.vehicle;

public abstract class Taxi {
    protected String taxiId;
    protected String driverName;
    protected String plateNumber;
    protected double baseFare;
    protected boolean available;

    public Taxi(String taxiId, String driverName, String plateNumber, double baseFare, boolean available) {
        this.taxiId = taxiId;
        this.driverName = driverName;
        this.plateNumber = plateNumber;
        this.baseFare = baseFare;
        this.available = available;
    }

    public class Driver {
        private String licenseNumber;
        private int experienceYears;

        public void displayDriverInfo() {
            System.out.println("==== Driver's Info ====");
            System.out.println();
            System.out.println("Driver: " + driverName);
            System.out.println("License Number: " + licenseNumber);
            System.out.println("Years of experience: " + experienceYears);
        }
    }

    abstract double calculateFare(double distance);

    public void displayTaxiInfo() {
        System.out.println("Taxi ID: " + taxiId);
        System.out.println("Driver's Name: " + driverName);
        System.out.println("Plate Number: " + plateNumber);
        System.out.println("Base Fare: " + baseFare);
        System.out.println("Available: " + available);
    }

    public void book() {
        if (!available) {
            System.out.println("==== Book Info ====");
            System.out.println();
            System.out.println(driverName + " is already booked.");
        }
    }

    public void release() {
        if (available) {
            System.out.println("==== Release Info ====");
            System.out.println();
            System.out.println(driverName + " is release.");
        }
    }

    public String getTaxiId() {
        return taxiId;
    }

    public void setTaxiId(String taxiId) {
        this.taxiId = taxiId;
    }

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    public double getBaseFare() {
        return baseFare;
    }

    public void setBaseFare(double baseFare) {
        this.baseFare = baseFare;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
}
