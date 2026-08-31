import java.util.List;

public class EfficientSearch {
    public static void main(String[] args) {

        int[] arr = {31, 32, 33, 34, 35, 36};
        System.out.println("Project Name: Efficient Search");
        System.out.println();
        System.out.println("Efficient Search Result: " + efficientSearch(arr, 36));

    }

    public static int efficientSearch(int[] arr, int target) {
        int minIndex = 0;
        int maxIndex = arr.length - 1;

        while (minIndex <= maxIndex) {
            int mid = minIndex + (maxIndex - minIndex) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                minIndex = mid + 1;
            } else {
                maxIndex = mid - 1;
            }
        }
        return -1;
    }
}
