package org.library.item;

public class Magazine extends LibraryItem {
    protected int issueNumber;
    protected String month;

    public Magazine(String title, String author, boolean available, int issueNumber, String month) {
        super(title, author, available);
        this.issueNumber = issueNumber;
        this.month = month;
    }
}
