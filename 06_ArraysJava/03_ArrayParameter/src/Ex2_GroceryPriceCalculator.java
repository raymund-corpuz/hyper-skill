import java.util.Arrays;

public class Ex2_GroceryPriceCalculator {

    public static void main(String[] args) {
        String[] products = {"Apple", "Bread", "Milk", "Eggs", "Coffee"};
        double[] prices = {50, 40, 90, 120, 150};

        System.out.println("Project Name: Grocery Price Calculator");
        System.out.println();
        displayProducts(products, prices);
        System.out.println();
        System.out.println("end Of Program...");
    }

    public static double findMostExpensive(double[] prices) {
        double expensive = prices[0];
        for (int i = 0; i < prices.length; i++) {
            if (expensive < prices[i]) {
                expensive = prices[i];
            }
        }
        return expensive;
    }

    public static double calculateTotal(double[] prices) {
        double total = 0;
        for (double price : prices) {
            total += price;
        }
        return total;
    }

    public static void displayProducts(String[] products, double[] prices) {
        System.out.println("==== GROCERY STORE ====");
        System.out.println();

        for (int i = 0; i < products.length; i++) {
            System.out.println(products[i] + " - " + "$" + prices[i]);
        }
        System.out.println();
        System.out.println("Total Bill: " + "$" + calculateTotal(prices));
        System.out.println("Most Expensive Item Price: " + "$" + findMostExpensive(prices));
    }
}
