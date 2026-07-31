package org.library.app;

import org.library.item.Book;
import org.library.item.LibraryItem;
import org.library.item.Magazine;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LibraryItem[] items = new LibraryItem[5];

        items[0] = new Book("Clean Code", "Robert Martin", true, "Programming", 464);
        items[1] = new Book("The Hobbit", "J.R.R. Tolkien", true, "Fantasy", 210);
        items[2] = new Book("The Pragmatic Programmer", "Andrew Hunt", true, "Programming", 540);
        items[3] = new Magazine("National Geographic", " National Geographic Society", true, 125, "July 2026");
        items[4] = new Magazine("Forbes", "Forbes Media", false, 87, "July 2024");

        displayAllItems(items);


        scanner.close();
    }

    public static void displayAllItems(LibraryItem[] libraryItems) {
        System.out.println("==== All Library Items ====");
        System.out.println();
        for (int i = 0; i < libraryItems.length; i++) {
            System.out.println((i + 1) + ".");
            libraryItems[i].displayItem();
            System.out.println();
        }
    }


}
