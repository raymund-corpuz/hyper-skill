package hyperskill.hotel.management.model;

import hyperskill.hotel.management.model.enums.PaymentStatus;
import hyperskill.hotel.management.model.enums.RoomStatus;
import hyperskill.hotel.management.model.enums.RoomType;

import java.time.LocalDate;
import java.time.LocalDateTime;


public class ModelTest {

    public static void main(String[] args) {
        //create guest
        Guest guest1 = new Guest("G001", "Raymund", "Corpuz", "ray@example.com", "09123456789", "Pozorrubio");

        Room room1 = new Room("R001", RoomType.SINGLE, 1500, RoomStatus.RESERVE);

        Booking booking1 = new Booking("B001", guest1, room1, LocalDate.now(), LocalDate.of(2026, 10, 31));

        Payment gcash = new Payment("P001", booking1.getBookingId(), room1.getPricePerNight(), PaymentStatus.PENDING, LocalDateTime.now());
        //print guest
        guest1.display();

        System.out.println();
        guest1.setEmail("raymund@example.com");
        System.out.println("Updated Email: " + guest1.getEmail());
        System.out.println();
        guest1.display();

        System.out.println("-------------------------------");
        System.out.println("Room");
        room1.display();
        System.out.println();
        room1.setStatus(RoomStatus.MAINTENANCE);
        room1.display();

        System.out.println("------------------------------");
        System.out.println("Booking");
        booking1.display();

        System.out.println();
        System.out.println("-------------------------------");
        System.out.println("Payment");
        gcash.display();


    }

}
