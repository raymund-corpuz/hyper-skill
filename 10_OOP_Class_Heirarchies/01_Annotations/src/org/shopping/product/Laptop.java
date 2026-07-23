package org.shopping.product;

public class Laptop extends Product {
    protected String brand;
    protected int warranty;

    public Laptop(String productName, double price, String brand, int warranty) {
        super(productName, price);
        this.brand = brand;
        this.warranty = warranty;

    }

    public String getBrand() {
        return brand;
    }

    public int getWarranty() {
        return warranty;
    }
}
