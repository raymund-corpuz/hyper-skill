public class Ex2_SkipEvenNumbers {
    public static void main(String[] args) {

        System.out.println("Project Name: Skip Even Numbers");
        System.out.println();

        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0) {
                continue;
            }
            System.out.println("Printing: " + i);
        }
        System.out.println();
        System.out.println("End Of Program...");
    }
}
