package org.hyperskill.restaurant;

public class Restaurant {
    private String foodName;
    private double price;
    private int quantity;
    public String customerName;
    protected int tableNumber;

    public Restaurant(String foodName, double price, int quantity, String customerName, int tableNumber) {
        this.foodName = foodName;
        this.price = price;
        this.quantity = quantity;
        this.customerName = customerName;
        this.tableNumber = tableNumber;
    }

    void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    void setPrice(double price) {
        this.price = price;
    }

    void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    void setTableNumber(int tableNumber) {
        this.tableNumber = tableNumber;
    }

    String getFoodName() {
        return this.foodName;
    }

    double getPrice() {
        return this.price;
    }

    int getQuantity() {
        return this.quantity;
    }

    String getCustomerName() {
        return this.customerName;
    }

    int getTableNumber() {
        return this.tableNumber;
    }

    //DISPLAY ORDER
    String displayOrderInfo() {
        return this.foodName + " - " + this.price;
    }

    //TOTAL
    double calculateTotal() {
        return this.price * this.quantity;
    }

    //UPDATE QUANTITY
//    int updateQuantity(int quantity) {
//        return this.quantity = quantity;
//    }
}
