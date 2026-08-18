package org.food.people;

public class Customer extends Person {
    private String customerId;
    private String phoneNumber;
    private Address address;

    public Customer(String customerId, String name, int age, String phoneNumber, String city, String province) {
        super(name, age);
        this.customerId = customerId;
        this.phoneNumber = phoneNumber;
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

    public void displayCustomerInfo() {
        System.out.println("Customer ID: " + customerId);
        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("Phone: " + phoneNumber);
        System.out.println("City: " + address.city);
        System.out.println("Province: " + address.province);

    }


    //Getter & Setter
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

