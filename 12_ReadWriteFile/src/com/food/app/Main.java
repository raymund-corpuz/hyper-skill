package com.food.app;

import com.food.model.CoffeeShop;
import com.food.model.FastFood;
import com.food.record.OrderRecord;
import com.food.model.Restaurant;
import com.food.model.Customer;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Customer> customers = new ArrayList<>();
        List<Restaurant> restaurants = new ArrayList<>();
        List<OrderRecord> orderRecords = new ArrayList<>();

        customers.add(new Customer("CUS-001", "Raymund", "09123456789", "Urdaneta City", "Pangasinan"));
        customers.add(new Customer("CUS-002", "Jenny", "091212345678", "Urdaneta City", "Pangasinan"));
        customers.add(new Customer("CUS-003", "Marco", "0998765321", "Urdaneta City", "Pangasinan"));

        restaurants.add(new CoffeeShop("RES-001", "Star Bucks", 120, "Regular"));
        restaurants.add(new FastFood("RES-002", "Jollibee", 150, "10 Minutes"));
        restaurants.add(new FastFood("RES-003", "McDo", 120, "8 Minutes"));
        restaurants.add(new CoffeeShop("RES-004", "Barako Coffee", 80, "Large"));

        displayMenu(customers, restaurants, orderRecords, scanner);

        scanner.close();
    }

    public static void displayMenu(List<Customer> customers, List<Restaurant> restaurants, List<OrderRecord> orderRecords, Scanner scanner) {
        System.out.println();
        System.out.println("===================================");
        System.out.println("            MAIN MENU");
        System.out.println("===================================");
        System.out.println();
        System.out.println("1 - Customer Management");
        System.out.println("2 - Restaurant Management");
        System.out.println("3 - Order Management");
        System.out.println("4 - Print Order");
        System.out.println("5 - Exit");

        boolean running = true;

        while (running) {
            int option = optionSelect(scanner);

            switch (option) {
                case 1:
                    System.out.println("==== Customer Management ====");
                    System.out.println("Empty List.❌");
                    break;
                case 2:
                    System.out.println("==== Restaurant Management ====");
                    System.out.println("Empty List.❌");
                    break;
                case 3:
                    orderManagement(customers, restaurants, orderRecords, scanner);
                    break;
                case 4:
                    System.out.println("Printing Order");
                    break;
                case 5:
                    running = false;
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid Option.❌");
            }
        }
    }

    public static int optionSelect(Scanner scanner) {
        System.out.println();
        System.out.println("Select Option: ");
        int option = scanner.nextInt();
        scanner.nextLine();

        return option;
    }

    public static void orderManagement(List<Customer> customers, List<Restaurant> restaurants, List<OrderRecord> orderRecords, Scanner scanner) {
        System.out.println();
        System.out.println("==== Order Management ====");
        System.out.println();
        OrderRecord record = null;

        int customer = optionSelect(scanner);
        customer--;
        if (customer < 0 || customer >= customers.size()) {
            System.out.println("Customer Not Found.❌");
            return;
        }
        Customer selectedCustomer = customers.get(customer);
        System.out.println("Customer : " + selectedCustomer.getName());
        System.out.println();
        for (int i = 0; i < restaurants.size(); i++) {
            System.out.println((i + 1) + ". " + restaurants.get(i).getRestaurantName() + " | " + restaurants.get(i).getDeliveryFee());
        }
        int restaurant = optionSelect(scanner);
        restaurant--;
        if (restaurant < 0 || restaurant >= restaurants.size()) {
            System.out.println("Restaurant Not Found.❌");
            return;
        }

        Restaurant selectedRestaurant = restaurants.get(restaurant);
        String id = String.valueOf(LocalDate.now());

        if (selectedRestaurant instanceof CoffeeShop) {
            System.out.print("Enter Food: ");
            String food = scanner.nextLine();
            record = new OrderRecord(id, selectedCustomer.getName(), selectedRestaurant.getRestaurantName(), food, selectedRestaurant.getDeliveryFee(), LocalDate.now());
            System.out.println("Successfully Place an Order.✅");
            orderRecords.add(record);
            return;
        }

        if (selectedRestaurant instanceof FastFood) {
            System.out.print("Enter Food: ");
            String food = scanner.nextLine();
            record = new OrderRecord(id, selectedCustomer.getName(), selectedRestaurant.getRestaurantName(), food, selectedRestaurant.getDeliveryFee(), LocalDate.now());
            orderRecords.add(record);
            System.out.println("Successfully Place an Order.✅");
            return;
        }
    }

}
