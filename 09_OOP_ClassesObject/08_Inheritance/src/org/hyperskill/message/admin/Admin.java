package org.hyperskill.message.admin;

import org.hyperskill.message.Message;
import org.hyperskill.message.Person;

public class Admin extends Person {
    private String department;

    public Admin(String name, int age, String department) {
        super(name, age);
        this.department = department;
    }

    public String getDepartment() {
        return this.department;
    }

    @Override
    public String displayProfile() {
        return "==== ADMIN PROFILE ====\n" +
                "Name: " + getName() +
                "\nAge: " + getAge() +
                "\nDepartment: " + department;
    }

    // Delete a message
    public void deleteMessage(Message[] messages, int index) {

        if (index < 0 || index >= messages.length) {
            System.out.println("Invalid Message ❌");
            return;
        }

        if (messages[index] == null) {
            System.out.println("Message Already Deleted ❌");
            return;
        }
        messages[index] = null;
        System.out.println("Message Deleted Successfully ✅");
    }

}
