package com.bank.app;

import com.bank.account.BankAccount;
import com.bank.account.BusinessAccount;
import com.bank.account.CheckingAccount;
import com.bank.account.SavingsAccount;
import com.bank.people.Customer;
import com.bank.record.TransactionRecord;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    //MAIN METHOD
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Customer> customers = new ArrayList<>();
        ArrayList<BankAccount> accounts = new ArrayList<>();
        ArrayList<TransactionRecord> transactions = new ArrayList<>();

        //Customer
        customers.add(new Customer("CUS-001", "Raymund Corpuz", 31, "09123456789", "Urdaneta City", "Pangasinan"));
        customers.add(new Customer("CUS-002", "Alice Santos", 26, "09234567891", "Urdaneta City", "Pangasinan"));
        customers.add(new Customer("CUS-003", "Michael Cruz", 42, "093234567892", "Urdaneta City", "Pangasinan"));
        customers.add(new Customer("CUS-004", "Sophia Reyes", 29, "094234567893", "Urdaneta City", "Pangasinan"));
        customers.add(new Customer("CUS-005", "John Garcia", 19, "095234567894", "Urdaneta City", "Pangasinan"));

        //Accounts
        accounts.add(new SavingsAccount("ACC-001", customers.get(0), 25_000, true));
        accounts.add(new SavingsAccount("ACC-002", customers.get(1), 50_000, true));
        accounts.add(new CheckingAccount("ACC-003", customers.get(2), 15_000, true));
        accounts.add(new BusinessAccount("ACC-004", customers.get(3), 100_000, true));
        accounts.add(new CheckingAccount("ACC-005", customers.get(4), 8_000, true));

        displayCustomers(customers);
        addCustomer(customers, scanner);
        displayCustomers(customers);

        scanner.close();
    }

    //display Customers
    public static void displayCustomers(ArrayList<Customer> customers) {
        System.out.println("==== CUSTOMERS ====");
        System.out.println();
        for (int i = 0; i < customers.size(); i++) {
            System.out.println((i + 1) + ".");
            customers.get(i).displayProfile();
            System.out.println();
        }
        System.out.println();
    }

    //display Accounts
    public static void displayAccounts(ArrayList<BankAccount> accounts) {
        System.out.println("==== ACCOUNTS ====");
        System.out.println();
        for (int i = 0; i < accounts.size(); i++) {
            System.out.println((i + 1) + ".");
            accounts.get(i).displayAccount();
            System.out.println();
        }
        System.out.println();
    }
    //display Transactions

    //add Customer
    public static void addCustomer(ArrayList<Customer> customers, Scanner scanner) {
        System.out.println("==== ADD CUSTOMER ====");
        System.out.println();
        String addCustomerId = "CUS-00" + customers.size() + 1;
        System.out.print("Enter Name: ");
        String addName = scanner.nextLine();
        System.out.print("Enter Age: ");
        int addAge = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter Phone Number: ");
        String addPhoneNumber = scanner.nextLine();
        System.out.print("Enter City: ");
        String addCity = scanner.nextLine();
        System.out.print("Enter Province: ");
        String addProvince = scanner.nextLine();
        System.out.println();

        customers.add(new Customer(addCustomerId, addName, addAge, addPhoneNumber, addCity, addProvince));
        System.out.println("Successfully  Added Customer. ✅");
        System.out.println();
    }
    //update Customer
    //delete Customer
    //open Account
    //update Account
    //close Account
    //select Customer
    //select Account
    //deposit
    //withdraw
    //view transaction history
    //display Main Menu
    //process Menu
}
