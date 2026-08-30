public class CreatingPairs {
    public static void main(String[] args) {
        System.out.println("Project Name: Creating Pairs");
        System.out.println();
        int[] arr = {2, 4, 6, 8, 10};

        createPairs(arr);
    }

    static void createPairs(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.println(arr[i] + ", " + arr[j]);
            }
        }
    }
}
