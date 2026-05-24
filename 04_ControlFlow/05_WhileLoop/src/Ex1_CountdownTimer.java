public class Ex1_CountdownTimer {
    public static void main(String[] args) {

        System.out.println("Project Name: Countdown Timer");
        System.out.println();
        int max = 10;
        int min = 0;
        while (max >= min) {
            System.out.println("Countdown: " + max);
            max--;
        }
        System.out.println("Boom💥💥💥");
    }
}
