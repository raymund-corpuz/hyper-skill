public class LoggingErrors {
    public static void main(String[] args){
        System.out.println("Project Name:  Unexpected Results");
        System.out.println("main() started");
        count(1, 10);
        System.out.println("main() completed");
    }

    public static void count(int start, int to){
        System.out.println("count() started");
        while(start < to){
            System.out.println(start);
            start++;
        }
        System.out.println("count() completed");
    }
}
