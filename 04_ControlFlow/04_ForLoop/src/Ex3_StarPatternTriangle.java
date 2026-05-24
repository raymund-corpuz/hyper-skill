public class Ex3_StarPatternTriangle {
    public static void main(String[] args){

        String result = " ";
        System.out.println("Project Name: Star Pattern Triangle");
        System.out.println();

        for(int i = 0; i < 5; i++){
           for(int j = 1; j < i; j++){
               result = result +"*";
               System.out.print(result);
               System.out.println();
           }
        }
    }
}
