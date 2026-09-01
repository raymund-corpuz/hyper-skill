package recursion;


import java.util.ArrayList;
import java.util.List;

public class Factorial {
    public static void main(String[] args) {
        List<Long> results = new ArrayList<>();

        for (long i = 0; i < 10; i++) {
            results.add(i * 2);
        }

        System.out.println("Project Name: Recursion");
        System.out.println();
        System.out.println("Original Result Array: " + results);
        System.out.println();
        System.out.println("Recursion Result: ");
        for (int i = 0; i < results.size(); i++) {
            System.out.println("Recursion: " + factorial(results.get(i)));
        }


    }

    public static long factorial(long n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return (long) n * factorial(n - 1);
        }
    }
}
