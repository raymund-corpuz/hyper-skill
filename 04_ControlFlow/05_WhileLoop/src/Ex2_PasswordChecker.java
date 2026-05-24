import java.util.Scanner;

public class Ex2_PasswordChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = "";
        String password = "java123";

        System.out.println("Project Name:  Password Checker");
        System.out.println();


        while (!password.equals(input)) {

            System.out.print("Enter Password: ");
            input = scanner.next();

            if (password.equals(input)) {
                System.out.println("Access Granted🎉🎉🎉");
            } else {
                System.out.println("Incorrect Password❌");
                System.out.println();
                System.out.println("Enter Password: \"java123\"");
                System.out.println("Try again...😭😭😭");
            }
        }

    }
}
