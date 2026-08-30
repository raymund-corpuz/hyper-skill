import java.util.Scanner;

public class Search {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] arr = {"Apple", "Banana", "Mango", "Water Melon"};

        boolean running = true;
        while (running) {
            System.out.print("Enter Search Item: ");
            String item = scanner.nextLine();
            running = nativeSearch(arr, item);
        }
    }

    static boolean nativeSearch(String[] arr, String item) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equalsIgnoreCase(item)) {
                System.out.println("Perfect Match.✅ ");
                return false;
            }
        }
        System.out.println("Try Again: Item Not Found.❌");
        return true;
    }
}
