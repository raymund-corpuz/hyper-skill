package org.hospital.record;

public record AppointmentRecord(String doctorName, String patientName, String appointmentDate, String appointmentTime) {
}
