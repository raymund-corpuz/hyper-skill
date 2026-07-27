package org.library.item;

public class LibraryItem {
    protected String title;
    protected String author;
    protected boolean available;

    public LibraryItem(String title, String author, boolean available) {
        this.title = title;
        this.author = author;
        this.available = available;
    }

    public void displayItem() {
        System.out.println("==== Display Item ====");
        System.out.println();
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Available: " + (available ? "Available" : "Not Available"));
    }

    //Getters & Setters

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
}
