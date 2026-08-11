package org.bank.account;

public abstract class BankAccount {
    private String accountNumber;
    private String accountHolder;
    private double balance;
    private boolean active;

    public BankAccount(String accountNumber, String accountHolder, double balance, boolean active) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
        this.active = active;
    }

    public double deposit(double amount) {
        return balance + amount;
    }

    public double withdraw(double amount) {
        return balance - amount;
    }

    public abstract double calculateInterest();

    public void displayAccountInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: " + balance);
        System.out.println("Active: " + (active ? "YES" : "NO"));
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}
