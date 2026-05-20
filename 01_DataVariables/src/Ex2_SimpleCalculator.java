import java.util.Scanner;

public class Ex2_SimpleCalculator {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Project Name: Simple Calculator");
        System.out.println();

        System.out.println("Enter First Number: ");
        int firstNum = scanner.nextInt();

        System.out.println("Enter Second Number: ");
        int secondNum = scanner.nextInt();

        int sum = firstNum + secondNum;
        int difference = firstNum - secondNum;
        int product = firstNum * secondNum;
        int quotient = firstNum /secondNum;

        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);
        System.out.println("End of Program...");
        scanner.close();

    }

}
