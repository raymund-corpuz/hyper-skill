package org.taxi.people;

public class Customer extends Person {
    private String customerId;
    private String phoneNumber;

    public Customer(String customerId, String name, int age, String phoneNumber) {
        super(name, age);
        this.customerId = customerId;
        this.phoneNumber = phoneNumber;
    }

    public class Address {
        private String city;
        private String province;

        public void displayAddress() {
            System.out.println("==== Address Info ====");
            System.out.println("Customer: " + name);
            System.out.println();
            System.out.println("Address: " + city + ", " + province);
        }

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
