import java.util.Scanner;

public class Doubler {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Project Name: Double Array Number");
        System.out.println();

        int[] arr = {1, 2, 4, 5, 6, 8, 9};

        doubleArrayValues(arr);
    }

    static int[] doubleArrayValues(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            System.out.println("Number " + i + ": " + (arr[i] *= 2));
        }
        return arr;
    }
}
