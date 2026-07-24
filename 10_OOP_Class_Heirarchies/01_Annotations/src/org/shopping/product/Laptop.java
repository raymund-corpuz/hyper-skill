package org.shopping.product;

public class Laptop extends Product {
    protected String brand;
    protected int warranty;

    public Laptop(String productName, double price, String brand, int warranty) {
        super(productName, price);
        this.brand = brand;
        this.warranty = warranty;

    }

    @Override
    public String displayProduct() {
        return super.displayProduct() +
                "\nCategory: " + "Laptop";
    }

    @Override
    public double calculatePrice(int qty, double price) {

    }

    public String getBrand() {
        return brand;
    }

    public int getWarranty() {
        return warranty;
    }
}
