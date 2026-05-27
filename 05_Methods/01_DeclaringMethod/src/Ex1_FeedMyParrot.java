import java.util.Scanner;

public class Ex1_FeedMyParrot {
    
    public static int countSeeds(int weight, int age) {
        return weight / 5 + age;
    }

    public static void printSeeds(int seeds) {
        System.out.println();
        System.out.println("Give your parrot " + seeds + "g of seeds per day.");
    }

    public static void addSeeds(int parrotPortion, int portion) {
        parrotPortion += portion;
        System.out.println("The increased portion is " + parrotPortion);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int parrotWeight;
        int parrotAge;
        int portion;
        System.out.println("Project Name: Feed My Parrot");
        System.out.println();

        System.out.print("Enter Parrot Weight: ");
        parrotWeight = scanner.nextInt();
        System.out.print("Enter Parrot Age: ");
        parrotAge = scanner.nextInt();
        System.out.print("Add Portion: ");
        portion = scanner.nextInt();

        int parrotPortion = countSeeds(parrotWeight, parrotAge);
        printSeeds(parrotPortion);
        addSeeds(parrotPortion, portion);
        System.out.println();
        System.out.println("End Of Program...");
        scanner.close();
    }
}


