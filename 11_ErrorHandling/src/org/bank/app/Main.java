package org.bank.app;

import org.bank.account.BankAccount;
import org.bank.data.BankData;
import org.bank.people.Customer;
import org.bank.record.TransactionRecord;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Customer> customers = BankData.createCustomer();
        ArrayList<BankAccount> accounts = BankData.createAccounts(customers);
        ArrayList<TransactionRecord> transactions = new ArrayList<>();

    }

    //Read
    public static void read()
}
