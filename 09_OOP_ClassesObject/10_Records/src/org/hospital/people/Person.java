package org.hospital.people;

public class Person {
    protected String name;
    protected int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    String displayProfile() {
        return "Name: " + name +
                "\nAge: " + age;
    }
}
