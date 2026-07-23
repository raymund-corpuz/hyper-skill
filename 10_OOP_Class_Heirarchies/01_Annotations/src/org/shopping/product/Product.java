package org.shopping.product;

public class Product {
    protected String productName;
    protected double price;

    public Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
    }

    public String displayProduct() {
        return "Product: " + productName +
                "\nPrice: " + price;
    }

    public double calculatePrice(int quantity, double price) {
        return quantity * price;
    }

    public String getProductName() {
        return productName;
    }


    public double getPrice() {
        return price;
    }
}
