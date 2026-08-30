
import java.util.Scanner;

public class AreYouHere {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers1 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] numbers2 = {81, 72, 64, 56, 47, 36, 28, 18, 9};

        System.out.println("Project Name:  Are You Here?");
        System.out.println();

        areUHere(numbers1, numbers2);
    }

    public static boolean areUHere(int[] arr1, int[] arr2) {
        for (int i = 0; i < arr1.length; i++) {
            int element1 = arr1[i];
            for (int j = 0; j < arr2.length; j++) {
                int element2 = arr2[j];

                if (element1 == element2) {
                    System.out.println("Element 1 : " + arr1[i] + "\nand Element 2 : " + arr2[j] + "\nare the same.✅");
                    return true;
                }
            }
        }
        System.out.println("Element 1 and Element 2  are Not Same.❌");
        return false;
    }
}
