package Practice;

public class P_4 {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 3, 7 }; // 3 appears at index 2 and 5
        int target = 3;
        System.out.println("First index of " + target + ": " + firstIndex(arr, 0, target));
        System.out.println("Last index of " + target + ": " + lastIndex(arr, arr.length - 1, target));

        // Test palindrome checker
        System.out.println("\nPalindrome Tests:");
        System.out.println("Is 121 a palindrome? " + pallindrom(121));
        System.out.println("Is 123 a palindrome? " + pallindrom(123));
        System.out.println("Is 12321 a palindrome? " + pallindrom(12321));
        System.out.println("Is 1234 a palindrome? " + pallindrom(1234));
        System.out.println("Is 1 a palindrome? " + pallindrom(1));

        // Product of All Elements in an Array
        System.out.println("Product of array: " + productArr(arr, 0));

        // Test string sorted alphabetically
        System.out.println("\nString Sorted Alphabetically Tests:");
        System.out.println("Is 'abc' sorted? " + stringSortedAlpha("abc", 0));
        System.out.println("Is 'abz' sorted? " + stringSortedAlpha("abz", 0));
        System.out.println("Is 'bac' sorted? " + stringSortedAlpha("bac", 0));
        System.out.println("Is 'aabbcc' sorted? " + stringSortedAlpha("aabbcc", 0));
        System.out.println("Is 'xyz' sorted? " + stringSortedAlpha("xyz", 0));

        // count zero
        System.out.println("Zeros in 10203: " + countZero(10203, 0));

        // Sum of even numbers in array
        System.out.println("\nSum of even numbers in array: " + sumEvenNumArr(arr, 0, 0));

        // Test replace character
        System.out.println("\nReplace Character Tests:");
        System.out.println("Replace 'l' with 'x' in 'hello': " + replaceChar("hello", 'l', 'x'));
        System.out.println("Replace 'a' with 'o' in 'banana': " + replaceChar("banana", 'a', 'o'));
        System.out.println("Replace 'o' with 'e' in 'good': " + replaceChar("good", 'o', 'e'));
        System.out.println("Replace 's' with 'z' in 'mississippi': " + replaceChar("mississippi", 's', 'z'));
    }

    static int firstIndex(int[] arr, int index, int target) {
        if (index == arr.length) {
            return -1;

        }
        if (arr[index] == target) {
            return index;
        }
        return firstIndex(arr, index + 1, target);
    }

    static int lastIndex(int[] arr, int index, int target) {
        // Base case: if we've gone past the beginning of the array
        if (index < 0) {
            return -1;
        }
        // If current element matches, return this index
        if (arr[index] == target) {
            return index;
        }
        // Search backwards
        return lastIndex(arr, index - 1, target);
    }

    static boolean pallindrom(int n) {
        return n == reverse(n, 0);
    }

    static int reverse(int n, int reversed) {
        if (n == 0) {
            return reversed;
        }
        return reverse(n / 10, reversed * 10 + n % 10);
    }

    static int productArr(int[] arr, int index) {
        if (index == arr.length) {
            return 1;
        }

        return arr[index] * productArr(arr, index + 1);
    }

    static boolean stringSortedAlpha(String str, int index) {
        // Base case: if we've reached the second-to-last character, string is sorted
        if (index == str.length() - 1) {
            return true;
        }
        if (str.charAt(index) > str.charAt(index + 1)) {
            return false;
        }
        return stringSortedAlpha(str, index + 1);
    }

    static int countZero(int n, int index) {
        if (n == 0) {
            return index; // Return the accumulated count, not 0
        }

        if (n % 10 == 0) {
            return countZero(n / 10, index + 1);
        }
        return countZero(n / 10, index);
    }

    static int sumEvenNumArr(int[] arr, int index, int n) {
        // Base case: if we've reached the end of the array
        if (index == arr.length) {
            return n;
        }

        // If current element is even, add it to sum
        if (arr[index] % 2 == 0) {
            return sumEvenNumArr(arr, index + 1, n + arr[index]);
        }
        // If odd, skip it
        return sumEvenNumArr(arr, index + 1, n);
    }

    /**
     * Replace all occurrences of a character in a string recursively
     * 
     * @param str         - the input string
     * @param target      - the character to replace
     * @param replacement - the character to replace with
     * @param index       - current position in the string
     * @return new string with all occurrences replaced
     */
    static String replaceChar(String str, char target, char replacement, int index) {
        // Base case: if we've processed the entire string
        if (index == str.length()) {
            return "";
        }

        // Get the current character
        char currentChar = str.charAt(index);

        // If current character matches target, replace it
        if (currentChar == target) {
            return replacement + replaceChar(str, target, replacement, index + 1);
        } else {
            // Otherwise, keep the character as is
            return currentChar + replaceChar(str, target, replacement, index + 1);
        }
    }

    // Overloaded method for easier calling (starts at index 0)
    static String replaceChar(String str, char target, char replacement) {
        return replaceChar(str, target, replacement, 0);
    }

}
