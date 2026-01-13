public class quick {
    public static void main(String[] args) {
        int[] arr = { 9, 8, 7, 6, 5 };
        int n = arr.length;

        System.out.println("Original Array:");
        printArray(arr);

        quickSort(arr, 0, n - 1);

        System.out.println("\nSorted Array:");
        printArray(arr);
    }

    // Main QuickSort recursive function
    public static void quickSort(int[] arr, int lo, int hi) {
        if (lo < hi) {
            // Partition the array and get the pivot index
            int pivotIndex = partition(arr, lo, hi);

            // Recursively sort elements before and after partition
            quickSort(arr, lo, pivotIndex - 1); // Left subarray
            quickSort(arr, pivotIndex + 1, hi); // Right subarray
        }
    }

    // Partition function - places pivot in correct position
    public static int partition(int[] arr, int lo, int hi) {
        int pivot = arr[hi]; // Choose last element as pivot
        int i = lo - 1; // Index of smaller element

        // Rearrange array: elements smaller than pivot go to left
        for (int j = lo; j < hi; j++) {
            if (arr[j] < pivot) {
                i++;
                // Swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Place pivot in its correct position
        i++;
        int temp = arr[i];
        arr[i] = arr[hi];
        arr[hi] = temp;

        return i; // Return pivot index
    }

    // Helper function to print array
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
