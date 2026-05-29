import java.util.Scanner;

public class Ex2_GroceryStoreReceiptSystem {
    public static void main(String[] args) {
        System.out.println("Project Name: Grocery Store Receipt System");
        System.out.println();
        printReceipt();
        System.out.println();
        System.out.println("End Of Program...");
    }

    // SUBTOTAL
    public static int calculateSubtotal(int price) {
        return price;
    }

    public static double calculateVat(int price) {
        return price * 0.12;
    }

    public static double applyDiscount(int subtotal, boolean isMember) {
        if (isMember) {
            return subtotal * 0.10;
        }
        return 0;
    }

    public static void printReceipt() {
        Scanner scanner = new Scanner(System.in);
        int price;
        int subtotal;
        double discount, finalTotal;
        double vat;
        boolean isMember = false;

        System.out.print("Enter Product Price: ");
        price = scanner.nextInt();
        System.out.print("Are you a member: ");
        isMember = scanner.nextBoolean();
        System.out.println();
        System.out.println(" ==== Grocery Store Receipt ====");
        System.out.println();


        subtotal = calculateSubtotal(price);
        vat = calculateVat(price);
        discount = applyDiscount(price, isMember);
        System.out.println("Subtotal: " + subtotal);
        System.out.println("VAT: " + vat);
        System.out.println("Discount: " + discount);
        System.out.println();
        finalTotal = (subtotal + vat) - discount;
        System.out.println("Final Total: " + finalTotal);

        scanner.close();
    }

}
