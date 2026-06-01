import com.sun.security.jgss.GSSUtil;

public class Ex2_ATMWithdrawalOverload {
    public static void main(String[] args) {
        System.out.println("Project Name: ATM Withdrawal Overload");
        System.out.println();
        System.out.println("Remaining Balance: " + withdraw(5000, 1000));
        System.out.println("Remaining Balance with Fee: " + withdraw(5000, 1000, 50));
        System.out.println();
        System.out.println("End Of Program...");
    }

    public static int withdraw(int balance, int amount) {
        if (amount > balance) {
            System.out.println("Insufficient Balance❌");
            return balance;
        } else if (amount <= 0) {
            System.out.println("Invalid Amount❌");
            return balance;
        }
        return balance - amount;
    }

    public static int withdraw(int balance, int amount, int fee) {
        if (amount > balance) {
            System.out.println("Insufficient Balance❌");
            return balance;
        } else if (amount <= 0) {
            System.out.println("Invalid Amount❌");
            return balance;
        }
        return balance - (amount + fee);
    }
}
