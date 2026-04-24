package Practice;

public class P_6 {
    public static void main(String[] args) {
        String s = "karan";
        P_6 obj = new P_6();
        System.out.println(obj.function(s, 0));

        int[] arr = { 1, 2, 3, 4, 5 };
        System.out.println("array sum is : " + obj.arrSum(arr, 0));

        s = "car";
        System.out.println("Is '" + s + "' a palindrome? " + obj.pallindromeString(s, 0, s.length() - 1));

        System.out.println("Minimum element in array: " + obj.minArr(arr, 0));
        System.out.println("Count of even numbers: " + obj.countEvenNumArr(arr, 0));
        System.out.println("Last index of 3: " + obj.lastIndex(arr, arr.length - 1, 3));

    }

    public int function(String s, int index) {
        if (index >= s.length()) {
            return 0;
        }
        if (index == 2) {
            return 1 + function(s, index + 1);
        }
        // Count this character (1) + count remaining characters
        return 1 + function(s, index + 1);
    }

    public int arrSum(int[] arr, int index) {
        if (index == arr.length) {
            return 0;
        }

        return arr[index] + arrSum(arr, index + 1);

    }

    public boolean pallindromeString(String s, int left, int right) {
        // Base case: if pointers meet or cross, it's a palindrome
        if (left >= right) {
            return true;
        }

        // If characters don't match, not a palindrome
        if (s.charAt(left) != s.charAt(right)) {
            return false;
        }

        // Check the next pair of characters
        return pallindromeString(s, left + 1, right - 1);
    }

    public int minArr(int[] arr, int index) {
        if (index == arr.length - 1) {
            return arr[index];
        }

        return Math.min(arr[index], minArr(arr, index + 1));

    }

    public int countEvenNumArr(int[] arr, int index) {
        // Base case: reached end of array
        if (index == arr.length) {
            return 0;
        }

        // Check if current element is even
        if (arr[index] % 2 == 0) {
            // Count this even number (1) + count from rest of array
            return 1 + countEvenNumArr(arr, index + 1);
        } else {
            // Skip odd number, just count from rest of array
            return countEvenNumArr(arr, index + 1);
        }
    }

    public int lastIndex(int[] arr, int index, int target) {
        // Base case: if we've gone past the beginning, element not found
        if (index < 0) {
            return -1;
        }

        // Check current position - if it matches, this is the last occurrence
        if (arr[index] == target) {
            return index;
        }

        // Continue searching backwards
        return lastIndex(arr, index - 1, target);
    }

}
