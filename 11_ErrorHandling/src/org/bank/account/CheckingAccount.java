package org.bank.account;

public class CheckingAccount extends BankAccount {

    public CheckingAccount(String accountNumber, String accountHolder, double balance, boolean active) {
        super(accountNumber, accountHolder, balance, active);
    }

    @Override
    public double calculateInterest() {
        return getBalance() * 0.01;
    }


}
