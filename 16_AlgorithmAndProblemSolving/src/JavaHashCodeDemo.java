public class JavaHashCodeDemo {
    public static void main(String[] args) {
        String a = "Tim Black";
        String b = "Tom Black";
        String c = "Tim Black";
        System.out.println("Project Name: Java Hash Code Demo");
        System.out.println();

        System.out.println("Hash of a: " + a.hashCode());
        System.out.println("Hash of b: " + b.hashCode());
        System.out.println("Hash of c: " + c.hashCode());
    }
}
