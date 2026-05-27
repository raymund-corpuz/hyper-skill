import java.util.Scanner;

public class Ex1_OnlineShoppingPayment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        System.out.println("Project Name:  Online Shopping Payment Method");
        System.out.println();

        System.out.println("1. GCash");
        System.out.println("2. Credit Card");
        System.out.println("3. PayPal");
        System.out.println("4. Cash on Delivery");
        choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Choose payment method: " + choice);
                System.out.println();
                System.out.println("GCash is selected");
                System.out.println("Processing fee: 50 PHP");
                break;
            case 2:
                System.out.println("Choose payment method: " + choice);
                System.out.println();
                System.out.println("Credit Card is selected");
                System.out.println("Processing fee: 50 PHP");
            case 3:
                System.out.println("Choose payment method: " + choice);
                System.out.println();
                System.out.println("PayPal is selected");
                System.out.println("Processing fee: 50 PHP");
            case 4:
                System.out.println("Choose payment method: " + choice);
                System.out.println();
                System.out.println("Cash on Delivery is selected");
                System.out.println("Processing fee: 50 PHP");
        }
        System.out.println();
        System.out.println("End Of Program...");

        scanner.close();
    }
}
