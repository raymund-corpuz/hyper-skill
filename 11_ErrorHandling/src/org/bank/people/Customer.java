package org.bank.people;

public class Customer extends Person {
    private String customerId;
    private String phoneNumber;
    private final Address address;

    public Customer(String customerId, String name, int age, String phoneNumber, String city, String province) {
        super(name, age);
        this.customerId = customerId;
        this.phoneNumber = phoneNumber;
        this.address = new Address(city, province);
    }

    // INNER CLASS
    public class Address {
        private String city;
        private String province;

        public Address(String city, String province) {
            this.city = city;
            this.province = province;
        }

        public void displayAddress() {
            System.out.println("City: " + city);
            System.out.println("Province: " + province);
        }

        //GETTERS & SETTERS

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public String getProvince() {
            return province;
        }

        public void setProvince(String province) {
            this.province = province;
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

    public Address getAddress() {
        return address;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
