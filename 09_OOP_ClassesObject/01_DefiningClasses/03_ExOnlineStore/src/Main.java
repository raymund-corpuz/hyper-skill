public class Main {
    public static void main(String[] args) {

        Product laptop = new Product();

        laptop.productName = "Asus Laptop";
        laptop.price = 45_000;
        laptop.stock = 25;

        System.out.println("Project Name: Online Store Product Class");
        System.out.println();
        System.out.println("==== Online Store ====");
        System.out.println();
        System.out.println("Product: " + laptop.productName);
        System.out.println("Price: " + laptop.price);
        System.out.println("Available Stocks: " + laptop.stock);
        System.out.println();
        System.out.println("End Of Program...");
    }
}
