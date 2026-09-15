package org.fooddelivery.service;


import org.fooddelivery.model.Customer;
import org.fooddelivery.model.Order;
import org.fooddelivery.model.Restaurant;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileService {

    public void saveCustomer(List<Customer> customers) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter("data/customers.txt"));

        for (Customer customer : customers) {
            writer.write(customer.getId() + "|" + customer.getName() + "|"
                    + customer.getPhone() + "|" + customer.getEmail() + "|" + customer.getAddress());
            writer.newLine();
        }
        writer.close();
    }

    public List<Customer> localCustomers() throws IOException {
        List<Customer> customers = new ArrayList<>();

        BufferedReader reader = new BufferedReader(new FileReader("data/customers.txt"));

        String line;

        while ((line = reader.readLine()) != null) {
            if (line.isBlank()) {
                continue;
            }
            String[] parts = line.split("\\|");

            if (parts.length < 5) {
                continue;
            }
            Customer customer = new Customer(parts[0], parts[1], parts[2], parts[3], parts[4]);
            customers.add(customer);
        }
        reader.close();
        return customers;
    }

    public void saveRestaurants(List<Restaurant> restaurants) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter("data/restaurant.txt"));

        for (Restaurant restaurant : restaurants) {
            writer.write(restaurant.getRestaurantId() + "|"
                    + restaurant.getRestaurantName() + "|"
                    + restaurant.getAddress() + "|"
                    + restaurant.getRating());
            writer.newLine();
        }
        writer.close();
    }


}
