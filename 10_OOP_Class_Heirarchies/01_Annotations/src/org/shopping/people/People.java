package org.shopping.people;

public class People {
    protected String name;
    protected int age;

    public People(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String displayProfile() {
        return "Name: " + name +
                "\nAge: " + age;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
}
