package org.hyperskill.restaurant;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Restaurant[] food = new Restaurant[5];
        Scanner scanner = new Scanner(System.in);

        food[0] = new Restaurant("Burger", 120, 0, "", 0);
        food[1] = new Restaurant("Pizza", 250, 0, "", 0);
        food[2] = new Restaurant("Pasta", 180, 0, "", 0);
        food[3] = new Restaurant("Fried Chicken", 150, 0, "", 0);
        food[4] = new Restaurant("Coffee", 80, 0, "", 0);

        displayMenu(food);
        System.out.println();
        Restaurant order = selectMenuItem(scanner, food);
        System.out.println();
        displayReceipt(order);

        scanner.close();
    }

    public static void displayMenu(Restaurant[] foods) {
        System.out.println("==== RESTAURANT MENU ====");
        System.out.println();
        for (int i = 0; i < foods.length; i++) {
            System.out.println((i + 1) + ". " + foods[i].displayOrderInfo());
        }
    }

    public static Restaurant selectMenuItem(Scanner scanner, Restaurant[] food) {
        System.out.print("Choose Item: ");
        int item = scanner.nextInt();
        item--;
        System.out.print("Enter Quantity: ");
        int qty = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter Customer Name: ");
        String customerName = scanner.nextLine();
        System.out.print("Enter Table Number: ");
        int tableNumber = scanner.nextInt();
        System.out.println();

        food[item].setQuantity(qty);
        food[item].setCustomerName(customerName);
        food[item].setTableNumber(tableNumber);

        return food[item];
    }

    public static double processOrder(Restaurant food) {
        double total = 0;
        total += food.calculateTotal();
        return total;
    }

    public static void displayReceipt(Restaurant food) {
        System.out.println("==== RECEIPT ====");
        System.out.println();
        System.out.println("Customer: " + food.getCustomerName());
        System.out.println("Table: " + food.getTableNumber());
        System.out.println();
        System.out.println("Food: " + food.getFoodName());
        System.out.println("Price: " + food.getPrice());
        System.out.println("Quantity: " + food.getQuantity());
        System.out.println();
        System.out.println("Total Bill: " + processOrder(food));
    }
}
