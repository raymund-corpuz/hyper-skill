package org.hyperskill.person;

public class Manager extends Employee {
    protected int teamSize;

    protected Manager(String name, int age, String department, double salary, int teamSize) {
        super(name, age, department, salary);
        this.teamSize = teamSize;

    }

    String approveProject() {
        return "The project is approved✅ with a team size of " + this.teamSize;
    }
}
