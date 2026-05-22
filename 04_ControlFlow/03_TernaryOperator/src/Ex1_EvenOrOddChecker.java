import java.util.Scanner;

public class Ex1_EvenOrOddChecker {
    public static void main(String[] args){
        int num;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Project Name: Even Or Odd Checker");
        System.out.println();
        System.out.print("Enter a number: ");
        num = scanner.nextInt();

        String result = num % 2 == 0 ? "Even": "odd";

        System.out.println(num + " is " + result);
        System.out.println("End of Program...");
        scanner.close();
    }
}
