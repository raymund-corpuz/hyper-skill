import java.util.Scanner;

public class Ex3_StudentGradeAnalyzer {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String studentName;
        int mathSubject;
        int scienceSubject;
        int englishSubject;

        System.out.println("Project Name: Student Grade Analyzer");
        System.out.println();
        System.out.println("Student: ");
        studentName = scanner.nextLine();
        System.out.println("Math: ");
        mathSubject = scanner.nextInt();
        System.out.println("Science: ");
        scienceSubject = scanner.nextInt();
        System.out.println("English: ");
        englishSubject = scanner.nextInt();

        int average = (mathSubject + scienceSubject + englishSubject) /3;
        System.out.println("Student: "+ studentName);
        System.out.println("Average: " + average);
        if(average >=75){
            System.out.println("Passed: " + true);
        }else{
            System.out.println("Passed: " + false);
        }
        System.out.println("End of Program...");
        scanner.close();
    }
}
