public class Ex2_OnlineStoreProductViewer {
    public static void main(String[] args) {

        String[] products = {"Laptop", "Mouse", "Keyboard", "Monitor", "Headset"};
        int[] stocks = {5, 12, 0, 7, 0};

        System.out.println("Project Name: Online Store Product Viewer");
        System.out.println();
        System.out.println("==== PRODUCT INVENTORY ====");
        System.out.println();

        for (int i = 0; i < products.length; i++) {
            String status;
            status = stocks[i] == 0 ? "Out Of Stock" : "In Stock";
            System.out.println(products[i] + " - " + stocks[i] + " - " + status);
        }
        System.out.println();
        System.out.println("End Of Program...");
    }
}
