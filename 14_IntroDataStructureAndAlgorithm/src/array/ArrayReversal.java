package array;

public class ArrayReversal {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 5, 6, 7, 8, 9};

        System.out.println("Project Name: ArrayReverse");
        System.out.println();
        System.out.println("Original: ");
        printArray(nums);
        arrayReverse(nums);
        System.out.println("Reverse: ");
        printArray(nums);
    }

    public static void arrayReverse(int[] nums) {

        if (nums == null || nums.length <= 1) {
            return;
        }

        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
    }

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
