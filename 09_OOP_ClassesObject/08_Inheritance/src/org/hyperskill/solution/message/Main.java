package org.hyperskill.solution.message;

import org.hyperskill.solution.message.Message;
import org.hyperskill.solution.message.Admin;
import org.hyperskill.solution.message.User;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        User[] users = new User[5];
        Admin admin = new Admin("James", 40, "IT Department");
        Message[] messages = new Message[5];

        users[0] = new User("Raymund", 31, "raymund123");
        users[1] = new User("Alice", 24, "alice24");
        users[2] = new User("John", 28, "john_dev");
        users[3] = new User("Sophia", 22, "sophia");
        users[4] = new User("Michael", 35, "mike35");

        messages[0] = new Message(
                "raymund123",
                "alice24",
                "Good morning! Ready for today's meeting?"
        );

        messages[1] = new Message(
                "alice24",
                "raymund123",
                "Yes! I'll be there in 10 minutes."
        );

        messages[2] = new Message(
                "john_dev",
                "mike35",
                "Can you review my Java project?"
        );

        messages[3] = new Message(
                "sophia",
                "john_dev",
                "Happy Birthday! 🎉"
        );

        messages[4] = new Message(
                "mike35",
                "raymund123",
                "The deployment was successful."
        );

        displayUsers(users);
        displayMessages(messages);
        Message selectedMessage = selectMessage(scanner, messages);
        if (selectedMessage == null) {
            return;
        }
        System.out.println();
        displayMenu();
        System.out.println();
        processMenu(scanner, selectedMessage, messages, admin);

        scanner.close();
    }

    public static void displayUsers(User[] users) {
        System.out.println("==== USERS ====");
        System.out.println();
        for (int i = 0; i < users.length; i++) {
            System.out.println((i + 1) + ". " + users[i].getUsername());
        }
    }

    public static void displayMessages(Message[] messages) {
        System.out.println("==== MESSAGES ====");
        System.out.println();
        for (int i = 0; i < messages.length; i++) {
            System.out.println((i + 1) + ". " + messages[i].displayMessage());
            System.out.println();
        }
    }

    public static Message selectMessage(Scanner scanner, Message[] messages) {
        System.out.print("Choose Message: ");
        int selectedMessage = scanner.nextInt() - 1;
        if (selectedMessage < 0 || selectedMessage >= messages.length) {
            System.out.println("Invalid Selected Message ❌");
            return null;
        }
        return messages[selectedMessage];

    }

    public static void displayMenu() {
        System.out.println("==== MESSAGE MENU ====");
        System.out.println("1 - Read Message");
        System.out.println("2 - Edit Message");
        System.out.println("3 - Delete Message");
        System.out.println("4 - Display Message");
        System.out.println("5 - Exit");
        System.out.println();
    }

    public static void processMenu(Scanner scanner, Message selectedMessage, Message[] message, Admin admin) {
        System.out.print("Choose Action: ");
        int action = scanner.nextInt();
        scanner.nextLine();

        switch (action) {
            case 1:
                selectedMessage.markAsRead();
                System.out.println();
                System.out.println(selectedMessage.displayMessage());
                break;
            case 2:
                System.out.print("Enter New Message: ");
                String newMessage = scanner.nextLine();
                selectedMessage.editMessage(newMessage);
                System.out.println();
                System.out.println(selectedMessage.displayMessage());
                System.out.println("Message Updated Successfully ✅");
                System.out.println();
                break;
            case 3:
                int index = findMessageIndex(selectedMessage, message);
                if (index != -1) {
                    admin.deleteMessage(message, index);
                }
                break;
            case 4:
                System.out.println(selectedMessage.displayMessage());
                break;
            case 5:
                System.out.println("Exiting Program...");
                break;
            default:
                System.out.println("Invalid Action ❌");
                break;

        }
    }

    public static int findMessageIndex(Message selectedMessage, Message[] message) {
        int index;
        for (int i = 0; i < message.length; i++) {
            if (selectedMessage == message[i]) {
                return index = i;
            }
        }
        return -1;

    }
}
