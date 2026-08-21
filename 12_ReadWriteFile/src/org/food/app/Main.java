package org.food.app;

import org.food.people.Customer;
import org.food.record.OrderRecord;
import org.food.restaurant.CoffeeShop;
import org.food.restaurant.FastFood;
import org.food.restaurant.Restaurant;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

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
            int menuSelection = displayMainMenu(scanner);

            switch (menuSelection) {
                case 1:
                    customerManagement(scanner, customers);
                    break;
                case 2:
//                    restaurantManagement();
                    System.out.println("==== RESTAURANT MANAGEMENT ====");
                    break;
                case 3:
//                    orderManagement();
                    System.out.println("==== ORDER MANAGEMENT ====");
                    break;
                case 4:
                    running = false;
                    break;
                default:
                    System.out.println("Selection Not Found. ❌");
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

    public static int displayMainMenu(Scanner scanner) {
        System.out.println("============================");
        System.out.println("           MAIN MENU        ");
        System.out.println("============================");
        System.out.println("1 - Customer Management");
        System.out.println("2 - Restaurant Management");
        System.out.println("3 - Order Management");
        System.out.println("4 - Exit");
        System.out.println();

        return selectOption(scanner);
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
                displayMainMenu(scanner);
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
}
