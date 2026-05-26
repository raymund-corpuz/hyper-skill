import java.util.Scanner;

public class Ex1_StopNegativeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        System.out.println("Project Name: Stop Negative Number");
        System.out.println();

        while (true) {
            System.out.print("Enter a number: ");
            num = scanner.nextInt();
            if (num >= 0) {
                System.out.println("You entered: " + num);
            } else {
                System.out.println("Program Stopped");
                System.out.println();
                break;
            }
            System.out.println();
        }

        System.out.println("End Of Program...");
        scanner.close();
    }
}
