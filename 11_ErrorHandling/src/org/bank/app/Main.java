//package org.bank.app;
//
//import org.bank.account.BankAccount;
//import org.bank.data.BankData;
//import org.bank.people.Customer;
//import org.bank.record.TransactionRecord;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        ArrayList<Customer> customers = BankData.createCustomer();
//        ArrayList<BankAccount> accounts = BankData.createAccounts(customers);
//        ArrayList<TransactionRecord> transactions = new ArrayList<>();
//
//        getAllCustomers(customers);
//
//    }
//
//    //Create
//    public static void addCustomer(ArrayList<Customer> customers, Customer customer, Scanner scanner) {
//        System.out.println("==== Add Customer ====");
//        System.out.println();
//        System.out.println("Enter Customer ID: ");
//        String addCustomerId = scanner.nextLine();
//        System.out.println("Enter Name: ");
//        String addName = scanner.nextLine();
//        System.out.println("Enter Age: ");
//        int addAge = scanner.nextInt();
//        scanner.nextLine();
//        System.out.println("Enter Phone Number: ");
//        String addPhoneNumber = scanner.nextLine();
//        System.out.println("Enter City: ");
//        String addCity = scanner.nextLine();
//        System.out.println("Enter Province: ");
//        String addProvince = scanner.nextLine();
//
//        Customer newCustomer = new Customer(addCustomerId, addName, addAge, addPhoneNumber, addCity, addProvince);
//        customers.add(newCustomer);
//
//        System.out.println("Successfully Added New Customer. ✅");
//    }
//
//    //Read
//    public static void getAllCustomers(ArrayList<Customer> customers) {
//        System.out.println("==== CUSTOMERS ====");
//        System.out.println();
//
//        for (Customer customer : ) {
//            customer.displayProfile();
//        }
//    }
//}

package org.bank.app;

import org.bank.account.BankAccount;
import org.bank.crudManager.CrudManager;
import org.bank.data.BankData;
import org.bank.people.Customer;
import org.bank.record.TransactionRecord;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // =========================
        // CREATE CRUD MANAGERS
        // =========================

        CrudManager<Customer> customerCrud =
                new CrudManager<>();

        CrudManager<BankAccount> accountCrud =
                new CrudManager<>();

        CrudManager<TransactionRecord> transactionCrud =
                new CrudManager<>();


        // =========================
        // LOAD SAMPLE DATA
        // =========================

        ArrayList<Customer> customers =
                BankData.createCustomer();

        ArrayList<BankAccount> accounts =
                BankData.createAccounts(customers);


        // =========================
        // STORE CUSTOMERS
        // =========================

        for (Customer customer : customers) {
            customerCrud.add(customer);
        }


        // =========================
        // STORE ACCOUNTS
        // =========================

        for (BankAccount account : accounts) {
            accountCrud.add(account);
        }


        // =========================
        // DISPLAY CUSTOMERS
        // =========================

        getAllCustomers(customerCrud);


        // =========================
        // DISPLAY ACCOUNTS
        // =========================

        //getAllAccounts(accountCrud);


        scanner.close();
    }


    // =========================
    // READ CUSTOMERS
    // =========================

    public static void getAllCustomers(
            CrudManager<Customer> customerCrud) {

        System.out.println("==== CUSTOMERS ====");
        System.out.println();

        for (Customer customer : customerCrud.getAll()) {

            customer.displayProfile();

            System.out.println();
        }
    }


    // =========================
    // READ ACCOUNTS
    // =========================

    public static void getAllAccounts(
            CrudManager<BankAccount> accountCrud, Customer customers) {

        System.out.println("==== BANK ACCOUNTS ====");
        System.out.println();

        for (BankAccount account : accountCrud.getAll()) {

            account.displayAccount(customers);

            System.out.println();
        }
    }
}