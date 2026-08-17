package com.bank.app;

import com.bank.account.BankAccount;
import com.bank.account.BusinessAccount;
import com.bank.account.CheckingAccount;
import com.bank.account.SavingsAccount;
import com.bank.people.Customer;
import com.bank.record.TransactionRecord;

import java.time.LocalDate;
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
            displayMenu(scanner, customers, running, accounts, transactions);
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
        String addCustomerId = "CUS-00" + (customers.size() + 1);
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
        if (select == -1) {
            return;
        }
        System.out.println("==== UPDATE CUSTOMER ====");
        System.out.println();
        String updateCustomerId = "CUS-00" + (customers.size() + 1);
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
        scanner.nextLine();
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
    public static void deposit(Scanner scanner, BankAccount account, ArrayList<TransactionRecord> records) {
        System.out.println("==== DEPOSIT ====");
        System.out.println();
        System.out.println("Enter Transaction Id: ");
        String transactionId = scanner.nextLine();
        String transactionType = account.getClass().getSimpleName();
        System.out.println("Enter Amount: ");
        double amount = scanner.nextDouble();
        scanner.nextLine();
        double balanceAfterTransaction = account.deposit(amount);


        LocalDate today = LocalDate.now();
        TransactionRecord newRecord = new TransactionRecord(transactionId, account.getAccountNumber(), transactionType, amount, balanceAfterTransaction, today);

        System.out.println("New Transaction is Added");
        records.add(newRecord);
        viewTransactionHistory(records);
    }

    //withdraw
    //view transaction history
    public static void viewTransactionHistory(ArrayList<TransactionRecord> records) {
        System.out.println("==== TRANSACTION RECORD ====");
        System.out.println();
        for (int i = 0; i < records.size(); i++) {
            System.out.println("Transaction Id: " + records.get(i).transactionId());
            System.out.println("Transaction Id: " + records.get(i).accountNumber());
            System.out.println("Transaction Id: " + records.get(i).transactionType());
            System.out.println("Transaction Id: " + records.get(i).amount());
            System.out.println("Transaction Id: " + records.get(i).balanceAfterTransaction());
            System.out.println("Transaction Id: " + records.get(i).date());
            System.out.println();
        }


    }

    //display Main Menu
    public static void displayMenu(Scanner scanner, ArrayList<Customer> customers, boolean running, ArrayList<BankAccount> accounts, ArrayList<TransactionRecord> transactionRecords) {
        System.out.println("==== BANKING ACCOUNT SYSTEM ====");
        System.out.println();
        System.out.println("1 - Customer Management ");
        System.out.println();
        System.out.println("2 - Account Management");
        System.out.println();
        System.out.println("3 - Transaction Management");
        System.out.println();
        System.out.println("4 - Exit");
        System.out.println();
        System.out.print("Select Options: ");
        int choice = scanner.nextInt();
        scanner.nextLine();

        switch (choice) {
            case 1:
                displayCustomerMenu(scanner, customers, accounts, transactionRecords);
                break;
            case 2:
                System.out.println("Account Menu");
                break;
            case 3:
                int chosenCustomer = selectCustomer(scanner, customers);
                Customer finalCustomer = customers.get(chosenCustomer);
                int chosenAccount = selectAccount(scanner, accounts);
                BankAccount finalAccount = accounts.get(chosenAccount);
                transactionMenu(scanner, accounts, finalAccount, transactionRecords, customers);
                break;
            case 4:
                System.out.println("Exiting Program...");
                break;
            default:
                System.out.println("Invalid Selection. ❌");
                running = false;
                break;
        }
    }

    //Customer Menu
    public static void displayCustomerMenu(Scanner scanner, ArrayList<Customer> customers, ArrayList<BankAccount> accounts, ArrayList<TransactionRecord> records) {
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
                displayMenu(scanner, customers, true, accounts, records);
                break;
            default:
                System.out.println("Invalid Choice. ❌");
        }
    }

    //Account Menu
    //Transaction Menu
    public static void transactionMenu(Scanner scanner, ArrayList<BankAccount> accounts, BankAccount account, ArrayList<TransactionRecord> records, ArrayList<Customer> customers) {
        System.out.println("==== Transaction Menu ====");
        System.out.println();
        System.out.println("1 - Deposit");
        System.out.println();
        System.out.println("2 - Withdraw");
        System.out.println();
        System.out.println("3 - View Transaction History");
        System.out.println();
        System.out.println("4 -  Back");
        System.out.println();
        System.out.print("Select Transaction:");
        int transaction = scanner.nextInt();
        scanner.nextLine();

        switch (transaction) {
            case 1:
                deposit(scanner, account, records);
                break;
            case 2:
                System.out.println("Withdraw");
                break;
            case 3:
                viewTransactionHistory(records);
                break;
            case 4:
                displayMenu(scanner, customers, true, accounts, records);
                break;
            default:
                System.out.println("Invalid Transaction. ❌");
                break;
        }

    }
}

