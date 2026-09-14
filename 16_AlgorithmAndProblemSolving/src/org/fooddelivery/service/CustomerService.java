package org.fooddelivery.service;

import org.fooddelivery.exception.CustomerNotFoundException;
import org.fooddelivery.model.Customer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CustomerService {
    private List<Customer> customers;
    private Map<String, Customer> customerMap;

    public CustomerService() {
        this.customers = new ArrayList<>();
        this.customerMap = new HashMap<>();

    }

    public void addCustomer(Customer customer) {
        customers.add(customer);

        customerMap.put(customer.getId(), customer);
    }

    public void removeCustomer(String id) throws CustomerNotFoundException {
        Customer customer = findCustomer(id);

        customers.remove(customer);
        customerMap.remove(id);
    }

    public Customer findCustomer(String id) {
        Customer customer = customerMap.get(id);
        if (id == null) {
            throw new CustomerNotFoundException("Customer Not Found: " + id);
        }
        return customer;
    }

    public List<Customer> getCustomers() {
        return customers;
    }

    public void displayCustomers() {
        if (customers.isEmpty()) {
            System.out.println("No customer found.❌");
            return;
        }

        for (Customer customer : customers) {
            System.out.println(customer.getId() + " | " + customer.getName() + " | " + customer.getPhone());
        }
    }

}
