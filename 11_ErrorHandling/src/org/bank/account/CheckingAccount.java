package org.bank.account;

import org.bank.people.Customer;

public class CheckingAccount extends BankAccount {

    public CheckingAccount(String accountNumber, Customer accountHolder, double balance, boolean active) {
        super(accountNumber, accountHolder, balance, active);
    }

    @Override
    public double calculateInterest() {
        return getBalance() * 0.01;
    }


}
