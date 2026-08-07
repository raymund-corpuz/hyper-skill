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

    abstract double calculateFare(double distance);

    public void displayTaxiInfo() {
        System.out.println("Taxi ID: " + taxiId);
        System.out.println("Driver's Name: " + driverName);
        System.out.println("Plate Number: " + plateNumber);
        System.out.println();
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
