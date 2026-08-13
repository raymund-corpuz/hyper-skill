package com.bank.people;

public abstract class People {
    private String name;
    private int age;

    public People(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //displayProfile
    public void displayProfile() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    //getter & Setter

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
