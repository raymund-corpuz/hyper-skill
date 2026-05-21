import java.util.Scanner;

public class Ex1_ATMWithdrawalSystem {
    public static void main(String[] args){
        Scanner  scanner = new Scanner(System.in);

        int balance;
        int withdrawal;
        int hundreds = 100;

        System.out.println("Project Name: ATM Withdrawal System");
        System.out.println();
        System.out.println("Enter your balance: ");
        balance = scanner.nextInt();
        System.out.println("Enter withdrawal amount: ");
        withdrawal = scanner.nextInt();

        if(withdrawal > balance){
            System.out.println("Insufficient Balance");
        }else if(withdrawal <= 0){
            System.out.println("Invalid Amount");
        }else if(withdrawal % 100 == 0){
            balance = balance -withdrawal;
            System.out.println("Withdrawal Successful");
            System.out.println("Remaining balance: " + balance);
        }else {
            System.out.println("Amount must be divisible by 100");
        }

        System.out.println("End of Program...");

        scanner.close();
    }
}
