package org.hyperskill.person;

public class Employee extends Person {
    protected String department;
    protected double salary;

    protected Employee(String name, int age, String department, double salary) {
        super(name, age);
        this.department = department;
        this.salary = salary;
    }

    String displayInfo() {
        return "My Name is " + this.name + ". I am " + this.age + " years old." + " I work at " + this.department;
    }
}
