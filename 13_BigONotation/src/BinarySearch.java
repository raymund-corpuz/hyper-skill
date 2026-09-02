public class BinarySearch {
    public static void main(String[] args) {
        int[] nums = {2, 4, 6, 7, 8, 9};

        System.out.println("Project Binary Search: ");
        System.out.println();
        System.out.println("Binary Search: " + findTarget(nums, 8));

    }

    //steps: create a function that accepts array and target
    public static int findTarget(int[] arr, int target) {
        //get the startIndex and the lastIndex
        int startIndex = 0;
        int lastIndex = arr[arr.length - 1]; // Zero Index
        //get the midIndex by adding the start and end then div by 2
        int midIndex = (startIndex + lastIndex) / 2;

        while (startIndex < lastIndex) {
            //if the target isequal to mid => return value
            if (arr[midIndex] == target) {
                return midIndex;
            } else if (arr[midIndex] < target) {
                //else if the target < mid => mid +1
                startIndex = midIndex + 1;
            } else {
                lastIndex = midIndex - 1;
            }
        }
        return -1;

    }


    //else mid -1
    //none of the above return -1
}