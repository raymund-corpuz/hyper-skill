package org.hyperskill.person;

public class Person {
    protected String name;
    protected int age;

    protected Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    String displayInfo() {
        return "My Name is " + this.name + ". I am " + this.age + " years old.";
    }
}
