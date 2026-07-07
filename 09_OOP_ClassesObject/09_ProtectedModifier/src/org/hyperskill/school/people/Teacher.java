package org.hyperskill.school.people;

public class Teacher extends Person {
    protected String subjects;
    protected double salary;

    public Teacher(String name, int age, String subjects, double salary) {
        super(name, age);
        this.subjects = subjects;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public String getSubjects() {
        return subjects;
    }

    @Override
    public String displayInfo() {
        return "Name: " + name +
                "\nAge: " + age +
                "\nSubject: " + subjects +
                "\nSalary " + salary;
    }

    public String teachLesson() {
        return "I am teacher " + name + ". I will be teaching " + subjects;
    }
}
