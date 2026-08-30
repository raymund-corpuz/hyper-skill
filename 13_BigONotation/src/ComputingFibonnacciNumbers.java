import java.util.ArrayList;
import java.util.List;

public class ComputingFibonnacciNumbers {

    public static void main(String[] args) {
        System.out.println("Project Name: Fibonacci Numbers");
        System.out.println();
        List myresult = generateFib(21);
        if (myresult == null) {
            System.out.println("List is Empty.❌");
        }
        System.out.println(myresult);
    }

    static List<Integer> generateFib(int num) {
        List<Integer> result = new ArrayList<>();

        for (int i = 1; i <= num; i++) {
            if (i == 1) {
                result.add(0);
            } else if (i == 2) {
                result.add(1);
            } else {
                result.add(result.get(i - 2) + result.get(i - 3));
            }
        }

        return result;
    }
}
