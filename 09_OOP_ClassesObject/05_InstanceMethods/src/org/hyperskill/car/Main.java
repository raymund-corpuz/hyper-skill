package org.hyperskill.car;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Car[] car = new Car[5];
        int choice;
        Scanner scanner = new Scanner(System.in);

        car[0] = new Car("Toyota", "Supra", 2_500_000, true);
        car[1] = new Car("Honda", "Civic", 1_500_000, true);
        car[2] = new Car("Ford", "Everest", 1_864_000, true);
        car[3] = new Car("Ford", "Mustang", 3_506_000, false);
        car[4] = new Car("Mazda", "Mazda CX-5", 2_050_000, true);

        System.out.println("Project Name: Car Purchasing Company - Summary Lesson");
        System.out.println();
        for (int i = 0; i < car.length; i++) {
            System.out.println((i + 1) + ". " + displayCars(car[i]));
        }
        System.out.println();
        System.out.print("Car you want to purchase: ");
        choice = scanner.nextInt();
        System.out.println();
        purchasingCar(choice, car);
        System.out.println();
        System.out.println("End Of Program...");

    }

    public static String displayCars(Car car) {
        return (car.brand + " " + car.model + " - " + car.price + " - " + (car.isAvailable ? "Available" : "Sold Out"));
    }

    public static void purchasingCar(int choice, Car[] car) {
        if (choice >= 1 && choice <= car.length) {
            if (car[choice - 1].isAvailable) {
                System.out.println("Buying " + displayCars(car[choice - 1]));
                System.out.println("Purchased Successful! ✅");
            } else {
                System.out.println("Car is sold out!🚫");
            }
        } else {
            System.out.println("Invalid choice❌");
        }
    }

}
