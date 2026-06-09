package game;

public class Main {
    public static void main(String[] args) {

        Hero miya = new Hero();

        miya.name = "Miya";
        miya.health = 1_000;
        miya.attack = 150;
        miya.level = 15;

        System.out.println("Project Name: RPG Battle Module");
        System.out.println();
        System.out.println("==== RPG HEROES ====");
        System.out.println("Name: " + miya.name);
        System.out.println("Health: " + miya.health);
        System.out.println("Attack: " + miya.attack);
        System.out.println("Level: " + miya.level);
        System.out.println();
        System.out.println("End Of Program...");
    }
}
