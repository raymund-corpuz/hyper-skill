import java.util.HashMap;

public class HashTableDemo {
    public static void main(String[] args) {
        HashMap<String, String> phoneBook = new HashMap<>();

        phoneBook.put("Tim Black", "0123456789");
        phoneBook.put("Tom Black", "9876543210");

        //Instead of scanning the whole list, Java jumps straight to the right
        //spot using the hash.
        System.out.println("Tim's number: " + phoneBook.get("Tim Black"));
        System.out.println("Tom's number: " + phoneBook.get("Tom Black"));

    }
}
