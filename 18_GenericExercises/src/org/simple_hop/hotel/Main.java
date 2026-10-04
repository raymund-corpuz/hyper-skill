package org.simple_hop.hotel;

import org.simple_hop.hotel.service.BookingService;
import org.simple_hop.hotel.service.GuestService;
import org.simple_hop.hotel.service.RoomService;
import org.simple_solution.hotel.repository.BookingRepository;
import org.simple_solution.hotel.repository.GuestRepository;
import org.simple_solution.hotel.repository.RoomRepository;
import org.simple_solution.hotel.util.InputHelper;

public class Main {
    private final InputHelper inputHelper;

    private final GuestRepository guestRepository;
    private final RoomRepository roomRepository;
    private final BookingRepository bookingRepository;

    private final BookingService bookingService;
    private final GuestService guestService;
    private final RoomService roomService;

    private

    public static void main(String[] args) {

        Main application = new Main();

    }
}
