public class Ex2_GroceryCartSystem {
    public static void main(String[] args) {
        String[] products = {"Apple", "Bread", "Milk", "Eggs", "Coffee"};
        int[] productPrices = {50, 40, 90, 120, 150};
        int totalPrice = 0;

        System.out.println("Project Name: Grocery Cart System");
        System.out.println();
        System.out.println("==== Grocery Cart ====");
        System.out.println();

        for (int i = 0; i < products.length; i++) {
            totalPrice += productPrices[i];
            System.out.println(products[i] + " - " + productPrices[i]);
        }
        System.out.println();
        System.out.println("Total Bill: " + totalPrice);
        System.out.println();
        System.out.println("End Of Program...");
    }
}
