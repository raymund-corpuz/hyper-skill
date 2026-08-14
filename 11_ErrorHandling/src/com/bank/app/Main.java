package com.bank.app;

import com.bank.account.BankAccount;
import com.bank.account.BusinessAccount;
import com.bank.account.CheckingAccount;
import com.bank.account.SavingsAccount;
import com.bank.people.Customer;
import com.bank.record.TransactionRecord;

import java.lang.reflect.Array;
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

        boolean running = true;
        while (running) {
            displayMenu(scanner, customers, running);
        }

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
    public static void updateCustomer(ArrayList<Customer> customers, Scanner scanner) {
        int select = selectCustomer(scanner, customers);
        System.out.println("==== UPDATE CUSTOMER ====");
        System.out.println();
        String updateCustomerId = "CUS-00" + customers.size() + 1;
        System.out.print("Enter Name: ");
        String updateName = scanner.nextLine();
        System.out.print("Enter Age: ");
        int updateAge = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter Phone Number: ");
        String updatePhoneNumber = scanner.nextLine();
        System.out.print("Enter City: ");
        String updateCity = scanner.nextLine();
        System.out.print("Enter Province: ");
        String updateProvince = scanner.nextLine();
        System.out.println();

        customers.set(select, new Customer(updateCustomerId, updateName, updateAge, updatePhoneNumber, updateCity, updateProvince));
        System.out.println("Successfully  Updated Customer: " + customers.get(select).getName());
        System.out.println();
    }

    //delete Customer
    public static void deleteCustomer(ArrayList<Customer> customers, Scanner scanner) {
        int select = selectCustomer(scanner, customers);
        System.out.println("==== DELETE CUSTOMER ====");
        System.out.println();
        System.out.println("Successfully Deleted: " + customers.get(select).getName());
        customers.remove(select);
        System.out.println();
    }

    //open Account
    public static void openAccount(ArrayList<BankAccount> accounts, Customer customer, Scanner scanner) {
        System.out.println("==== OPEN ACCOUNT ====");
        System.out.println();
        System.out.println("Enter Account Number: ");
        String accountNumber = scanner.nextLine();
        System.out.println("Enter Balance: ");
        double balance = scanner.nextDouble();
        scanner.nextLine();
        if (balance <= 0) {
            System.out.println("Balance must be greater than 1000");
            return;
        }
        System.out.println("Enter Activate: ");
        String activate = scanner.nextLine();
        boolean isActivate = false;
        if (activate.equalsIgnoreCase("Activate")) {
            isActivate = true;
            System.out.println("Successfully Activated the Account. ✅");
        } else {
            System.out.println("Unable to Activate the Account. ❌");
            return;
        }
        System.out.println("Bank Account: Business / Checking / Savings");
        String type = scanner.nextLine();

        switch (type) {
            case "Business":
                accounts.add(new BusinessAccount(accountNumber, customer, balance, isActivate));
                System.out.println("Successfully Open a Business Account.✅");
                break;
            case "Savings":
                accounts.add(new SavingsAccount(accountNumber, customer, balance, isActivate));
                System.out.println("Successfully Open a Savings Account.✅");
                break;
            case "Checking":
                accounts.add(new CheckingAccount(accountNumber, customer, balance, isActivate));
                System.out.println("Successfully Open a Checking Account.✅");
                break;
            default:
                System.out.println("Invalid Type.❌");
                break;
        }

    }

    //update Account
    public static void updateAccount(ArrayList<BankAccount> accounts, Customer customer, Scanner scanner) {
        System.out.println("==== UPDATE BANK ACCOUNT ====");
        System.out.println();
        int chosenAccount = selectAccount(scanner, accounts);
        System.out.println("Enter Account Number: ");
        String accountNumber = scanner.nextLine();
        System.out.println("Enter Balance: ");
        double balance = scanner.nextDouble();
        if (balance <= 1000) {
            System.out.println("Balance must be greater than 1000");
            return;
        }
        System.out.println("Enter Activate: ");
        String activate = scanner.nextLine();
        boolean isActivate = false;

        if (activate.equalsIgnoreCase("Activate")) {
            isActivate = true;
            System.out.println("Successfully Activated the Account. ✅");
        } else {
            System.out.println("Unable to Activate the Account. ❌");
            return;
        }
        System.out.println("Bank Account: Business / Checking / Savings");
        String type = scanner.nextLine();

        switch (type) {
            case "Business":
                accounts.set(chosenAccount, new BusinessAccount(accountNumber, customer, balance, isActivate));
                System.out.println("Successfully Open a Business Account.✅");
                break;
            case "Savings":
                accounts.set(chosenAccount, new SavingsAccount(accountNumber, customer, balance, isActivate));
                System.out.println("Successfully Open a Savings Account.✅");
                break;
            case "Checking":
                accounts.set(chosenAccount, new CheckingAccount(accountNumber, customer, balance, isActivate));
                System.out.println("Successfully Open a Checking Account.✅");
                break;
            default:
                System.out.println("Invalid Type.❌");
                break;
        }
    }

    //close Account
    //select Customer
    public static int selectCustomer(Scanner scanner, ArrayList<Customer> customers) {
        System.out.println("==== SELECT CUSTOMER ====");
        System.out.println();
        System.out.print("Select Customer: ");
        int select = scanner.nextInt() - 1;
        scanner.nextLine();
        System.out.println();

        if (select < 0 || select >= customers.size()) {
            System.out.println("Invalid Customer Selection. ❌");
            return -1;
        }

        return select;
    }

    //select Account
    public static int selectAccount(Scanner scanner, ArrayList<BankAccount> accounts) {
        System.out.println("==== SELECT ACCOUNT ====");
        System.out.println();
        System.out.print("Select Account: ");
        int select = scanner.nextInt() - 1;
        scanner.nextLine();
        System.out.println();

        if (select < 0 || select >= accounts.size()) {
            System.out.println("Invalid Account Selection. ❌");
            return -1;
        }
        return select;
    }

    //deposit
    //withdraw
    //view transaction history
    //display Main Menu
    public static void displayMenu(Scanner scanner, ArrayList<Customer> customers, boolean running) {
        System.out.println("==== BANKING ACCOUNT SYSTEM ====");
        System.out.println();
        System.out.println("1 - Customer Management ");
        System.out.println();
        System.out.println("2 - Account Management");
        System.out.println();
        System.out.println("3 - Transaction Management");
        System.out.println();
        System.out.println("4 - Exit");
        int choice = scanner.nextInt();
        scanner.nextLine();

        switch (choice) {
            case 1:
                displayCustomerMenu(scanner, customers);
                break;
            case 2:
                System.out.println("Account Menu");
                break;
            case 3:
                System.out.println("Transaction Menu");
                break;
            case 4:
                System.out.println("Exiting Program...");
                running = false;
                break;
            default:
                System.out.println("Invalid Choice. ❌");
                running = false;
                break;
        }
    }

    //Customer Menu
    public static void displayCustomerMenu(Scanner scanner, ArrayList<Customer> customers) {
        System.out.println("==== CUSTOMER MENU ====");
        System.out.println();
        System.out.println("1 - Add Customer");
        System.out.println();
        System.out.println("2 - Display Customer");
        System.out.println();
        System.out.println("3 - Update Customer");
        System.out.println();
        System.out.println("4 - Delete Customer");
        System.out.println();
        System.out.println("5 - Back");
        int choice = scanner.nextInt();
        scanner.nextLine();

        switch (choice) {
            case 1:
                addCustomer(customers, scanner);
                break;
            case 2:
                displayCustomers(customers);
                break;
            case 3:
                updateCustomer(customers, scanner);
                break;
            case 4:
                System.out.println("DELETING CUSTOMERS");
                break;
            case 5:
                displayMenu(scanner, customers, true);
                break;
            default:
                System.out.println("Invalid Choice. ❌");
        }
    }
    //Account Menu
    //Transaction Menu
}
