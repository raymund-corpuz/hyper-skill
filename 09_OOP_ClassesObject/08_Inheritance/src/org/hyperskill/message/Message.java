package org.hyperskill.message;

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

    //Getters
    public String getSender() {
        return sender;
    }

    public String getReceiver() {
        return receiver;
    }

    public String getContent() {
        return content;
    }

    public boolean getIsRead() {
        return isRead;
    }

    //Display Message
    String displayMessage() {
        return "From: " + sender +
                "\nTo: " + receiver +
                "\nMessage: " + content +
                "\nStatus: " + (isRead ? "Read" : "Unread");
    }

    //Mark as Read
    void markAsRead() {
        isRead = true;
        System.out.println("Message Opened ✅");
    }

    //Edit Message
    void editMessage(String newContent) {
        content = newContent;
        System.out.println("Message Updated Successfully ✅");
    }


}
