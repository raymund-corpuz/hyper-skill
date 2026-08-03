package org.library.item;

import org.library.interfaces.Borrowable;

public class Book extends LibraryItem implements Borrowable {
    protected String category;
    protected int numberOfPages;

    public Book(String title, String author, boolean isAvailable, String category, int numberOfPages) {
        super(title, author, isAvailable);
        this.category = category;
        this.numberOfPages = numberOfPages;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Category: " + category);
        System.out.println("Number of Pages: " + numberOfPages);
    }

    @Override
    public void borrow() {
        if (!isAvailable) {
            System.out.println("Sorry, the Book is not available 😔");
            return;
        }
        isAvailable = false;
        System.out.println("Book borrowed successfully. ✅");
    }

    @Override
    public void returnItem() {
        isAvailable = true;
        System.out.println("Book returned successfully. ✅");
    }

    //getters & setters

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }
}
