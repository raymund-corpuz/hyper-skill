package org.shopping.app;

import org.shopping.people.Customer;
import org.shopping.product.Clothing;
import org.shopping.product.Laptop;
import org.shopping.product.Product;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Customer[] customers = new Customer[3];
        Product[] products = new Product[6];

        customers[0] = new Customer("Raymund", 31, "08/31/2026");
        customers[1] = new Customer("Alice", 24, "08/21/2026");
        customers[2] = new Customer("Michael", 45, "09/21/2026");

        products[0] = new Laptop(
                "Dell Inspiron 15",
                45000,
                "Dell",
                2 // 2-year warranty
        );

        products[1] = new Laptop(
                "MacBook Air M4",
                75000,
                "Apple",
                1 // 1-year warranty
        );

        products[2] = new Clothing(
                "Plain T-Shirt",
                500,
                "Medium",
                "Black"
        );

        products[3] = new Clothing(
                "Denim Jacket",
                2000,
                "Large",
                "Blue"
        );

        products[4] = new Clothing(
                "Hoodie",
                1500,
                "XL",
                "Gray"
        );

        products[5] = new Clothing(
                "Polo Shirt",
                850,
                "Large",
                "White"
        );

        displayCustomers(customers);

    }

    public static void displayCustomers(Customer[] customers) {
        System.out.println("==== CUSTOMERS =====");
        System.out.println();
        for (Customer customer : customers) {
            System.out.println(customer.getName());
        }
    }
}
