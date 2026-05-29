import java.util.Scanner;

public class Ex1_StudentGradeManagementSystem {
    //main method()
    public static void main(String[] args) {
        System.out.println("Project Name: Student Grade Management System");
        System.out.println();
        displayReport();
        System.out.println("End Of Program...");
    }

    //inputGrade()
    public static void inputGrades() {
        int math, science, english;
        String name;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        name = scanner.nextLine();
        System.out.print("Math: ");
        math = scanner.nextInt();
        System.out.print("Science: ");
        science = scanner.nextInt();
        System.out.print("English: ");
        english = scanner.nextInt();

        double average = calculateAverage(math, science, english);
        System.out.println();
        System.out.println("Average: " + average);
        System.out.println("Remarks: " + getRemarks(average));

        scanner.close();
    }

    //calculateAverage()
    public static double calculateAverage(int math, int science, int english) {
        return (double) (math + science + english) / 3;
    }

    //getRemarks()
    public static String getRemarks(double average) {
        if (average >= 90) {
            return "Excellent";
        } else if (average >= 75) {
            return "Passed";
        } else {
            return "Failed";
        }
    }

    //displayReport()
    public static void displayReport() {
        inputGrades();

    }
}
