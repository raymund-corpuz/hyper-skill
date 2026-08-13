package com.bank.people;

public class Customer extends People {
    private String customerId;
    private String phoneNumber;
    private Address address;

    public Customer(String customerId, String name, int age, String phoneNumber, String city, String province) {
        super(name, age);
        this.customerId = customerId;
        this.phoneNumber = phoneNumber;
        this.address = new Address(city, province);

    }

    @Override
    public void displayProfile() {
        System.out.println("Customer Id: " + customerId);
        super.displayProfile();
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("City: " + address.city);
        System.out.println("Province: " + address.province);

    }

    //InnerClass
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

        //getters  & setters

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
}
