import java.util.Scanner;
public class SalaryBonusCalculator {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String employeeName;
        int salary;
        int yearsOfService;
        int minimumSalary = 30000;
        int bonus = 5000;

        System.out.println("Project Name: Salary Bonus Calculator");
        System.out.println("Enter Employee Name: ");
        employeeName = scanner.nextLine();
        System.out.println("Enter Salary: ");
        salary = scanner.nextInt();
        System.out.println("Enter Years Of Service: ");
        yearsOfService = scanner.nextInt();


        if(salary < minimumSalary && yearsOfService >= 5){
            System.out.println("You are qualified for Bonus🎉 : true");
            int finalSalary = salary + bonus;
            System.out.println("Final Salary : " + finalSalary);
        }else{
            System.out.println("You are not Qualified for Bonus❌");
            System.out.println("Years of Service is less than 5 Years");
        }
        System.out.println("End of Program...");
        scanner.close();
    }

}
