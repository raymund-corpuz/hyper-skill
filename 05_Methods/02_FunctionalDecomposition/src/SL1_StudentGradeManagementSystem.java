import java.util.Scanner;

public class SL1_StudentGradeManagementSystem {
    public static void main(String[] args) {
        System.out.println("Project Name: Student Grade Management System");
        System.out.println();
        displayReport();
        System.out.println();
        System.out.println("End Of Program");
    }

    public static int[] inputGrades(Scanner scanner) {
        int[] grades = new int[3];
        System.out.print("Math: ");
        grades[0] = scanner.nextInt();
        System.out.print("Science: ");
        grades[1] = scanner.nextInt();
        System.out.print("English: ");
        grades[2] = scanner.nextInt();

        return grades;
    }

    public static double calculateAverage(int math, int science, int english) {
        return (double) (math + science + english) / 3;
    }

    public static String getRemarks(double average) {
        if (average >= 95) {
            return "Excellent";
        } else if (average >= 75) {
            return "Passed";
        }
        return "Failed";
    }

    public static void displayReport() {
        Scanner scanner = new Scanner(System.in);
        String name;
        System.out.print("Enter name: ");
        name = scanner.nextLine();
        name = Character.toUpperCase(name.charAt(0)) + name.substring(1);
        System.out.println();
        int[] grades = inputGrades(scanner);
        double average = calculateAverage(grades[0], grades[1], grades[2]);
        String remarks = getRemarks(average);
        System.out.println();
        System.out.println(" ===== Student Grade =======");
        System.out.println("Student: " + name);
        System.out.println();
        System.out.println("Math: " + grades[0]);
        System.out.println("Science: " + grades[1]);
        System.out.println("English: " + grades[2]);
        System.out.println();

        System.out.println("Average: " + average);
        System.out.println("Remarks: " + remarks);

        scanner.close();
    }

}
