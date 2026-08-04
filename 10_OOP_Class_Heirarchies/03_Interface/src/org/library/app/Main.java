package org.library.app;

import org.library.item.Book;
import org.library.item.LibraryItem;
import org.library.item.Magazine;
import org.library.people.Librarian;
import org.library.people.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Raymund", 30));
        persons.add(new Librarian("George", 28, true));
        persons.add(new Person("Alice", 25));

        List<LibraryItem> items = new ArrayList<>();
        items.add(new Book("The Hobbit", "J.R.R. Tolkein", true, "Fantasy", 309));
        items.add(new Book("Harry Potter", "J.K. Rowling", false, "Adventure", 509));
        items.add(new Book("Miriam Webster's Dictionary", "Miriam", true, "Dictionary", 1080));
        items.add(new Magazine("Ford Mustang", "Ford Enterprices", false, 109202, "July 2026"));
        items.add(new Magazine("East Asia", "Emerates", true, 1282910, "April 2023"));


        displayItems(items);
        addItem(items, scanner);
        displayItems(items);
        updateItem(items, scanner);
        displayItems(items);


        scanner.close();
    }

    //Display items
    public static void displayItems(List<LibraryItem> items) {
        System.out.println("==== Library Items ====");
        System.out.println();
        for (int i = 0; i < items.size(); i++) {
            System.out.println((i + 1) + ". ");
            items.get(i).displayInfo();
            System.out.println();
        }
    }

    //Add Item
    public static void addItem(List<LibraryItem> items, Scanner scanner) {
        System.out.println("==== Add Item ====");
        System.out.println();
        System.out.print("Title: ");
        String addTitle = scanner.nextLine();
        System.out.print("Author: ");
        String addAuthor = scanner.nextLine();
        System.out.println("Book or Magazine");
        String addType = scanner.nextLine();

        if (addType.equalsIgnoreCase("Book")) {
            System.out.print("Category: ");
            String addCategory = scanner.nextLine();
            System.out.print("Number of Pages: ");
            int addNumberOfPages = scanner.nextInt();

            LibraryItem addBook = new Book(addTitle, addAuthor, true, addCategory, addNumberOfPages);
            items.add(addBook);
            System.out.println("Successfully Added New Book ✅");

        } else if (addType.equalsIgnoreCase("Magazine")) {
            System.out.print("Issue Number: ");
            int addIssueNumber = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Month: ");
            String addMonth = scanner.nextLine();

            LibraryItem addMagazine = new Magazine(addTitle, addAuthor, true, addIssueNumber, addMonth);
            items.add(addMagazine);
            System.out.println("Successfully Added New Magazine ✅");
        } else {
            System.out.println("Unknown Type: Item Not Added");
        }
    }

    //Update Item
    public static void updateItem(List<LibraryItem> items, Scanner scanner) {
        System.out.print("Choose an Item: ");
        int choice = scanner.nextInt() - 1;
        System.out.println();
        scanner.nextLine();
        if (choice < 0 || choice >= items.size()) {
            System.out.println("Item is Not Found ❌");
            return;
        }
        for (int i = 0; i < items.size(); i++) {
            if (choice == i) {
                System.out.println("==== Update Item ====");
                System.out.println();
                System.out.print("Title: ");
                String updateTitle = scanner.nextLine();
                System.out.print("Author: ");
                String updateAuthor = scanner.nextLine();
                System.out.println("Available: ");
                boolean updateAvailable = scanner.nextBoolean();
                scanner.nextLine();
                if (items.get(i).getClass().getSimpleName().equalsIgnoreCase("Book")) {
                    System.out.print("Category: ");
                    String updateCategory = scanner.nextLine();
                    System.out.print("Number of Pages: ");
                    int updateNumberOfPages = scanner.nextInt();

                    LibraryItem updateBook = new Book(updateTitle, updateAuthor, updateAvailable, updateCategory, updateNumberOfPages);
                    items.set(i, updateBook);
                } else if (items.get(i).getClass().getSimpleName().equalsIgnoreCase("Magazine")) {
                    System.out.print("Issue Number: ");
                    int updateIssueNumber = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Month: ");
                    String updateMonth = scanner.nextLine();

                    LibraryItem updateMagazine = new Magazine(updateTitle, updateAuthor, updateAvailable, updateIssueNumber, updateMonth);

                    items.set(i, updateMagazine);
                } else {
                    System.out.println("Category Type: Not Found");
                }
            }
        }


    }
    //Delete Item
    //Borrow Item
    //Return Item
    //View Borrow Record

}
