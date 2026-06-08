package orgEx2;

import orgEx2.store.Product;

public class Main {
    public static void main(String[] args) {
        Product laptop = new Product();

        laptop.productName = "Asus Laptop";
        laptop.price = 25_000;
        laptop.stock = 15;

        System.out.println("Project Name: Online Store Package");
        System.out.println();
        System.out.println("Product Name: " + laptop.productName);
        System.out.println("Price: " + laptop.price);
        System.out.println("Stocks: " + laptop.stock);
    }
}
