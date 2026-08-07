package org.taxi.people;

public class Customer extends Person {
    private String customerId;
    private String phoneNumber;

    public Customer(String name, int age, String customerId, String phoneNumber) {
        super(name, age);
        this.customerId = customerId;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void displayProfile() {
        super.displayProfile();
        System.out.println("Customer ID: " + customerId);
        System.out.println("Phone Number: " + phoneNumber);
    }

    public String getCustomerId() {
        return customerId;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;

    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
