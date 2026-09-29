package org.simple_solution.hotel.model;

public class Employee extends Person {

    private String position;
    private double salary;

    public Employee(int id, String name, String email, String phone, String position, double salary) {
        super(id, name, email, phone);
        this.position = position;
        this.salary = salary;
    }

    @Override
    public void displayInfo() {
        System.out.println("--------------------------------");
        System.out.println("Employee ID: " + getId());
        System.out.println("Name: " + getName());
        System.out.println("Email: " + getEmail());
        System.out.println("Phone: " + getPhone());
        System.out.println("Position: " + position);
        System.out.println("Salary: " + salary);
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

    @Override
    public String toString() {
        return getId() + "|" + getName() + "|" + getPosition();
    }
}
