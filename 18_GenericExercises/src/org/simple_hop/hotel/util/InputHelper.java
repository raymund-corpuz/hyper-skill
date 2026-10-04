package org.simple_hop.hotel.util;

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
                return Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                throw new NumberFormatException("Please enter valid integer.");
            }
        }
    }

    public double readDouble(String message) {

        while (true) {

            try {
                System.out.println(message);
                return Double.parseDouble(scanner.nextLine());
            } catch (NumberFormatException e) {
                throw new NumberFormatException("Please enter valid number.");
            }
        }
    }

    public boolean readBoolean(String message) {

        while (true) {
            String input = readString(message + "(Y/N): ");

            if (input.equalsIgnoreCase("y")) {
                return true;
            }

            if (input.equalsIgnoreCase("n")) {
                return false;
            }

            System.out.println("Please enter Y or N");
        }

    }

    public void close() {
        scanner.close();
    }
}
