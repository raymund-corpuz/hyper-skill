package org.hospital.people;

public class Patient extends Person {
    protected String illness;
    protected int roomNumber;

    public Patient(String name, int age, String illness, int roomNumber) {
        super(name, age);
        this.illness = illness;
        this.roomNumber = roomNumber;
    }

    @Override
    public String displayProfile() {
        return "Name: " + name +
                "\nAge: " + age +
                "\nIllness: " + illness +
                "\nRoom Number: " + roomNumber;
    }

    public void requestAppointment() {
        return;
    }

}
