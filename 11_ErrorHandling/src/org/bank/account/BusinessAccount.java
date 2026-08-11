package org.bank.account;

public class BusinessAccount extends BankAccount {
    public BusinessAccount(String accountNumber, String accountHolder, double balance, boolean active) {
        super(accountNumber, accountHolder, balance, active);

    }

    @Override
    public double calculateInterest() {
        return getBalance() * 0.5;
    }
}
