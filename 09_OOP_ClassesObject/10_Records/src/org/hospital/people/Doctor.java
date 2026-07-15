package org.hospital.people;

public class Doctor extends Person {
    protected String speacilization;
    protected boolean available;

    public Doctor(String name, int age, String speacilization, boolean available) {
        super(name, age);
        this.speacilization = speacilization;
        this.available = available;
    }

    @Override
    public String displayProfile() {
        return "Name: " + name +
                "\nAge: " + age +
                "\nSpecialization: " + speacilization +
                "\nAvailability: " + (available ? "Available" : "Not Available");
    }


    public boolean isAvailable() {
        return available;
    }
}
