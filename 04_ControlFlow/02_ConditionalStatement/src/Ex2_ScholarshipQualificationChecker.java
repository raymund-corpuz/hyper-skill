import java.util.Scanner;

public class Ex2_ScholarshipQualificationChecker {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int average;
        int monthlyIncome;
        String result;

        System.out.println("Project Name: Scholarship Qualification Checker");
        System.out.println();
        System.out.println("Enter average: ");
        average = scanner.nextInt();
        System.out.println("Enter family income: ");
        monthlyIncome = scanner.nextInt();

        if(average >= 95 && monthlyIncome <=20_000){
            result = "Full Scholarship";
        }else if(average <= 94 && average >= 90 && monthlyIncome <= 30_000){
            result = "Partial Scholarship";
        }else if (average >= 85 && average <=89){
            result = "Academic Assistance";
        }else {
            result = "Not Qualified";
        }
        System.out.println("Result: " + result);
        System.out.println("End of Program...");
        scanner.close();
    }
}
