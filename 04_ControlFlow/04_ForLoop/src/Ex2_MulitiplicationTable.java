import java.util.Scanner;
public class Ex2_MulitiplicationTable {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int number;
        int result;

        System.out.println("Project Name: Multiplication Table");
        System.out.println();
        System.out.print("Enter a Number: ");
        number = scanner.nextInt();

        for(int i = 1; i <= 10; i++){
            result = number * i;
            System.out.println(number + " * " + i + " = " + result);
        }
        System.out.println("End Of Program...");
        scanner.close();
    }
}
