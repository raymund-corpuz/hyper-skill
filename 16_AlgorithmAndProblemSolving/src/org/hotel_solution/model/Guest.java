package org.hotel_solution.model;


import org.hotel_solution.interfaces.Displayable;


public class Guest extends Person implements Displayable {
    private String email;

    public Guest(String id, String name, String phone, String email) {
        super(id, name, phone);
        this.email = email;
    }

    @Override
    public void displayProfile() {
        System.out.println("-----------------------------");
        System.out.println("Guest Id: " + getId());
        System.out.println("Guest Name: " + getName());
        System.out.println("Phone: " + getPhone());
        System.out.println("Email: " + email);
    }

    @Override
    public void display() {
        displayProfile();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {

        return getId()
                + " | "
                + getName()
                + " | "
                + getPhone()
                + " | "
                + email;
    }
}
