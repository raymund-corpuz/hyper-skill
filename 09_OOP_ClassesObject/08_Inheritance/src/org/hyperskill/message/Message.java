package org.hyperskill.message;

public class Message {
    private String sender;
    private String receiver;
    private String content;
    private boolean isRead;

    protected Message(String sender, String receiver, String content) {
        this.sender = sender;
        this.receiver = receiver;
        this.content = content;
        this.isRead = false;
    }

    String displayMessage() {
        return this.content;
    }

    boolean markAsRead() {
        return this.isRead = true;
    }

    String editMessage(String newContent) {
        return this.content = newContent;
    }
}
