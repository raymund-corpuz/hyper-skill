package org.company.person.employee;

import org.company.person.Person;

import javax.print.attribute.standard.PDLOverrideSupported;

public class Employee extends Person {
    protected String department;
    protected double salary;

    public Employee(String name, int age, String department, double salary) {
        super(name, age);
        this.department = department;
        this.salary = salary;
    }

    @Override
    public String displayProfile() {
        return super.displayProfile() +
                "\nDepartment: " + department;
    }

    public double getSalary() {
        return salary;
    }

    public String getDepartment() {
        return department;
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public int getAge() {
        return super.getAge();
    }

    public void performJob() {
        System.out.println("Employee performing a job. 💼");
    }
}
