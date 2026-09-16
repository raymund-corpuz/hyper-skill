package org.hotel.model;

public class Guest extends Person {
    private String email;

    public Guest(String id, String name, String phone, String email) {
        super(id, name, phone);
        this.email = email;
    }

    @Override
    public void displayProfile() {
        System.out.println(getId() + " | " + getName() + " | " + getPhone() + " | " + email);
    }
}
