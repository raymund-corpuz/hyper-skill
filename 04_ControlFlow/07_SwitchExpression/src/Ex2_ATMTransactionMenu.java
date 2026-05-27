import java.util.Scanner;

public class Ex2_ATMTransactionMenu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int choice = 0;
        int balance = 50_000;
        int hundreds = 100;

        System.out.println("Project Name: ATM Transaction Menu");
        System.out.println();

        do {
            System.out.println("1 - Check Balance");
            System.out.println("2 - Withdraw");
            System.out.println("3 - Deposit");
            System.out.println("4 - Transfer");
            System.out.println("5 - Exit");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Select transaction: " + choice);
                    System.out.println();
                    System.out.println("Your balance is: " + balance + " PHP");
                    break;
                case 2:
                    System.out.println("Select transaction: " + choice);
                    System.out.println();
                    System.out.println("Your balance is: " + balance + " PHP");
                    System.out.println();
                    System.out.print("Enter an amount: ");
                    System.out.println();
                    int withdraw = scanner.nextInt();
                    if (withdraw >= balance) {
                        System.out.println("Insufficient Balance!");
                    } else if (withdraw <= 0) {
                        System.out.println("Invalid Amount: " + withdraw);
                    } else if (withdraw % 100 == 0) {
                        balance -= withdraw;
                        System.out.println("Withdrawal Successfully: 🎉");
                        System.out.println("You withdraw: " + withdraw);
                        System.out.println("Your remaining balance: " + balance + " PHP");
                    } else {
                        System.out.println("Not divisible by " + hundreds);
                    }
                    break;
                case 3:
                    System.out.println("Select transaction: " + choice);
                    System.out.println();
                    System.out.println("Your balance is: " + balance + " PHP");
                    System.out.print("Deposit amount: ");
                    int deposit = scanner.nextInt();
                    if (deposit <= 0) {
                        System.out.println("Invalid amount");
                    } else {
                        balance += deposit;
                        System.out.println("You deposited: " + deposit);
                        System.out.println("Your new balance: " + balance + " PHP");
                    }
                    break;
                case 4:
                    System.out.println("Select transaction: " + choice);
                    System.out.println();
                    System.out.println("Your balance is: " + balance + " PHP");
                    System.out.println("Enter an amount to transfer: ");
                    int transfer = scanner.nextInt();
                    if (transfer >= balance) {
                        System.out.println("Insufficient balance!");
                    } else if (transfer <= 0) {
                        System.out.println("Invalid amount");
                    } else {
                        balance -= transfer;
                        System.out.println("You have transfer: " + transfer);
                        System.out.println();
                        System.out.println("Your remaining balance: " + balance + " PHP");
                    }
                    break;
                case 5:
                    System.out.println("Select transaction: " + choice);
                    System.out.println("Exiting the Program...");
                    break;
            }
            System.out.println();
        } while (choice != 5);
        System.out.println("End Of Program...");
        scanner.close();
    }
}
