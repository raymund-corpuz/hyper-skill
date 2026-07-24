package org.shopping.app;

import org.shopping.people.Customer;
import org.shopping.product.Clothing;
import org.shopping.product.Laptop;
import org.shopping.product.Product;
import org.shopping.record.OrderRecord;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LocalDate today = LocalDate.now();
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

        OrderRecord record = null;

        displayCustomers(customers);
        displayAllProducts(products);

    }

    public static void displayCustomers(Customer[] customers) {
        System.out.println("==== CUSTOMERS =====");
        System.out.println();
        for (int i = 0; i < customers.length; i++) {
            System.out.println((i + 1) + ". " + customers[i].getName());
        }
        System.out.println();
    }

    public static Customer selectCustomer(Scanner scanner, Customer[] customers) {
        System.out.print("Choose Customer: ");
        int selected = scanner.nextInt() - 1;
        System.out.println();
        System.out.println("Welcome, " + customers[selected].getName() + "!");
        System.out.println();
        if (selected < 0 || selected >= customers.length) {
            System.out.println("Selected Customer Not Found ❌");
            return null;
        }
        return customers[selected];
    }

    public static void displayAllProducts(Product[] products) {
        System.out.println("==== PRODUCTS ====");
        System.out.println();

        for (int i = 0; i < products.length; i++) {
            System.out.println((i + 1) + ".");
            System.out.println(products[i].displayProduct());
            System.out.println();
        }
    }

    public static Product selectProduct(Scanner scanner, Product[] products) {
        System.out.print("Choose Product: ");
        int choice = scanner.nextInt() - 1;
        if (choice < 0 || choice >= products.length) {
            System.out.println("Product Not Found ❌");
            return null;
        }
        return products[choice];
    }

    public static int productQuantity(Scanner scanner, Product[] products) {
        System.out.print("Enter Quantity: ");
        int qty = scanner.nextInt();

        if (qty <= 0) {
            System.out.println("Minimum Qty: 1");
            return -1;
        }
        return qty;
    }

    public static void displayMenu() {
        System.out.println("==== SHOPPING MENU ====");
        System.out.println();
        System.out.println("1- Display Product Information");
        System.out.println("2- Buy Product");
        System.out.println("3- View Order Receipt");
        System.out.println("4- Exit");
        System.out.println();
    }

    public static void displayProductInfo(Product products) {
        System.out.println("==== PRODUCT DETAILS ====");
        System.out.println();
        System.out.println("Product Name : " + products.getProductName());
        System.out.println("Category     : " + products.getClass().getSimpleName());
        System.out.println("Price        : " + products.getPrice());
        System.out.println();
    }

    public static OrderRecord buyProduct(Customer customer, Product product, int qty, LocalDate today) {

        System.out.println("Processing Order....");
        System.out.println();
        System.out.println("Quantity : " + qty);
        System.out.println();
        System.out.println("Discount Applied: 10%");
        System.out.println();
        System.out.println("Order Successful ✅");
        System.out.println();
        double totalPrice = product.calculatePrice(qty, product.getPrice());
        System.out.println("Total Amount: $" + totalPrice);

        return new OrderRecord(customer.getName(), product.getProductName(), qty, totalPrice, today);
    }

    public static void viewOrderReceipt(OrderRecord record) {
        System.out.println("==== ORDER RECEIPT ====");
        System.out.println();
        System.out.println("Customer: " + record.customerName());
        System.out.println("Product: " + record.productName());
        System.out.println("Quantity: " + record.quantity());
        System.out.println("Total: " + record.totalPrice());
        System.out.println("Order date: " + record.orderDate());
        System.out.println();
        System.out.println("Thank you for shopping!");
    }
}
