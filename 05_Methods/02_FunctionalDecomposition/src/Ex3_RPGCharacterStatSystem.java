import java.util.Scanner;

public class Ex3_RPGCharacterStatSystem {

    public static void main(String[] args) {
        System.out.println("Project Name: RPG Character Stat System");
        System.out.println();
        displayCharacterStats();
        System.out.println("End Of Program...");
    }

    public static int[] inputCharacterStats(Scanner scanner) {
        int[] stats = new int[4];

        System.out.print("Enter Base Attack: ");
        stats[0] = scanner.nextInt();
        System.out.print("Enter Weapon Damage: ");
        stats[1] = scanner.nextInt();
        System.out.print("Enter Armor: ");
        stats[2] = scanner.nextInt();
        System.out.print("Enter Level: ");
        stats[3] = scanner.nextInt();

        return stats;
    }

    public static int calculateAttack(int baseAttack, int weaponDamage) {
        return baseAttack + weaponDamage;
    }

    public static int calculateDefense(int armor, int level) {
        return armor + (level * 2);
    }

    public static double calculateCriticalDamage(int attackPower) {
        return attackPower * 1.5;
    }

    public static void displayCharacterStats() {
        Scanner scanner = new Scanner(System.in);

        int[] stats = inputCharacterStats(scanner);
        int attackPower = calculateAttack(stats[0], stats[1]);
        int defenseRating = calculateDefense(stats[2], stats[3]);
        double criticalDamage = calculateCriticalDamage(attackPower);

        System.out.println();
        System.out.println("==== CHARACTER STATS ====");
        System.out.println();
        System.out.println("Attack Power: " + attackPower);
        System.out.println("Defense Rating: " + defenseRating);
        System.out.println("Critical Damage: " + criticalDamage);
        System.out.println();

        scanner.close();
    }
}
