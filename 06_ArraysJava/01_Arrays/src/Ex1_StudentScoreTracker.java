import java.util.Scanner;

public class Ex1_StudentScoreTracker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] scoreArray = new int[5];
        int score;

        System.out.println("Project Name: Student Score Tracker");
        System.out.println();

        for (int i = 0; i <= scoreArray.length - 1; i++) {
            System.out.print("Enter Score " + (i + 1) + ": ");
            score = scanner.nextInt();
            scoreArray[i] = score;
        }

        int highest = scoreArray[0];
        int lowest = scoreArray[0];
        double average = 0;

        System.out.println();
        System.out.println("==== STUDENT SCORES ====");
        System.out.println();

        for (int i = 0; i <= scoreArray.length - 1; i++) {
            if (highest <= scoreArray[i]) {
                highest = scoreArray[i];
            }
            if (lowest >= scoreArray[i]) {
                lowest = scoreArray[i];
            }
            average += scoreArray[i];
        }
     
        System.out.println();
        System.out.println("Highest Score: " + highest);
        System.out.println("Lowest Score: " + lowest);
        System.out.println("Average Score: " + average / scoreArray.length);
        System.out.println();
        System.out.println("End Of Program...");

        scanner.close();
    }
}
