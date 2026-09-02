package exercise.secondexe;

import java.util.Arrays;

public class CountVowel {
    public static void main(String[] args) {

        System.out.println("Vowels Counted: " + countVowels("raymund corpuz"));
    }

    /*
       accept the word then turn it or split it into an array
       iterate over the array and if a single letter = "a,e,i,o,u"
       add to counted variable  and return if none is found return -1
        */
    public static int countVowels(String word) {


        String[] wordArray = word.split("");
        String[] vowelArray = {"a", "e", "i", "o", "u"};
        int counted = 0;

        System.out.println("Word is Split: " + Arrays.toString(wordArray));
        for (int i = 0; i < wordArray.length; i++) {
            for (int j = 0; j < vowelArray.length; j++) {
                if (wordArray[i].equalsIgnoreCase(vowelArray[j])) {
                    counted++;
                }
            }
        }
        if (counted == 0) {
            return -1;
        }
        return counted;
    }
}
