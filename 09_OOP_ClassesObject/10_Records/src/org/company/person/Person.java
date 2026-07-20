package org.company.person;

public abstract class Person {
    protected String name;
    protected int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String displayProfile() {
        return "Name: " + name +
                "\nAge: " + age;
    }


    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
