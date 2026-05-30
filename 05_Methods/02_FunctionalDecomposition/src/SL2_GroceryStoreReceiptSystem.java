import java.util.Scanner;

public class SL2_GroceryStoreReceiptSystem {

    public static void main(String[] args) {
        System.out.println("Project Name: Grocery Store Receipt System");
        System.out.println();
        printReceipt();
        System.out.println();
        System.out.println("End Of Program...");
    }

    //calculateSubtotal
    public static int calculateSubtotal(int price, int qty) {
        return price * qty;
    }

    //calculateVat
    public static double calculateVat(int subtotal) {
        return subtotal * 0.12;
    }

    //applyDiscount
    public static double applyDiscount(int subtotal, boolean isMember) {
        if (isMember) {
            return subtotal * 0.10;
        }
        return 0;
    }

    public static double calculateFinalTotal(int subtotal, double vat, double discount) {
        return (double) (subtotal + vat) - discount;
    }

    public static void printReceipt() {
        int price, qty, subtotal;
        double vat, discount, finalTotal;
        boolean isMember;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Product Price: ");
        price = scanner.nextInt();
        System.out.print("Enter Quantity: ");
        qty = scanner.nextInt();
        System.out.print("Are you a member (true / false): ");
        isMember = scanner.nextBoolean();
        System.out.println();

        subtotal = calculateSubtotal(price, qty);
        discount = applyDiscount(subtotal, isMember);
        vat = calculateVat(price);
        finalTotal = calculateFinalTotal(subtotal, vat, discount);

        System.out.println("==== Grocery Store Receipt ====");
        System.out.println("Product Price: " + price);
        System.out.println("Quantity: " + qty);
        System.out.println();

        System.out.println("Subtotal: " + subtotal);
        System.out.println("VAT: " + vat);
        System.out.println("Discount: " + discount);
        System.out.println();

        System.out.println("Final Total: " + finalTotal);

        scanner.close();
    }
}
