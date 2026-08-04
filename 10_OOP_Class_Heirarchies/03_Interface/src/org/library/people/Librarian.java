package org.library.people;

public class Librarian extends Person {
    protected boolean isLibrarian;

    public Librarian(String name, int age, boolean isLibrarian) {
        super(name, age);
        this.isLibrarian = isLibrarian;
    }

    //getters & Setters
    @Override
    public void displayProfile() {
        super.displayProfile();
        System.out.println("Librarian : " + (isLibrarian ? "True" : "False"));
    }

    public boolean libraryItemApproved() {
        return this.isLibrarian = true;
    }

    public boolean isLibrarian() {
        return isLibrarian;
    }

    public void setApprove(boolean approve) {
        isLibrarian = approve;
    }
}
