public class SimpleHashDemo {
    public static void main(String[] args) {
        System.out.println("Project Name: Simple Hash Demo ");
        System.out.println();
        System.out.println("John Smith : " + hash("John Smith"));
        System.out.println("Tim Black : " + hash("Tim Black"));
        System.out.println("Tom Black : " + hash("Tom Black"));

    }

    public static String hash(String name) {
        return name.replaceAll("[aeiouAEIOU]", "");
    }
}
