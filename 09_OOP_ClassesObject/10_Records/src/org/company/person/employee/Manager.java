package org.company.person.employee;

public class Manager extends Employee {
    protected int teamSize;


    public Manager(String name, int age, String department, double salary, int teamSize) {
        super(name, age, department, salary);
        this.teamSize = teamSize;
    }

    @Override
    public String displayProfile() {
        return super.displayProfile() +
                "\nPosition: " + "Manager" +
                "\nTeamSize: " + teamSize;
    }
}
