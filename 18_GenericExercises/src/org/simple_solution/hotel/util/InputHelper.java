package org.simple_solution.hotel.util;

import java.util.Scanner;

public class InputHelper {

    private final Scanner scanner;

    public InputHelper() {

        scanner = new Scanner(System.in);
    }

    public String readString(String message) {

        System.out.println(message);
        return scanner.nextLine();
    }

    public int readInt(String message) {

        while (true) {

            try {
                System.out.println(message);

                int value = Integer.parseInt(scanner.nextLine());

                return value;
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid integer.");
            }
        }
    }

    public double readDouble(String message) {

        while (true) {

            try {
                System.out.println(message);

                double value = Double.parseDouble(scanner.nextLine());

                return value;
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid number.");
            }
        }
    }

    public boolean readBoolean(String message) {

        while (true) {

            String input = readString(message + " (Y/N):");

            if (input.equalsIgnoreCase("y")) {
                return true;
            }
            if (input.equalsIgnoreCase("n")) {
                return false;
            }

            System.out.println("Please enter Y or N.");
        }
    }

    public void close() {
        scanner.close();
    }

}
