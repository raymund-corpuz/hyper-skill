public class Ex2_ATMWithdrawalMethod {
    public static void main(String[] ags) {
        int currentBalance = 10_000;
        int amount = 5_000;


        System.out.println("Project Name: ATM Withdrawal Method");
        System.out.println();
        System.out.println("Current Balance: " + currentBalance);
        System.out.println("Withdraw Amount: " + amount);
        System.out.println();

        currentBalance = withdraw(currentBalance, amount);

        System.out.println("Remaining Balance: " + currentBalance);
        System.out.println();
        System.out.println("End Of Program...");
    }

    public static int withdraw(int balance, int amount) {
        if (amount > balance) {
            System.out.println("Insufficient Balance❌");
            return balance;
        }

        if (amount <= 0) {
            System.out.println("Invalid Amount❌");
            return balance;
        }

        System.out.println("Withdrawal Successful 🎉");
        return balance - amount;
    }
}
