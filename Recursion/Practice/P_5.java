package Practice;

public class P_5 {
    public static void main(String[] args) {
        String s = "AEIOU";
        P_5 obj = new P_5();
        int result = obj.countVowels(s, 0);
        System.out.println("Number of vowels: " + result);
    }

    public int countVowels(String s, int index) {
        // Base case: reached end of string
        if (index >= s.length()) {
            return 0;
        }

        // Get current character and convert to lowercase for easier comparison
        char currentChar = Character.toLowerCase(s.charAt(index));

        // Check if current character is a vowel
        if (currentChar == 'a' || currentChar == 'e' || currentChar == 'i' ||
                currentChar == 'o' || currentChar == 'u') {
            // If vowel, add 1 and continue with rest of string
            return 1 + countVowels(s, index + 1);
        } else {
            // If not vowel, add 0 and continue with rest of string
            return 0 + countVowels(s, index + 1);
        }
    }

}
