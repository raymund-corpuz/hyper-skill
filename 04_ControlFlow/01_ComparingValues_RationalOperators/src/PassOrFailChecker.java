import java.util.Scanner;
public class PassOrFailChecker {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int grade;

        System.out.println("Project Name: Pass or Fail Checker");
        System.out.println("Enter your grade: ");
        grade = scanner.nextInt();

        if(grade >= 90 && grade <= 100 ){
            System.out.println("Excellent: " + grade);
        }else if(grade >= 80 && grade <= 89){
            System.out.println("Good: " + grade);
        }else if(grade >= 75 && grade <= 79){
            System.out.println("Average: " + grade);
        }else if(grade < 75){
            System.out.println("You're failed");
        }

        System.out.println("End of Program...");
        scanner.close();
    }
}
