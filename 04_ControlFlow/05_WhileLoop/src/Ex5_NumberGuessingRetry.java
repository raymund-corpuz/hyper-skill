import java.util.Scanner;

public class Ex5_NumberGuessingRetry {
    public static void main(String[] args) {

        int guess;
        int correct = 7;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Project Name: Number Guessing Retry");
        System.out.println();

        do {
            System.out.print("Enter a number: ");
            guess = scanner.nextInt();
            if (guess != correct) {
                System.out.println("Try Again:😭😭😭");
                System.out.println();
            } else {
                System.out.println("Correct Answer:🎉🎉🎉");
                System.out.println();
            }
        } while (guess != correct);

        System.out.println("End Of Program...");
        scanner.close();
    }
}
