package org.hyperskill.school.people;

public class Person {
    protected String name;
    protected int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String displayInfo() {
        return "Name: " + name +
                "\nAge: " + age;
    }
}
