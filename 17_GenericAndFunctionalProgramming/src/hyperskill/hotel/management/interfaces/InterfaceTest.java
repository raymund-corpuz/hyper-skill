package hyperskill.hotel.management.interfaces;

import hyperskill.hotel.management.model.Guest;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class InterfaceTest {

    public static void main(String[] args) {

        GuestRepository repository = new GuestRepository() {
            @Override
            public Optional<Guest> findByEmail(String email) {
                return Optional.empty();
            }

            @Override
            public List<Guest> findByName(String name) {
                return List.of();
            }

            private final List<Guest> guests = new ArrayList<>();

            @Override
            public void save(Guest guest) {
                guests.add(guest);

            }

            @Override
            public Optional<Guest> findById(String s) {

                for (Guest guest : guests) {
                    if (guest.getId().equalsIgnoreCase(s)) {
                        return Optional.of(guest);
                    }
                }
                return Optional.empty();
            }

            @Override
            public List<Guest> findAll() {
                if (guests.isEmpty()) {
                    System.out.println("No guests found.❌");
                }
                return guests;
            }

            @Override
            public void delete(String id) {
                guests.removeIf(guest -> guest.getId().equalsIgnoreCase(id));

            }

        };

        Guest guest1 = new Guest("1",
                "John",
                "Smith",
                "john@gmail.com",
                "09123456789",
                "Tarlac");

        repository.save(guest1);

        System.out.println("New Guest Added: ");
        System.out.println(repository.findAll());

        System.out.println("\nFind Guest: ");
        System.out.println(repository.findById("1"));

        repository.delete("1");

        System.out.println("\nAfter Delete: ");
        System.out.println(repository.findAll());

    }


}
