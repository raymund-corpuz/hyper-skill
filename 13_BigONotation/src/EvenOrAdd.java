import java.util.Scanner;

public class EvenOrAdd {
    public static void main() {

        Scanner sc = new Scanner(System.in);
        boolean running = true;
        while (running) {
            System.out.print("Enter a Number: ");
            int number = sc.nextInt();
            running = isEven(number);
            System.out.println();
        }
        sc.close();
    }

    public static boolean isEven(int value) {
        if (value % 2 == 0) {
            System.out.println("Even Number: " + value);
            return true;
        } else {
            System.out.println("Odd Number: " + value);
            System.out.println("End Of Program...");
            return false;
        }
    }
}
