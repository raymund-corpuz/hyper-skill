package org.food.app;

import org.food.people.Customer;
import org.food.record.OrderRecord;
import org.food.restaurant.CoffeeShop;
import org.food.restaurant.FastFood;
import org.food.restaurant.Restaurant;

import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        File file = new File("C:\\Users\\raymu\\OneDrive\\Desktop\\hyper-skill\\12_ReadWriteFile\\src\\org\\food\\Order.txt");


        ArrayList<Customer> customers = new ArrayList<>();
        ArrayList<Restaurant> restaurants = new ArrayList<>();
        ArrayList<OrderRecord> orders = new ArrayList<>();

        customers.add(new Customer("CUS-001", "Raymund", 31, "09123456789", "Urdaneta City", "Pangasinan"));
        customers.add(new Customer("CUS-002", "Jenny", 24, "091212345678", "Urdaneta City", "Pangasinan"));
        customers.add(new Customer("CUS-003", "Marco", 45, "0998765321", "Urdaneta City", "Pangasinan"));

        restaurants.add(new CoffeeShop("Star Bucks", 120, "Regular"));
        restaurants.add(new FastFood("Jollibee", 150, "10 Minutes"));
        restaurants.add(new FastFood("McDo", 120, "8 Minutes"));
        restaurants.add(new CoffeeShop("Barako Coffee", 80, "Large"));

        boolean running = true;

        while (running) {
            displayMainMenu();
            int menuSelection = selectOption(scanner);
            switch (menuSelection) {
                case 1:
                    customerManagement(scanner, customers);
                    break;
                case 2:
                    restaurantManagement(scanner, restaurants);
                    break;
                case 3:
                    orderManagement(restaurants, customers, orders, file, scanner);
                    break;
                case 4:
                    System.out.println("Exiting the Program...");
                    running = false;
                    break;
                default:
                    System.out.println("Selection Not Found. ❌");
                    running = false;
                    break;
            }
        }
    }

    public static int selectOption(Scanner scanner) {
        System.out.print("Select Option: ");
        int choice = scanner.nextInt();
        scanner.nextLine();
        return choice;
    }

    public static void displayMainMenu() {
        System.out.println("============================");
        System.out.println("           MAIN MENU        ");
        System.out.println("============================");
        System.out.println("1 - Customer Management");
        System.out.println("2 - Restaurant Management");
        System.out.println("3 - Order Management");
        System.out.println("4 - Exit");
        System.out.println();

    }

    //customer Management
    public static void customerManagement(Scanner scanner, ArrayList<Customer> customers) {
        System.out.println("==== CUSTOMER MENU ====");
        System.out.println();
        System.out.println("1 - Add Customer");
        System.out.println("2 - View Customer");
        System.out.println("3 - Update Customer");
        System.out.println("4 - Delete Customer");
        System.out.println("5 - Back");

        int choice = selectOption(scanner);

        switch (choice) {
            case 1:
                addCustomer(customers, scanner);
                break;
            case 2:
                viewCustomer(customers);
                break;
            case 3:
                updateCustomer(customers, scanner);
                break;
            case 4:
                deleteCustomer(customers, scanner);
                break;
            case 5:
                displayMainMenu();
                break;
            default:
                System.out.println("Invalid Selection.❌");
                break;
        }

    }

    //add customer
    public static void addCustomer(ArrayList<Customer> customers, Scanner scanner) {
        System.out.println("==== Add Customer ====");
        System.out.println();
        String customerId = "CUS-00" + ((customers.size() + 1));
        System.out.print("Enter Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Age: ");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter Phone: ");
        String phone = scanner.nextLine();
        System.out.print("City: ");
        String city = scanner.nextLine();
        System.out.print("Province: ");
        String province = scanner.nextLine();

        customers.add(new Customer(customerId, name, age, phone, city, province));
        System.out.println("Successfully Added: " + name + ". ✅");
        System.out.println();
    }

    //view customer
    public static void viewCustomer(ArrayList<Customer> customers) {
        System.out.println("==== View Customer ====");
        System.out.println();
        for (int i = 0; i < customers.size(); i++) {
            System.out.println((i + 1) + ".");
            customers.get(i).displayCustomerInfo();
            System.out.println();
        }
    }

    //update customer
    public static void updateCustomer(ArrayList<Customer> customers, Scanner scanner) {
        System.out.println("==== Update Customer ====");
        System.out.println();
        int choice = selectOption(scanner);
        if (choice < 0 || choice >= customers.size()) {
            System.out.println("Customer Not Found. ❌");
            return;
        }
        Customer customer = customers.get(choice);

        System.out.println("Name: ");
        String name = scanner.nextLine();
        System.out.println("Age: ");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Phone: ");
        String phone = scanner.nextLine();
        System.out.println("City: ");
        String city = scanner.nextLine();
        System.out.println("Province: ");
        String province = scanner.nextLine();

        customers.set(choice, new Customer(customer.getCustomerId(), name, age, phone, city, province));

        System.out.println("Successfully Updated: " + customer.getName() + ". ✅");
    }

    //delete customer
    public static void deleteCustomer(ArrayList<Customer> customers, Scanner scanner) {
        System.out.println("==== Delete Customer ====");
        System.out.println();
        int choice = selectOption(scanner);
        choice--;
        if (choice < 0 || choice >= customers.size()) {
            System.out.println("Customer Not Found. ❌");
            return;
        }
        System.out.println("Successfully Deleted: " + customers.get(choice).getName());
        customers.remove(choice);
    }

    //Restaurant
    public static void restaurantManagement(Scanner scanner, ArrayList<Restaurant> restaurants) {
        System.out.println("==================================");
        System.out.println("          RESTAURANT MENU         ");
        System.out.println("==================================");
        System.out.println("1 - Add Restaurant");
        System.out.println("2 - View Restaurant");
        System.out.println("3 - Update Restaurant");
        System.out.println("4 - Delete Restaurant");
        System.out.println("5 - Back");

        int options = selectOption(scanner);

        switch (options) {
            case 1:
                addRestaurant(restaurants, scanner);
                break;
            case 2:
                viewRestaurant(restaurants);
                break;
            case 3:
                updateRestaurant(restaurants, scanner);
                break;
            case 4:
                deleteRestaurant(restaurants, scanner);
                break;
            case 5:
                displayMainMenu();
                break;
            default:
                System.out.println("Invalid Option: Restaurant Menu❌");
                break;
        }
    }

    //add restaurant
    public static void addRestaurant(ArrayList<Restaurant> restaurants, Scanner scanner) {
        System.out.println("==== Add Restaurant ====");
        System.out.println();
        System.out.println("Enter Restaurant Name: ");
        String name = scanner.nextLine();
        System.out.println("Enter Delivery Fee: ");
        double deliveryFee = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Coffee Shop or Fastfood? ");
        String type = scanner.nextLine();

        switch (type.toLowerCase()) {
            case "coffeeshop":
                System.out.println("Enter Drink Size: ");
                String drinkSize = scanner.nextLine();
                restaurants.add(new CoffeeShop(name, deliveryFee, drinkSize));
                System.out.println("Successfully Added Coffee Shop ✅");
                break;
            case "fastfood":
                System.out.println("Enter Cooking Time: ");
                String cookingTime = scanner.nextLine();
                restaurants.add(new FastFood(name, deliveryFee, cookingTime));
                System.out.println("Successfully Added Fast Food ✅");
                break;
            default:
                System.out.println("Type Not Found❌");
                break;
        }
    }

    //View Restaurant
    public static void viewRestaurant(ArrayList<Restaurant> restaurants) {
        System.out.println("==== View Restaurants ====");
        System.out.println();
        for (int i = 0; i < restaurants.size(); i++) {
            System.out.println((i + 1) + ". " + restaurants.get(i).getRestaurantName());
        }
    }


    //Update Restaurant
    public static void updateRestaurant(ArrayList<Restaurant> restaurants, Scanner scanner) {
        viewRestaurant(restaurants);
        System.out.print("==== Update Restaurant ====");
        System.out.println();
        System.out.println();
        int choice = selectOption(scanner);
        choice--;
        if (choice < 0 || choice >= restaurants.size()) {
            System.out.println("Restaurant Not Found. ❌");
            return;
        }
        System.out.print("Enter Restaurant Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Delivery Fee: ");
        double deliveryFee = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Enter Restaurant Type: (FastFood / CoffeeShop");
        String type = scanner.nextLine();

        switch (type.toLowerCase()) {
            case "fastfood":
                System.out.print("Enter Cooking Time: ");
                String cookingTime = scanner.nextLine();
                restaurants.set(choice, new FastFood(name, deliveryFee, cookingTime));
                System.out.println("Successfully Updated: " + restaurants.get(choice).getRestaurantName());
                break;
            case "coffeeshop":
                System.out.print("Enter Drink Size: ");
                String drinkSize = scanner.nextLine();
                restaurants.set(choice, new CoffeeShop(name, deliveryFee, drinkSize));
                System.out.println("Successfully Updated: " + restaurants.get(choice).getRestaurantName());
                break;
            default:
                System.out.println("Type Not Found. ❌");
                break;
        }
    }

    //delete Restaurant
    public static void deleteRestaurant(ArrayList<Restaurant> restaurants, Scanner scanner) {
        System.out.println("==== Delete Restaurant ====");
        System.out.println();
        int choice = selectOption(scanner);
        choice--;
        if (choice < 0 || choice >= restaurants.size()) {
            System.out.println("Restaurant Not Found. ❌");
            return;
        }
        System.out.println("Successfully Deleted: " + restaurants.get(choice).getRestaurantName());
        restaurants.remove(choice);
    }

    //Order Management
    public static void orderManagement(ArrayList<Restaurant> restaurants, ArrayList<Customer> customers, ArrayList<OrderRecord> records, File file, Scanner scanner) {
        System.out.println("=========================================");
        System.out.println("           ORDER MANAGEMENT              ");
        System.out.println("=========================================");
        System.out.println("1 - Place Order");
        System.out.println("2 - View Order History");
        System.out.println("3 - Cancel Order");
        System.out.println("4 - Save Orders to File");
        System.out.println("5 - Read Orders from File");
        System.out.println("6 - Back");

        int choice = selectOption(scanner);
        System.out.println();

        switch (choice) {
            case 1:
                placeOrder(restaurants, customers, records, scanner);
                break;
            case 2:
                viewOrderHistory(records);
                break;
            case 3:
                cancelOrder(records, scanner);
                break;
            case 4:
                saveOrderFile(file, records);
                break;
            case 5:
                readOrderFile(file);
                break;
            case 6:
                displayMainMenu();
                break;
            default:
                System.out.println("Invalid Option ❌");
                break;
        }
    }

    //place Order
    public static void placeOrder(ArrayList<Restaurant> restaurants, ArrayList<Customer> customers, ArrayList<OrderRecord> records, Scanner scanner) {
        System.out.println("==== Place Order ====");
        System.out.println();
        System.out.println("Customer List: ");
        for (int i = 0; i < customers.size(); i++) {
            System.out.println((i + 1) + ". " + customers.get(i).getName());
        }
        System.out.println();
        int choice = selectOption(scanner);
        choice--;
        if (choice < 0 || choice >= customers.size()) {
            System.out.println("Customer Not Found. ❌");
            return;
        }
        Customer selectedCustomer = customers.get(choice);
        System.out.println("Restaurant List: ");
        for (int i = 0; i < restaurants.size(); i++) {
            System.out.println((i + 1) + ". " + restaurants.get(i).getRestaurantName());
        }
        System.out.println();
        int restaurantChoice = selectOption(scanner);
        restaurantChoice--;
        if (restaurantChoice < 0 || restaurantChoice >= customers.size()) {
            System.out.println("Customer Not Found. ❌");
            return;
        }
        Restaurant selectedRestaurant = restaurants.get(restaurantChoice);
        System.out.println("Enter Food: ");
        String food = scanner.nextLine();

        selectedRestaurant.order();
        records.add(new OrderRecord(selectedCustomer.getName(), selectedRestaurant.getRestaurantName(), food, selectedRestaurant.getDeliveryFee(), LocalDate.now()));
    }

    //view Order history
    public static void viewOrderHistory(ArrayList<OrderRecord> records) {
        if (records.isEmpty()) {
            System.out.println("Order List is Empty.❌");
            return;
        }
        System.out.println("==== Order History ====");
        System.out.println();
        for (int i = 0; i < records.size(); i++) {
            System.out.println((i + 1) + ".");
            System.out.println("Customer Name: " + records.get(i).customerName());
            System.out.println("Restaurant Name: " + records.get(i).restaurantName());
            System.out.println("Food: " + records.get(i).food());
            System.out.println("Total Price: " + records.get(i).price());
            System.out.println("Order Date: " + records.get(i).date());
            System.out.println();
        }
    }

    //cancel order
    public static void cancelOrder(ArrayList<OrderRecord> records, Scanner scanner) {
        System.out.println("==== Cancel Order ====");
        System.out.println();
        viewOrderHistory(records);
        int orderSelected = selectOption(scanner);
        orderSelected--;

        if (orderSelected < 0 || orderSelected >= records.size()) {
            System.out.println("Order Not Found. ❌");
            return;
        }

        for (int i = 0; i < records.size(); i++) {
            if (orderSelected == i) {
                System.out.println("Customer Name: " + records.get(i).customerName());
                System.out.println("Restaurant Name: " + records.get(i).restaurantName());
                System.out.println("Food: " + records.get(i).food());
                System.out.println("Total Price: " + records.get(i).price());
                System.out.println("Order Date: " + records.get(i).date());
                System.out.println("Order Successfully Canceled.✅");
                System.out.println();
                records.remove(i);
            }
        }
    }

    //save orders to file
    public static void saveOrderFile(File file, ArrayList<OrderRecord> records) {
        try (FileWriter writer = new FileWriter(file)) {
            System.out.println("Successfully Save the Record.✅");
            writer.write(String.valueOf(records));
        } catch (IOException e) {
            System.out.println("An exception occurred: " + e.getMessage());
        }
    }

    //read orders from file
    public static void readOrderFile(File file) {

        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNext()) {
                System.out.println(scanner.nextLine() + " ");
            }

        } catch (FileNotFoundException e) {
            System.out.println("File Not Found:  " + e.getMessage());
        }
    }


}
