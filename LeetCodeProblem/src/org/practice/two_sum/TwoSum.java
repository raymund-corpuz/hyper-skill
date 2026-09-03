package org.practice.two_sum;

import java.lang.reflect.Array;
import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        System.out.println("Project Name: Two Sum");

        int[] num1 = {3, 3};
        int target = 6;

        System.out.println("Output: " + Arrays.toString(twoSum(num1, target)));
    }

    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];

        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = 1; j < nums.length; j++) {
                int sum = nums[i] + nums[j];

                if (sum == target) {
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }

        return result;
    }
}
