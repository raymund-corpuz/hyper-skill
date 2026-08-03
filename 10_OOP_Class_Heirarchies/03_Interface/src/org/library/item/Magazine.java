package org.library.item;

import org.library.interfaces.Borrowable;

public class Magazine extends LibraryItem implements Borrowable {
    protected int issueNumber;
    protected String month;

    public Magazine(String title, String author, boolean isAvailable, int issueNumber, String month) {
        super(title, author, isAvailable);
        this.issueNumber = issueNumber;
        this.month = month;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Issue Number: " + issueNumber);
        System.out.println("Month: " + month);
    }

    @Override
    public void borrow() {
        if (!isAvailable) {
            System.out.println("Sorry, the Magazine is not available.😔");
            return;
        }
        isAvailable = false;
        System.out.println("Magazine successfully borrowed.✅");
    }

    @Override
    public void returnItem() {
        isAvailable = true;
        System.out.println("Magazine returned successfully. ✅");
    }
    //getters & Setters

    public int getIssueNumber() {
        return issueNumber;
    }

    public void setIssueNumber(int issueNumber) {
        this.issueNumber = issueNumber;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }
}
