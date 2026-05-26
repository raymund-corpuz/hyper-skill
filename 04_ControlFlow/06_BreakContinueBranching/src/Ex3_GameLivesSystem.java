import java.util.Scanner;

public class Ex3_GameLivesSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lives = 0;
        int score;

        System.out.println("Project Name: Game Lives System");
        System.out.println();

        while (lives < 5) {
            System.out.print("Enter score: ");
            score = scanner.nextInt();

            if (score <= 0) {
                System.out.println("🚫Invalid score skipped: " + score);
                continue;
            }

            if (score == 100) {
                System.out.println("🎉Perfect Score! " + score);
                break;
            }
            ;
            lives++;
            System.out.println("✅Score Recorded: " + score);
            System.out.println("Remaining Lives: " + (5 - lives));
        }
        scanner.close();
    }
}
