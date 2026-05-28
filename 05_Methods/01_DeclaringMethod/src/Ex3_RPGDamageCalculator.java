import java.util.Scanner;

public class Ex3_RPGDamageCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int attack, defense;

        System.out.println("Project Name: RPG Damage Calculator");
        System.out.println();
        System.out.print("Attack: ");
        attack = scanner.nextInt();
        System.out.print("Defense: ");
        defense = scanner.nextInt();
        System.out.println();
        System.out.println("Final Damage: " + finalDamage(attack, defense));
        System.out.println();
        System.out.println("End Of Program...");
        scanner.close();
    }

    public static double finalDamage(int attack, int defence) {
        if (attack <= 0 || defence < 0) {
            System.out.println("Invalid attack or defense value❌");
            return 0;
        }
        return attack - (defence * 0.25);
    }

}
