import java.util.Arrays;
import java.util.Scanner;

public class S2_ReadStandardInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int len;
        int[] array;
        System.out.println("Sample 2: Read Standard Input");
        System.out.println();
        System.out.print("Enter array size: ");
        len = scanner.nextInt();
        array = new int[len];

        for (int i = 0; i < len; i++) {
            System.out.print("Enter a value " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(array));
        System.out.println();
        System.out.println("End Of Program...");
    }


}
