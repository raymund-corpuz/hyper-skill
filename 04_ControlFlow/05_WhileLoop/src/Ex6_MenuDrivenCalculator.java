import java.util.Scanner;

public class Ex6_MenuDrivenCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //declaration
        int operation;
        int num1, num2, result = 0;

        System.out.println("Project Name: Menu Driven Calculator");
        System.out.println();
        //repeat menu until user selects 3
        do {

            //ask user for options
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Exit");
            operation = scanner.nextInt();


            System.out.print("Choose: " + operation);
            System.out.println();
            System.out.print("Enter first number: ");
            num1 = scanner.nextInt();
            System.out.print("Enter second number: ");
            num2 = scanner.nextInt();
            //perform operation
            if (operation == 1) {
                result = num1 + num2;
            } else if (operation == 2) {
                result = num1 - num2;
            }
            System.out.println("Result: " + result);
            System.out.println();
        } while (operation != 3);


        scanner.close();
    }

}
