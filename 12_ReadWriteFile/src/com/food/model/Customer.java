package com.food.model;

public class Customer {
    private String id;
    private String name;
    private String phone;
    private Address address;

    public Customer(String id, String name, String phone, String city, String province) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.address = new Address(city, province);

    }

    public class Address {
        private String city;
        private String province;

        public Address(String city, String province) {
            this.city = city;
            this.province = province;
        }
    }

    public void displayProfile() {
        System.out.println("Customer ID: " + id);
        System.out.println("Customer Name : " + name);
        System.out.println("Phone: " + phone);
        System.out.println("Address: " + address.city + ", " + address.province);
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public Address getAddress() {
        return address;
    }
}
