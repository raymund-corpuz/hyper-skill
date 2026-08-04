package org.library.item;


import org.library.interfaces.Borrowable;

public class LibraryItem implements Borrowable {
    protected String title;
    protected String author;
    protected boolean isAvailable;


    public LibraryItem(String title, String author, boolean isAvailable) {
        this.title = title;
        this.author = author;
        this.isAvailable = isAvailable;
    }

    public void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Available: " + (isAvailable ? "Available" : "Not Available"));
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    @Override
    public void borrow() {
        if (!isAvailable) {
            System.out.println("Sorry, the Book / Magazine is not available 😔");
            return;
        }
        isAvailable = false;
        System.out.println("Book / Magazine borrowed successfully. ✅");
    }

    @Override
    public void returnItem() {
        isAvailable = true;
        System.out.println("Book / Magazine returned successfully. ✅");
    }
}
