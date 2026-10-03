package org.simple_hop.hotel.model;

import org.simple_hop.hotel.interfaces.Displayable;

public class Employee extends Person implements Displayable {
    private String position;
    private double salary;

    public Employee(int id, String name, String email, String phone, String position, double salary) {
        super(id, name, email, phone);
        this.position = position;
        this.salary = salary;
    }

    @Override
    public void displayInfo() {
        System.out.println();
        System.out.println("==== Employee Information ====");
        System.out.println("ID: " + getId());
        System.out.println("Name: " + getName());
        System.out.println("Email: " + getEmail());
        System.out.println("Phone: " + getPhone());
        System.out.println("Position: " + position);
        System.out.println("Salary: " + salary);
        System.out.println("------------------------------------------");
    }
}
