
public class Insertion {
    public static void main(String[] args) {
        int[] arr = { 9, 8, 7, 6, 5 };
        int n = arr.length;

        // Insertion Sort Algorithm
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;

            // Move elements greater than key one position ahead
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }

        // Print the sorted array
        System.out.println("Sorted array (using Insertion Sort):");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

}
