import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Project Name: BMI Calculator");
        double weight;
        double height;
        double bmi;

        System.out.println("Enter Weight in Kilograms: ");
        weight = scanner.nextDouble();
        System.out.println("Enter Height in meters: ");
        height = scanner.nextDouble();

        bmi = weight/(height * height);
        System.out.printf("Your BMI is: %.2f" ,bmi);
        scanner.close();
    }
}
