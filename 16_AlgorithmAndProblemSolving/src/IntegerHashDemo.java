public class IntegerHashDemo {
    public static void main(String[] args) {
        int x = 10;

        //Identity function
        System.out.println("Identity h(10) = " + x);
        //Modulo, p =7
        int p = 7;
        System.out.println("Modulo h(10) with p=7 : " + (x % p));
        //Modulo, p =10
        p = 10;
        System.out.println("Modulo h(10) with p=10: " + (x % p));
    }
}
