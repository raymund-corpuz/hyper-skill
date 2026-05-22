import java.util.Scanner;

public class EX3_RPGBattleDecisionSystem {
    static void main(String[] args) {
        int playerHealth;
        int enemyDistance;
        int numOfPotions;
        String result = "";

        Scanner  scanner = new Scanner(System.in);
        System.out.println("Project Name: RPG Battle Decision System");
        System.out.println();
        System.out.print("Enter Player Health: ");
        playerHealth = scanner.nextInt();
        System.out.print("Enter Enemy Distance: ");
        enemyDistance = scanner.nextInt();
        System.out.print("Enter Number of Potions: ");
        numOfPotions = scanner.nextInt();

        if(playerHealth <= 30  && numOfPotions > 0){
            result = "Use Potion";
        }else if(enemyDistance <= 5){
            result = "Attack Enemy";
        }else if(enemyDistance > 5){
            result = "Move Closer";
        }else if (playerHealth <= 30 && numOfPotions == 0){
            result = "Retreat";
        }

        System.out.println("Action: "+ result);
    }
}
