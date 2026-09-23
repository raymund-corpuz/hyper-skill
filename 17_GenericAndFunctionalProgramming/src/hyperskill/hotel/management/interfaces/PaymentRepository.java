package hyperskill.hotel.management.interfaces;

import hyperskill.hotel.management.model.Payment;

import java.util.List;
import java.util.Optional;

public interface PaymentRepository extends Repository<Payment, String> {

    Optional<Payment> findByBookingId(String bookingId);

    List<Payment> findByStatus(String status);

}
