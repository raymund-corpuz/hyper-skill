import java.util.Scanner;
public class Ex3_VotingEligibilityChecker {
    public static void main(String[] args){

        int age;
        String result;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Project Name:  Voting Eligibility Checker");
        System.out.println();
        System.out.print("Enter age: ");
        age = scanner.nextInt();
        result = age >= 18 ? "Eligible to vote": "Not Eligible to vote";

        System.out.println(result);
        System.out.println("End of Program...");
        scanner.close();
    }
}
