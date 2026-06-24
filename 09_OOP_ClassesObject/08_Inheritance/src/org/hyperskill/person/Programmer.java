package org.hyperskill.person;

public class Programmer extends Employee {
    protected String programmingLanguage;

    protected Programmer(String name, int age, String department, double salary, String programmingLanguage) {
        super(name, age, department, salary);
        this.programmingLanguage = programmingLanguage;
    }

    String writeCode() {
        return "I am writing code using " + this.programmingLanguage;
    }
}
