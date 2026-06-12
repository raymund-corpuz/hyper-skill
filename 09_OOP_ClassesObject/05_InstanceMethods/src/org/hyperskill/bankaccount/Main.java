package org.hyperskill.bankaccount;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BankAccount[] account = new BankAccount[3];
        Scanner scanner = new Scanner(System.in);
        int accountChoice, transaction;
        double amount;

        account[0] = new BankAccount("Raymund", 90111, 50_000, true);
        account[1] = new BankAccount("John", 90112, 150_000, true);
        account[2] = new BankAccount("Marie", 90113, 40_000, false);

        System.out.println("Project Name:  Bank Account Management System - Summary Lesson");
        System.out.println();
        System.out.println("==== BANK ACCOUNT ====");
        displayAllAccounts(account);
        System.out.println();
        System.out.print("Choose Account: ");
        accountChoice = scanner.nextInt();
        accountChoice -= 1;
        System.out.println();
        System.out.println("1 - Deposit");
        System.out.println("2 - Withdraw");
        System.out.println();
        System.out.print("Choose Transaction: ");
        transaction = scanner.nextInt();
        System.out.println();
        System.out.print("Enter Amount: ");
        amount = scanner.nextDouble();


        if (accountChoice > account.length && accountChoice < 0) {
            System.out.println("Account Not Found");
        } else {
            switch (transaction) {
                case 1:
                    processDeposit(account[accountChoice], accountChoice, amount);
                    break;
                case 2:
                    processWithdrawal(account[accountChoice], accountChoice, amount);
                    break;
                default:
                    System.out.println("Invalid Transaction ❌");
            }
        }
        System.out.println();
        findRichestAccount(account);
    }

    public static void displayAllAccounts(BankAccount[] accounts) {
        for (int i = 0; i < accounts.length; i++) {
            accounts[i].displayAccount();
        }
    }

    public static void processDeposit(BankAccount account, int accountNumber, double amount) {
//        if (accountNumber >= 0) {
//            if (amount >= 100 && amount % 100 == 0) {
//                System.out.println("Deposit Successful!✅");
//                System.out.println("New Balance: " + account.deposit(amount));
//            } else {
//                System.out.println("Invalid Amount❌");
//            }
//        }
        if (!account.isActive) {
            System.out.println("Account Closed❌");
        } else if (amount >= 100 & amount % 100 == 0) {
            System.out.println("Deposit Successful! ✅");
            System.out.println("New Balance: " + account.deposit(amount));
        } else {
            System.out.println("Invalid Amount❌");
        }
    }

    public static void processWithdrawal(BankAccount account, int accountNumber, double amount) {
//        if (accountNumber >= 0) {
//            System.out.println("Withdrawal Successful!✅");
//            System.out.println("New Balance: " + account.withdraw(amount));
//        }

        if (!account.isActive) {
            System.out.println("Account Closed❌");
        } else if (amount <= 0) {
            System.out.println("Invalid Amount❌");
        } else if (amount > account.balance) {
            System.out.println("insufficient Balance❌");
        } else {
            System.out.println("Withdrawal Successful!✅");
            System.out.println("New Balance: " + account.withdraw(amount));
        }
    }

    public static void findRichestAccount(BankAccount[] accounts) {
        double largest = accounts[0].balance;
        for (int i = 0; i < accounts.length; i++) {
            if (largest <= accounts[i].balance) {
                largest = accounts[i].balance;

            }
        }
        System.out.println("Richest Account Balance: " + largest);
    }
}
