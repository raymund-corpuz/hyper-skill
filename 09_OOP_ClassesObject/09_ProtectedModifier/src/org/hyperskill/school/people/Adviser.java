package org.hyperskill.school.people;

public class Adviser extends Teacher {
    protected String advisorySection;

    public Adviser(String name, int age, String subject, double salary, String advisorySection) {
        super(name, age, subject, salary);
        this.advisorySection = advisorySection;
    }

    @Override
    public String displayInfo() {
        return "Name: " + name +
                "\nSubject: " + subjects +
                "\nAdvisory Section: (Adviser)";
    }

    public String assignSection(String section) {
        return "I am " + name + ". I am assign to section " + section;
    }
}
