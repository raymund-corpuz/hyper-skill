package org.bank.data;

import org.bank.account.BankAccount;
import org.bank.account.BusinessAccount;
import org.bank.account.CheckingAccount;
import org.bank.account.SavingsAccount;
import org.bank.people.Customer;

import java.util.ArrayList;

public class BankData1 {

    public static ArrayList<Customer> createCustomer() {

        ArrayList<Customer> customers = new ArrayList<>();

        customers.add(new Customer("CUS-001", "Raymund Corpuz", 31, "09171234567", "Dagupan City", "Pangasinan"));
        customers.add(new Customer("CUS-002", "Raymund Corpuz1", 31, "09171234567", "Dagupan City", "Pangasinan"));
        customers.add(new Customer("CUS-003", "Raymund Corpuz2", 31, "09171234567", "Dagupan City", "Pangasinan"));

        return customers;

    }

    public static ArrayList<BankAccount> createAccounts(ArrayList<Customer> customers) {
        ArrayList<BankAccount> accounts = new ArrayList<>();

        accounts.add(new SavingsAccount("ACC-001", customers.get(0), 25_000, true));
        accounts.add(new SavingsAccount("ACC-002", customers.get(1), 50_000, true));
        accounts.add(new CheckingAccount("ACC-003", customers.get(2), 15_000, true));
        accounts.add(new CheckingAccount("ACC-004", customers.get(3), 100_000, true));
        accounts.add(new BusinessAccount("ACC-005", customers.get(4), 8_000, true));
        accounts.add(new BusinessAccount("ACC-006", customers.get(5), 5_000, true));


        return accounts;


    }

}
