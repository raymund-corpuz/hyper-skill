public class S1_SortAscendingOrder {
    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5, 10, 6};
        boolean broken = false;

        System.out.println("Sample: Sort Ascending Order");
        System.out.println();

        System.out.println("Number: " + numbers[0]);
        for (int i = 1; i < numbers.length; i++) {
            System.out.println("Number: " + numbers[i]);
            if (numbers[i] < numbers[i - 1]) {
                broken = true;
                break;
            }
        }

        if (broken) {
            System.out.println("BROKEN");
        } else {
            System.out.println("OK");
        }
        System.out.println();
        System.out.println("End Of Program...");
    }
}
