package org.hyperskill.person;

public class Programmer extends Employee {
    protected String programmingLanguage;

    protected Programmer(String name, int age, String department, double salary, String programmingLanguage) {
        super(name, age, department, salary);
        this.programmingLanguage = programmingLanguage;
    }

    void writeCode() {
        System.out.println("Writing " + programmingLanguage + " code...");
        System.out.println("Action Successful ✅");
    }
}
