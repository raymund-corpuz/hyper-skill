public class Ex3_RPGAttackDamageOverload {
    public static void main(String[] args) {
        System.out.println("Project Name: RPG Attack Damage Overload");
        System.out.println();
        System.out.println("Normal Damage: " + attackDamage(100));
        System.out.println("Critical damage: " + attackDamage(100, 1.5));
        System.out.println("Weapon Bonus Damage: " + attackDamage(100, 75));
        System.out.println();
        System.out.println("End Of Program...");
    }


    public static int attackDamage(int attack) {
        System.out.println("Normal Attack");
        return attack;
    }

    public static double attackDamage(int attack, double criticalMultiplier) {
        return attack * criticalMultiplier;
    }

    public static int attackDamage(int attack, int weaponBonus) {
        return attack + weaponBonus;
    }
}
