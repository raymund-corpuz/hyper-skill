import java.util.Scanner;

public class Ex2_TemperatureStatus {
    public static void main(String[] args){

        int temperature;
        String status;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Project Name: Temperature Status");
        System.out.println();
        System.out.print("Enter Temperature: ");
        temperature = scanner.nextInt();

        status = temperature >= 30 ? "Hot": "Cold";

        System.out.println("Weather: " + status);
        scanner.close();
    }
}
