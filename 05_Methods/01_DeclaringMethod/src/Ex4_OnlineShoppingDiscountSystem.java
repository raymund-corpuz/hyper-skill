public class Ex4_OnlineShoppingDiscountSystem {

    public static void main(String[] args) {

        int price = 10_000;
        boolean isMember = false;

        System.out.println("Project Name: Online Shopping Discount System");
        System.out.println();
        System.out.println("Original Price: " + price);
        System.out.println("Member: " + isMember);
        System.out.println();

        double finalPrice = calculateDiscount(price, isMember);
        System.out.println("Final Price: " + finalPrice);

        System.out.println();
        System.out.println("End Of Program...");
    }

    public static double calculateDiscount(int price, boolean isMember) {
        // Members Only
        if (isMember) {
            if (price >= 5_000) {
                return price - (price * 0.20);
            }
            return price - (price * 0.10);
        }
        // Non Members
        if (price >= 5_000) {
            return price - (price * 0.05);
        }
        return price;
    }
}
