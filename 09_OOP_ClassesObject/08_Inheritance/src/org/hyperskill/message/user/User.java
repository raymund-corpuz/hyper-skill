package org.hyperskill.message.user;

import org.hyperskill.message.Message;
import org.hyperskill.message.Person;

public class User extends Person {
    private String username;

    public User(String name, int age, String username) {
        super(name, age);
        this.username = username;
    }

    @Override
    public String displayProfile() {
        return "==== USER PROFILE ====\n" +
                "Name: " + getName() +
                "\nAge: " + getAge() +
                "\nUsername: " + username;

    }

    //Send a message
    public Message sendMessage(String reciever, String content) {
        return new Message(username, reciever, content);
    }


}
