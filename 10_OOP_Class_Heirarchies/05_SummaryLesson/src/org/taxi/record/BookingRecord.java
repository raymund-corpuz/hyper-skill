package org.taxi.record;

import java.time.LocalDate;

public record BookingRecord(String customerName, String taxiId, String driverName, String pickupLocation,
                            String destination, double distance, double fare, LocalDate bookingDate, boolean status) {
}
