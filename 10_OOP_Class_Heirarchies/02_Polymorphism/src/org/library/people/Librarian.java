package org.library.people;

public class Librarian extends Person {
    protected String employeeId;
    protected String section;

    public Librarian(String name, int age, String employeeId, String section) {
        super(name, age);
        this.employeeId = employeeId;
        this.section = section;
    }

    @Override
    public void displayProfile() {
        System.out.println("==== Librarian Profile ====");
        System.out.println();
        System.out.println("Name        : " + name);
        System.out.println("Age         : " + age);
        System.out.println("Employee Id : " + employeeId);
        System.out.println("Section     : " + section);
        System.out.println();
    }

    public void borrowItem() {
        System.out.println("Approving item borrowing...✅");
    }

    //Getters & Setters

    public String getEmployeeId() {
        return employeeId;
    }

    public String getSection() {
        return section;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public void setSection(String section) {
        this.section = section;
    }
}
