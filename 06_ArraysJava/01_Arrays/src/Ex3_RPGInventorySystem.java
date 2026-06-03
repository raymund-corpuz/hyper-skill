import java.util.Scanner;

public class Ex3_RPGInventorySystem {
    public static void main(String[] args) {
        String[] weapons = {"Sword", "Shield", "Potion", "Empty Slot", "Empty Slot"};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Project Name: RPG Inventory System");
        System.out.println();
        displayInventory(weapons);
        System.out.println();
        updateInventory(scanner, weapons);
        System.out.println("End Of Program...");
    }

    public static void updateInventory(Scanner scanner, String[] weapons) {
        int slot;
        String newWeapon;
        System.out.print("Choose Slot to Replace: ");
        slot = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter New Item: ");
        newWeapon = scanner.nextLine();

        weapons[slot - 1] = newWeapon;
        displayInventory(weapons);
        System.out.println();
    }

    public static void displayInventory(String[] weapons) {

        System.out.println("==== UPDATE INVENTORY ====");
        System.out.println();
        for (int i = 0; i < weapons.length; i++) {
            System.out.println("Slot " + (i + 1) + ": " + weapons[i]);
        }
    }
}
