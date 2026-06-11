package org.hyperskill.bankaccount;

public class BankAccount {
    String accountName;
    int accountNumber;
    double balance;
    boolean isActive;

    //Constructor
    public BankAccount(String accountName, int accountNumber, double balance, boolean isActive) {
        this.accountName = accountName;
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.isActive = isActive;
    }

    //Instance Method
    void displayAccount() {
        System.out.println(this.accountName + " - Balance:  " + this.balance + (this.isActive ? " - Active" : " - Closed"));
    }

    double deposit(double amount) {
        return this.balance += amount;
    }

    double withdraw(double amount) {
        return this.balance -= amount;
    }

    boolean closeAccount() {
        return this.isActive = false;
    }
}
