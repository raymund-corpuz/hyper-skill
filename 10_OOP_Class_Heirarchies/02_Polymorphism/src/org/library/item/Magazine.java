package org.library.item;

public class Magazine extends LibraryItem {
    protected int issueNumber;
    protected String month;

    public Magazine(String title, String author, boolean available, int issueNumber, String month) {
        super(title, author, available);
        this.issueNumber = issueNumber;
        this.month = month;
    }

    @Override
    public void displayItem() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Available: " + (available ? "Available" : "Not Available"));
        System.out.println("Issue Number: " + issueNumber);
        System.out.println("Month: " + month);

    }

    public int getIssueNumber() {
        return issueNumber;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public void setIssueNumber(int issueNumber) {
        this.issueNumber = issueNumber;
    }
}
