package org.hyperskill.constructor.car;

public class Main {
    public static void main(String[] args) {
        Car toyota = new Car("Toyota", "Supra", 2022, 2_500_000);

        Car honda = new Car("Honda", " Civic", 2021, 1_500_000);

        System.out.println("Project Name: Car Constructor System");
        System.out.println();
        System.out.println("==== CAR DETAILS ====");
        System.out.println();
        System.out.println("Brand: " + toyota.brand);
        System.out.println("Model: " + toyota.model);
        System.out.println("Year: " + toyota.year);
        System.out.println("Price: " + toyota.price);
        System.out.println();
        System.out.println("Brand: " + honda.brand);
        System.out.println("Model: " + honda.model);
        System.out.println("Year: " + honda.year);
        System.out.println("Price: " + honda.price);

        System.out.println();
        System.out.println("End Of Program...");
    }
}
