import java.util.Scanner;
public class Ex1_PersonalInformation {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Project Title: Personal Information Printer");
        System.out.println();

        System.out.println("What is your name?");
        String name = scanner.nextLine();

        System.out.println("What is your age?");
        int age = scanner.nextInt();

        System.out.println("What is your height?");
        double height = scanner.nextDouble();

        scanner.nextLine();
        System.out.println("Are you a student?");
        String student = scanner.nextLine();



        System.out.println("Print Result:");
        System.out.println("Name: " + name);
        System.out.println("Age: "+ age);
        System.out.println("Height: " + height);

        boolean isStudent = "yes".equalsIgnoreCase(student);

        if(isStudent){
            System.out.println("Student: " + true);
        }
        else{
            System.out.println("Student: " + false);
        }

        scanner.close();
    }
}
