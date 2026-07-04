package org.hyperskill.solution.message;

public class Message {
    private String sender;
    private String receiver;
    private String content;
    private boolean isRead;


    public Message(String sender, String receiver, String content) {
        this.sender = sender;
        this.receiver = receiver;
        this.content = content;
        this.isRead = false;
    }

    public String displayMessage() {
        return "From: " + sender +
                "\n To: " + receiver +
                "\n Content: " + content +
                "\n Status: " + (isRead ? "Read" : "Unread");
    }

    public boolean markAsRead() {
        return this.isRead = true;
    }

    public String editMessage(String newMessage) {
        return this.content = newMessage;
    }
}
