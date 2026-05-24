public class Ex5_NestedMultiplicationTable {
    public static void main(String[] args){

        int start = 0;
        int end = 9;

        for(int i = 0; i <= end; i++ ){
            for(int j = 1; j <=end; j++ ){
                System.out.print(i * j + " ");
            }
            System.out.println();
        }
        System.out.println("End Of Program...");
    }
}
