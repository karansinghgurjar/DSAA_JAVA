package Recurssion;

import java.util.ArrayList;

public class subsequence {
    public void printSubsequences(int index, int[] arr, ArrayList<Integer> output) {
        if (index >= arr.length) {
            System.out.println(output);
            return;
        }

        output.add(arr[index]);
        printSubsequences(index + 1, arr, output);

        output.remove(output.size() - 1);
        printSubsequences(index + 1, arr, output);
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6 };
        ArrayList<Integer> output = new ArrayList<>();

        subsequence obj = new subsequence();
        obj.printSubsequences(0, arr, output);

    }
}
