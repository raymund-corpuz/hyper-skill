import java.util.Scanner;

public class Ex4_SumOfNumbers {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int num;
        int sum = 0;

        System.out.println("Project Name: Sum Of Numbers");
        System.out.println();
        System.out.println("Enter a number: ");
        num = scanner.nextInt();

        for(int i = 1; i <=  num; i++){
            System.out.println("Result: " + sum + " + " + i + " = " + (sum + i));
            sum += i;
        }

        System.out.println("End Of Program...");
    }
}
