
public class Ex1_CalculatorOverloadSystem {
    public static void main(String[] args) {


        System.out.println("Project Name: Calculator Overload System");
        System.out.println();
        System.out.println("Sum of 2 Integers: " + calculate(90, 180));
        System.out.println("Sum of 2 Doubles: " + calculate(90.0, 270.0));
        System.out.println("Sum of 3 Integers: " + calculate(5, 5, 5));
        System.out.println();
        System.out.println("End Of Program...");
    }

    public static int calculate(int a, int b) {
        return a + b;
    }

    public static double calculate(double a, double b) {
        return a + b;
    }

    public static int calculate(int a, int b, int c) {
        return a + b + c;
    }
}
