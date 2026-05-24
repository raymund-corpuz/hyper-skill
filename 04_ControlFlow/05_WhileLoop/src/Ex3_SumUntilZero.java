import java.util.Scanner;

public class Ex3_SumUntilZero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num;
        int sum = 0;

        System.out.println("Project Name: Sum Until Zero");
        System.out.println();

        while (true) {
            System.out.println("Enter a Number: ");
            num = scanner.nextInt();

            if (num == 0) {
                break;
            }
            sum += num;
            System.out.println("Total Sum: " + sum);
        }
        System.out.println("Total Sum: " + sum);
    }
}
