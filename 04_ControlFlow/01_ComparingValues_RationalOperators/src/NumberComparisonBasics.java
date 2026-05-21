import java.util.Scanner;

public class NumberComparisonBasics {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int num1;
        int num2;

        System.out.println("Project Name: Number Comparison Basics");
        System.out.print("Enter first number: ");
        num1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        num2 = scanner.nextInt();

        if(num1 > num2){
            System.out.println(num1 + " is greater than " + num2);
        }else if(num1 < num2){
            System.out.println(num1 + " is less than " + num2);
        }else if(num1 == num2){
            System.out.println(num1 + " is equal to " + num2);
        }
    }
}
