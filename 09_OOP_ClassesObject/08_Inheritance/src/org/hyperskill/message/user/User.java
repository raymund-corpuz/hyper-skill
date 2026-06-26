package org.hyperskill.message.user;

import org.hyperskill.message.Message;
import org.hyperskill.message.Person;

public class User extends Person {
    private String username;

    protected User(String name, int age, String username) {
        super(name, age);
        this.username = username;
    }

    String displayProfile() {
        return this.name + " - " + this.username;
    }

    Message sendMessage(Message message) {
        return message;
    }
}
