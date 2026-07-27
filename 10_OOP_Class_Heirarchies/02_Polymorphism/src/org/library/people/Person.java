package org.library.people;

public class Person {
    protected String name;
    protected int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayProfile() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    //Getters

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    //Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
