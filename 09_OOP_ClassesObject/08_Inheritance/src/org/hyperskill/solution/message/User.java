package org.hyperskill.solution.message;

public class User extends Person {
    private String username;

    public User(String name, int age, String username) {
        super(name, age);
        this.username = username;
    }

    public String getUsername() {
        return username;
    }
}
