package org.shopping.product;

public class Clothing extends Product {
    protected String size;
    protected String color;

    public Clothing(String productName, double price, String size, String color) {
        super(productName, price);
        this.size = size;
        this.color = color;
    }

    @Override
    public String displayProduct() {
        return super.displayProduct() +
                "\nCategory: " + "Clothing";
    }

    public String getSize() {
        return size;
    }

    public String getColor() {
        return color;
    }
}
