package org.library.item;

public class Book extends LibraryItem {
    protected String category;
    protected int numberOfPages;

    public Book(String title, String author, boolean available, String category, int numberOfPages) {
        super(title, author, available);
        this.category = category;
        this.numberOfPages = numberOfPages;

    }

    @Override
    public void displayItem() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Available: " + (available ? "Available" : "Not Available"));
        System.out.println("Category: " + category);
        System.out.println("Number Of Pages: " + numberOfPages);
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }
}
