import java.util.Scanner;

public class MovieTicketCalculator {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int ticketPrice = 250;
        int numberOfTickets;
        double studentDiscount =  20.00/100;
        int totalPrice;
        double finalPrice;


        System.out.println("Project Name: Movie Ticket Calculator");
        System.out.println("Ticket Price: " + ticketPrice);
        System.out.println("Enter Number of Tickets you want to buy: ");
        numberOfTickets = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Are you a Student: Yes / No");
        String student = scanner.nextLine();

        boolean isStudent = "yes".equalsIgnoreCase(student);
        totalPrice = ticketPrice * numberOfTickets;
        finalPrice = totalPrice-(totalPrice * studentDiscount);

        if(isStudent){
            System.out.println("Total: " + totalPrice);
            System.out.println("Final Price: " + finalPrice);
        }else{
            System.out.println("Total: " + totalPrice);
        }
        System.out.println("End of Program...");
        scanner.close();
    }
}
