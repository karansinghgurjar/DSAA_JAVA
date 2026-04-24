package Practice;

import java.util.Scanner;

public class P_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.print("Enter how many times to print the name: ");
        // int n = sc.nextInt();

        int[] arr = { 0, 1, 2, 3 };
        // printArr(arr, 0);

        // System.out.println("reverses numbers are: " + revNum(1234, 0));
        // System.out.println("Fibonacci series:" + fib(6));

        //max array
        System.out.println(maxEtArr(arr, 0));

        //palindrome string
        String s = "madam";
        System.out.println(pallindromeString(s, 0, s.length() - 1));

        //sorted Array
        System.out.println(arrSorted(arr, 0));

    }

    static int revNum(int n, int rev) {
        if (n == 0) {
            return rev;
        }
        return revNum(n / 10, rev * 10 + (n % 10));

    }

    static int fib(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        return fib(n - 1) + fib(n - 2);
    }

    static void printArr(int[] arr, int index) {
        if (index == arr.length) {
            return;
        }
        System.out.println(arr[index]);
        printArr(arr, index + 1);

    }

    static int maxEtArr(int[] arr, int index) {
        if (index == arr.length - 1) {
            return arr[index];
        }

        int maxFromRest = maxEtArr(arr, index + 1);
        return Math.max(arr[index], maxFromRest);

    }

    static boolean pallindromeString(String s, int start, int end) {
        if (start >= end) {
            return true;
        }

        if (s.charAt(start) != s.charAt(end)) {
            return false;
        }

        return pallindromeString(s, start + 1, end - 1);
    }


    static boolean  arrSorted(int[] arr, int index){
        if(index == arr.length - 1){
            return true;
        }

        if(arr[index] > arr[index + 1]){
            return false;
        }

        return arrSorted(arr, index + 1);
    }

}
