package org.company.person.employee;

import org.company.person.Person;

import javax.print.attribute.standard.PDLOverrideSupported;

public class Employee extends Person {
    protected String department;
    protected double salary;

    public Employee(String name, int age, String department, double salary) {
        super(name, age);
        this.department = department;
    }

    @Override
    public String displayProfile() {
        return super.displayProfile() +
                "\nDepartment: " + department;
    }
}
