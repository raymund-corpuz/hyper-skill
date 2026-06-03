public class Ex1_StudentGradeAnalyzer {
    public static void main(String[] args) {
        int[] grades = {90, 85, 88, 95, 80};
        System.out.println("Project Name: Student Grade Analyzer");
        System.out.println();
        displayGrades(grades);
        System.out.println();
        System.out.println("End Of Program...");
    }

    public static double calculateAverage(int[] grades) {
        double sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return sum / grades.length;
    }

    public static int findHighestGrade(int[] grades) {
        int highest = grades[0];
        for (int i = 0; i < grades.length; i++) {
            if (highest < grades[i]) {
                highest = grades[i];
            }
        }
        return highest;
    }

    public static void displayGrades(int[] grades) {
        for (int grade : grades) {
            System.out.println("Your grades: " + grade);
        }
        System.out.println();
        System.out.println("Highest Grade: " + findHighestGrade(grades));
        System.out.println("Average Grade: " + calculateAverage(grades));
    }

}
