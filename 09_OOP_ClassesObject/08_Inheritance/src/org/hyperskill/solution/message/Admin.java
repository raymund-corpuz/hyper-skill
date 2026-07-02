package org.hyperskill.solution.message;

public class Admin extends Person {
    private String department;

    public Admin(String name, int age, String department) {
        super(name, age);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    @Override
    public String displayProfile() {
        return "Name: " + getName() +
                "\nAge: " + getAge() +
                "\nDepartment: " + getDepartment();
    }

    public void deleteMessage(Message[] messages, int index) {
        if (index < 0 || index >= messages.length) {
            System.out.println("Invalid Message ❌");
            return;
        }

        if (messages[index] == null) {
            System.out.println("Message Already Deleted ❌");
        }

        messages[index] = null;
        System.out.println("Message Deleted Successfully ✅");
    }
}
