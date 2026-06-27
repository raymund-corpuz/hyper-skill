package org.hyperskill.message;

public abstract class Person {
    protected String name;
    protected int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    protected String getName() {
        return name;
    }

    protected int getAge() {
        return age;
    }

    //Display basic Information
    public String displayProfile() {
        return "Name: " + this.name + "\nAge: " + this.age;
    }


}
