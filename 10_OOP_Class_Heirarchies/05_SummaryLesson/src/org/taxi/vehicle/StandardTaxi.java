package org.taxi.vehicle;

public class StandardTaxi extends Taxi {

    public StandardTaxi(String taxiId, String driverName, String plateNumber, double baseFare, boolean available) {
        super(taxiId, driverName, plateNumber, baseFare, available);
    }

    @Override
    public double calculateFare(double distance) {
        return baseFare + distance * 50;
    }

}
