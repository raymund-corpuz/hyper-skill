package org.shopping.people;

public class Customer extends People {
    protected String orderDate;

    public Customer(String name, int age, String orderDate) {
        super(name, age);
        this.orderDate = orderDate;
    }

    @Override
    public String displayProfile() {
        return super.displayProfile() +
                "\nOrder Date: " + orderDate;
    }

    public String getOrderDate() {
        return orderDate;
    }
}
