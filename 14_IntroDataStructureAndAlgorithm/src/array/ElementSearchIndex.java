package array;

public class ElementSearchIndex {
    public static void main(String[] args) {
        int[] numbers = new int[]{10, 20, 30, 400, 200, 100, 3};

        System.out.println("Max : " + maximum(numbers));
        System.out.println("Min : " + minimum(numbers));
        System.out.println("Average: " + average(numbers));

    }

    public static int maximum(int[] numbers) {
        int max = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (max < numbers[i]) {
                max = numbers[i];
            }
        }
        return max;
    }

    public static int minimum(int[] numbers) {
        int min = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (min > numbers[i]) {
                min = numbers[i];
            }
        }
        return min;
    }

    public static int average(int[] numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        return sum / numbers.length;
    }
}
