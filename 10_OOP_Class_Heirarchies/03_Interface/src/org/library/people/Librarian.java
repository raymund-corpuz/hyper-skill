package org.library.people;

public class Librarian extends Person {
    protected boolean isApprove;

    public Librarian(String name, int age, boolean isApprove) {
        super(name, age);
        this.isApprove = isApprove;
    }

    //getters & Setters
    @Override
    public void displayProfile() {
        super.displayProfile();
        System.out.println("Approved : " + (isApprove ? "True" : "False"));
    }

    public boolean isApprove() {
        return isApprove;
    }

    public void setApprove(boolean approve) {
        isApprove = approve;
    }
}
