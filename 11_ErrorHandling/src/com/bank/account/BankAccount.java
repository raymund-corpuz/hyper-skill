package com.bank.account;

import com.bank.exception.InsufficientFundsException;
import com.bank.exception.InvalidAmountException;
import com.bank.people.Customer;

public abstract class BankAccount {
    private String accountNumber;
    private Customer customer;
    private double balance;
    private boolean active;

    public BankAccount(String accountNumber, Customer customer, double balance, boolean active) {
        this.accountNumber = accountNumber;
        this.customer = customer;
        this.balance = balance;
        this.active = active;
    }

    //deposit
    public double deposit(double amount) throws InvalidAmountException {
        if (amount < 0) {
            throw new InvalidAmountException("Amount must be greater than zero. ❌");
        }
        return balance += amount;
    }

    //withdraw
    public double withdraw(double amount) throws InsufficientFundsException {
        if (amount < 0 || balance > amount) {
            throw new InsufficientFundsException("Insufficient Funds.❌");
        }
        return balance -= amount;
    }

    //Calculate Interest
    public abstract double calculateInterest();

    // Display Account
    public void displayAccount() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Customer Name: " + customer);
        System.out.println("Balance: " + balance);
        System.out.println("Active: " + active);
    }

    //getters & setters


    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
