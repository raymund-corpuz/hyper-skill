package org.rental.customer;

public class Customer {
    private String name;
    private int age;
    private boolean license;

    public Customer(String name, int age, boolean license) {
        this.name = name;
        this.age = age;
        this.license = license;
    }

    void displayProfile() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Licence: " + (license ? "Driver's Licence" : "No Driver's License"));
    }

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

    public boolean isLicense() {
        return license;
    }

    public void setLicense(boolean license) {
        this.license = license;
    }
}
