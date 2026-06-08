package store;

public class Main {
    public static void main(String[] args) {

        Product product1 = new Product();

        product1.productName = "Asus Laptop";
        product1.price = 19_000;
        product1.stocks = 250;


        System.out.println("Project Name: Online Store Module");
        System.out.println();
        System.out.println("==== Store Product ====");
        System.out.println();
        System.out.println("Product : " + product1.productName);
        System.out.println("Price: " + product1.price);
        System.out.println("Stocks: " + product1.stocks);
        System.out.println();
        System.out.println("End Of Program...");

    }
}
