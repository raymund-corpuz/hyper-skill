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

    @Override
    public double calculatePrice(int qty, double price) {
        if (qty > 3) {
            return (price * 0.10) - price * qty;
        }
        return price * qty;
    }

    public String getSize() {
        return size;
    }

    public String getColor() {
        return color;
    }
}
