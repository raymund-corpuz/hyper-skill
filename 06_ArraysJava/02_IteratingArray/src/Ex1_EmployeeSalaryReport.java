public class Ex1_EmployeeSalaryReport {
    public static void main(String[] args) {
        int[] employeeSalaries = {25_000, 30_000, 28_000, 35_000, 27_000};
        int num = 1;
        int sum = 0;
        int highest = employeeSalaries[0];
        int lowest = employeeSalaries[0];

        System.out.println("Project Name: Employee Salary Report");
        System.out.println();
        System.out.println("==== EMPLOYEE SALARY REPORT ====");
        System.out.println();

        for (int salary : employeeSalaries) {
            System.out.println("Employee " + num + " Salary: " + salary);
            num++;
        }
        System.out.println();

        for (int i = 0; i < employeeSalaries.length; i++) {
            sum += employeeSalaries[i];

            if (highest <= employeeSalaries[i]) {
                highest = employeeSalaries[i];
            }

            if (lowest >= employeeSalaries[i]) {
                lowest = employeeSalaries[i];
            }
        }

        System.out.println("Total Salary Payout: " + sum);
        System.out.println("Highest Salary: " + highest);
        System.out.println("Lowest Salary: " + lowest);

    }
}
