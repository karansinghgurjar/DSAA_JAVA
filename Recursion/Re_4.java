
import java.util.Scanner;

public class Re_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Get array length from user
        System.out.print("Enter the length of the array: ");
        int length = sc.nextInt();

        // Get array elements from user
        int arr[] = new int[length];
        System.out.println("Enter " + length + " elements:");
        for (int i = 0; i < length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("\nOriginal array:");
        printArray(arr);

        reverseArr(arr, 0, arr.length - 1);

        System.out.println("Reversed array:");
        printArray(arr);

        System.out.println();

        // Check if a number is palindrome
        System.out.print("Enter a number to check if it's a palindrome: ");
        int num = sc.nextInt();
        boolean isPalindrome = numberPalindrome(num);
        System.out.println(num + " is palindrome: " + isPalindrome);

        System.out.println();

        // Check if a string is palindrome
        System.out.print("Enter a string to check if it's a palindrome: ");
        sc.nextLine(); // Consume the newline left by nextInt()
        String str = sc.nextLine();
        boolean isStrPalindrome = stringPallindrome(str, 0, str.length());
        System.out.println("\"" + str + "\" is palindrome: " + isStrPalindrome);

        sc.close();
    }

    static void reverseArr(int[] arr, int i, int n) {
        if (i >= n) {
            return;
        }

        // swap elements
        swap(arr, i, n);

        // recursive call
        reverseArr(arr, i + 1, n - 1);
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    static boolean stringPallindrome(String s, int i, int n) {
        if (i >= n / 2) {
            return true; // Successfully checked all positions
        }
        if (s.charAt(i) != s.charAt(n - i - 1)) {
            return false; // Characters don't match
        }
        return stringPallindrome(s, i + 1, n); // Recursive call with all parameters
    }

    static boolean numberPalindrome(int num) {
        String numStr = String.valueOf(num);
        return stringPallindrome(numStr, 0, numStr.length());
    }

}
