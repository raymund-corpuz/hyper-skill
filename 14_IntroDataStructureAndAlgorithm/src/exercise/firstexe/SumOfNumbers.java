package exercise.firstexe;

import java.util.Arrays;

public class SumOfNumbers {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] modified = new int[nums.length];
        System.out.println("Project Name: Sum of Numbers");
        System.out.println("Original Array: " + Arrays.toString(nums));
        for (int i = 0; i < nums.length; i++) {
            modified[i] = nums[i] * 10;
        }

        System.out.println("Modified Array: " + Arrays.toString(modified));
        System.out.println("Sum of Number: " + sumOfNumbers(modified));
    }

    public static int sumOfNumbers(int[] nums) {
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        return sum;
    }
}

