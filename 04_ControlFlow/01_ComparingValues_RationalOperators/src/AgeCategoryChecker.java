import java.util.Scanner;
public class AgeCategoryChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age;

        System.out.println("Project Name: Age Category Checker");
        System.out.println();
        System.out.println("Enter your age: ");
        age = scanner.nextInt();

        if(age <= 12 && age > 0){
            System.out.println("You are a child");
        }else if(age <= 17 && age >= 13){
            System.out.println("You are a teenager");
        }else if(age <= 59 && age >= 18){
            System.out.println("You are an adult");
        }else if(age >= 60){
            System.out.println("You are a senior");
        }

        System.out.println("End of Program...");
        scanner.close();
    }
}
