package org.hyperskill.person;

public class Client extends Person {
    protected String companyName;
    protected double projectBudget;

    protected Client(String name, int age, String companyName, double projectBudget) {
        super(name, age);
        this.companyName = companyName;
        this.projectBudget = projectBudget;
    }

    String displayInfo() {
        return this.companyName;

    }
}
