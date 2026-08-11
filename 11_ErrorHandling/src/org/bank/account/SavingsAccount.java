package org.bank.account;

public class SavingsAccount extends BankAccount {
    public SavingsAccount(String accountNumber, String accountHolder, double balance, boolean active) {
        super(accountNumber, accountHolder, balance, active);
    }

    @Override
    public double calculateInterest() {
        return getBalance() * 0.03;
    }


}
