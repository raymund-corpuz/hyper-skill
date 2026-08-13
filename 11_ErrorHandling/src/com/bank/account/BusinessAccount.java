package com.bank.account;

import com.bank.people.Customer;

public class BusinessAccount extends BankAccount {

    public BusinessAccount(String accountNumber, Customer customer, double balance, boolean active) {
        super(accountNumber, customer, balance, active);
    }

    @Override
    public double calculateInterest() {
        return getBalance() * 0.05;
    }
}
