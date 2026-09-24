package hyperskill.hotel.management.generic;


import hyperskill.hotel.management.model.Booking;
import hyperskill.hotel.management.model.Guest;
import hyperskill.hotel.management.model.Room;
import hyperskill.hotel.management.model.enums.RoomStatus;
import hyperskill.hotel.management.model.enums.RoomType;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class GenericTest {

    public static void main(String[] args) {

        System.out.println("TEST 1 _GENERIC RESPONSE");
        System.out.println();

        Guest guest_1 = new Guest("G001", "Alice ", "Jackson", "alice@example.com", "09123456789", "Pozorrubio");
        Guest guest_2 = new Guest("G001", "George ", "Jackson", "alice@example.com", "09123456789", "Pozorrubio");
        Guest guest_3 = new Guest("G001", "Michael ", "Jackson", "alice@example.com", "09123456789", "Pozorrubio");

        GenericResponse<Guest> guestGenericResponse = new GenericResponse<>(true, "Guest fetched successfully", guest_1);

        System.out.println("Success: " + guestGenericResponse.isSuccess());
        System.out.println("Message: " + guestGenericResponse.getMessage());
        System.out.println("Data: " + guestGenericResponse.getData());

        System.out.println();
        System.out.println("TEST 2_GENERIC RESPONSE ROOM");


        Room room_1 = new Room("R001", RoomType.SINGLE, 1500, RoomStatus.RESERVE);

        GenericResponse<Room> roomGenericResponse = new GenericResponse<>(true, "Room fetched successfully", room_1);
        System.out.println("Success: " + roomGenericResponse.isSuccess());
        System.out.println("Message: " + roomGenericResponse.getMessage());
        System.out.println("Data: " + roomGenericResponse.getData());

        System.out.println();
        System.out.println("TEST 3_GENERIC RESPONSE BOOKING");

        Booking book1 = new Booking("B001", guest_1, room_1, LocalDate.now(), LocalDate.of(2026, 9, 25));

        GenericResponse<Booking> bookingGenericResponse = new GenericResponse<>(true, "Booking fetch successfully", book1);

        System.out.println("Success: " + bookingGenericResponse.isSuccess());
        System.out.println("Message: " + bookingGenericResponse.getMessage());
        System.out.println("Data: " + bookingGenericResponse.getData());
        System.out.println();

        System.out.println("TEST 4_LIST GENERIC GUEST");
        System.out.println();

        List<Guest> guestList = new ArrayList<>();

        guestList.add(guest_1);
        guestList.add(guest_2);
        guestList.add(guest_3);

        GenericResponse<List<Guest>> guestListGenericResponse = new GenericResponse<>(true, "List fetch successfully", guestList);

        System.out.println("Success: " + guestListGenericResponse.isSuccess());
        System.out.println("Message: " + guestListGenericResponse.getMessage());
        System.out.println("Data: ");
        for (Guest guest : guestListGenericResponse.getData()) {
            System.out.println(guest.toString());
        }

        for (Guest guest : guestList) {
            System.out.println(guest.getFirstName());
        }


    }
}
