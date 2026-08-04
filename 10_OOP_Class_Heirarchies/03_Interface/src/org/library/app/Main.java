package org.library.app;

import org.library.item.Book;
import org.library.item.LibraryItem;
import org.library.item.Magazine;
import org.library.people.Librarian;
import org.library.people.Person;
import org.library.record.BorrowRecord;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        Scanner scanner = new Scanner(System.in);
        BorrowRecord record = null;

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

        displayAllPerson(persons);
        Person borrower = selectPerson(persons, scanner);
        if (borrower == null) {
            return;
        }
        displayItems(items);
        addItem(items, scanner);
        displayItems(items);
        updateItem(items, scanner);
        displayItems(items);
        deleteItem(items, scanner);
        displayItems(items);
        LibraryItem borrowedItem = borrowItem(items, scanner);
        BorrowRecord myRecord = new BorrowRecord(borrower.getName(), borrowedItem.getTitle(), borrowedItem.getAuthor(), borrowedItem.getClass().getSimpleName(), today);
        viewBorrowRecord(myRecord);
        returnItem(items, scanner);
        scanner.close();
    }

    public static void displayAllPerson(List<Person> persons) {
        System.out.println("==== Users ====");
        System.out.println();
        for (int i = 0; i < persons.size(); i++) {
            System.out.println((i + 1) + ". ");
            persons.get(i).displayProfile();
            System.out.println();
        }
    }

    //Select Person
    public static Person selectPerson(List<Person> persons, Scanner scanner) {
        System.out.print("Choose User: ");
        int user = scanner.nextInt() - 1;
        scanner.nextLine();

        if (user < 0 || user >= persons.size()) {
            System.out.println("User Not Found: ");
            return null;
        }
        return persons.get(user);
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
            scanner.nextLine();

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
        System.out.println("==== Update Item ====");
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
    public static void deleteItem(List<LibraryItem> items, Scanner scanner) {
        System.out.println("==== Delete Item ====");
        System.out.print("Choice to Delete: ");
        int deleteItem = scanner.nextInt() - 1;
        scanner.nextLine();
        if (deleteItem < 0 || deleteItem >= items.size()) {
            System.out.println("Item Not Found ❌");
            return;
        }
        System.out.print("Are you sure you want to delete? Yes / No: ");
        String answer = scanner.nextLine();
        if (answer.equalsIgnoreCase("Yes")) {
            for (int i = 0; i < items.size(); i++) {
                if (i == deleteItem) {
                    items.remove(i);
                }
            }
            System.out.println("Successfully Deleted ✅");
        } else if (answer.equalsIgnoreCase("No")) {
            System.out.println("Delete is Canceled ✅");
            return;
        }
    }

    //Borrow Item
    public static LibraryItem borrowItem(List<LibraryItem> items, Scanner scanner) {
        System.out.println("==== Borrow Item ====");
        System.out.print("Enter borrow item: ");
        int borrowSomeItem = scanner.nextInt() - 1;
        scanner.nextLine();
        if (borrowSomeItem < 0 || borrowSomeItem >= items.size()) {
            System.out.println("Borrow Item Not Found. ❌");
            return null;
        }

        LibraryItem chosenItem = items.get(borrowSomeItem);

        if (!chosenItem.isAvailable()) {
            System.out.println("Item is already borrowed. ❌");
            return null;
        }
        chosenItem.borrow();
        return chosenItem;
    }
    //Return Item

    public static void returnItem(List<LibraryItem> items, Scanner scanner) {
        System.out.println("==== Return Item ====");
        System.out.print("Enter return item: ");
        int choice = scanner.nextInt() - 1;
        scanner.nextLine();

        if (choice < 0 || choice >= items.size()) {
            System.out.println("Return Item Not Found.❌");
            return;
        }

        LibraryItem chosenItem = items.get(choice);

        if (chosenItem.isAvailable()) {
            System.out.println("Library Item already returned.");
            return;
        }
        chosenItem.returnItem();
    }
    //View Borrow Record

    public static void viewBorrowRecord(BorrowRecord record) {
        System.out.println("==== View Borrowed Record ====");
        System.out.println();
        System.out.println("Borrower's Name: " + record.borrowerName());
        System.out.println("Title: " + record.title());
        System.out.println("Author: " + record.author());
        System.out.println("Category: " + record.category());
        System.out.println("Date Borrowed: " + record.issueDate());
        System.out.println();
    }


}
