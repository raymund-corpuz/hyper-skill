import java.util.Scanner;

public class Ex3_MobileGameCharacter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int character;

        System.out.println("Project Name: Mobile Game Character");
        System.out.println();

        System.out.println("1 - Warrior");
        System.out.println("2 - Mage");
        System.out.println("3 - Assassin");
        System.out.println("4 - Archer");
        System.out.println();
        System.out.print("Choose your character: ");
        character = scanner.nextInt();
        System.out.println();

        switch (character) {
            case 1:
                System.out.println("Class: Warrior");
                System.out.println("Skill: Sledge Hammer");
                break;
            case 2:
                System.out.println("Class: Mage");
                System.out.println("Skill: Ice Crystals");
                break;
            case 3:
                System.out.println("Class:  Assassin");
                System.out.println("Skill: Shadow Strike");
                break;
            case 4:
                System.out.println("Class: Archer");
                System.out.println("Skill: Burning Arrow");
                break;
            default:
                System.out.println("Invalid Input!");
        }
        System.out.println();
        System.out.println("End Of Program...");

        scanner.close();
    }
}
