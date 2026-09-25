package hyperskill.hotel.management.service;

import hyperskill.hotel.management.interfaces.GuestRepository;
import hyperskill.hotel.management.model.Guest;

public class GuestService {

    private final GuestRepository repository;

    public GuestService(GuestRepository repository) {
        this.repository = repository;
    }

    public void registerGuest(Guest guest) {
        repository.save(guest);
    }
}
