package org.hyperskill.school.people;

public class Adviser extends Person {
    protected String advisorySection;

    public Adviser(String name, int age, String advisorySection) {
        super(name, age);
        this.advisorySection = advisorySection;
    }

    @Override
    public String displayInfo() {
        return "Name: " + name +
                "\nAge: " + age +
                "\nAdvisory Section: " + advisorySection;
    }

    public String assignSection(String section) {
        return "I am " + name + ". I am assign to section " + section;
    }
}
