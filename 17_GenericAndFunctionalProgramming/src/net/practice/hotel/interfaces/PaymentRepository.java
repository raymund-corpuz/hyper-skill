package net.practice.hotel.interfaces;

import hyperskill.hotel.management.model.Payment;

import java.util.List;

public interface PaymentRepository extends Repository<Payment, String> {

    List<Payment> findBooking(String bookingId);

    List<Payment> findByStatus(String status);
}
