package org.simple.hotel.model;

import org.simple.hotel.interfaces.Displayable;

public class Employee extends Person implements Displayable {
    private String position;
    private double salary;

    public Employee(String id, String name, String email, String phone, String position, double salary) {
        super(id, name, email, phone);
        this.position = position;
        this.salary = salary;
    }

    @Override

    public void displayInfo() {
        System.out.println();
        System.out.println("ID: " + getId());
        System.out.println("Name: " + getName());
        System.out.println("Email: " + getEmail());
        System.out.println("Phone: " + getPhone());

    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
