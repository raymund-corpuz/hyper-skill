package exercise.secondexe;

public class Correct_CountVowel {
    public static void main(String[] args) {
        System.out.println("Project Name: Count Vowels");
        String word = "rhythm";
        System.out.println("Vowels Counted: " + countVowels(word));

    }

    public static int countVowels(String word) {
        if (word == null) {
            return 0;
        }

        int counted = 0;
        String lowerWord = word.toLowerCase();

        for (int i = 0; i < lowerWord.length(); i++) {
            char ch = lowerWord.charAt(i);

            switch (ch) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    counted++;
                    break;
                default:
                    break;
            }
        }
        return counted;

    }
}
