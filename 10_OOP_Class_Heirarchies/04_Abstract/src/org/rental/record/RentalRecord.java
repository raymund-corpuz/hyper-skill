package org.rental.record;

import java.time.LocalDate;

public record RentalRecord(String vehicleId, String brand, String model, LocalDate today) {
}
